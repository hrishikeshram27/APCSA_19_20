import java.util.*;
public class BinarySearchRunner {
    private static void searchList (List<LetterCounter> arr, char letter) {
        boolean found = false;
        int upper = arr.size(); // upper bound = half, lower bound = 0
        int lower = 0;
        int half = (upper-lower)/2;
        int compNum = 0;
        for(int i=0; i<(int)(Math.log(arr.size())/Math.log(2))+1; i++){
            if(!found){
                compNum++;
            }
            if(arr.get(half).getLetter()==letter){
                found = true;
            }else if(arr.get(half).getLetter()>letter){
                upper = half;
            }else{
                lower = half;
            }
            half = ((upper-lower)/2)+lower;
        }

        if(found){
            System.out.println("The letter is " + arr.get(half).getLetter() + " and the counter is " + arr.get(half).getCount() + " found with " + compNum + " loops");
        }else{
            System.out.println("Letter not found in array");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String letters = input.nextLine().toLowerCase().replaceAll(" ", "");
        List<LetterCounter> characters = new ArrayList<>();

        for (int i = 0; i < letters.length(); i++) {
            characters.add(new LetterCounter(letters.charAt(i)));
        }

        for (int i = 0; i < characters.size(); i++) {
            for (int j = i+1; j < characters.size(); j++) {
                if (characters.get(i).equals(characters.get(j)) && characters.get(i).comp(i, characters, characters.get(i))) { //how to prevent next duplicate letter from also counting a later duplicate
                    characters.get(i).setCount(characters.get(i).getCount() + 1);
                    characters.get(j).setCount(0);
                }
            }
        }

        List<LetterCounter> found = new ArrayList<>();
        for (LetterCounter character : characters) {
            if (character.getCount() == 0) {
                found.add(character);
            }
        }
        characters.removeAll(found);

        // bubble sort now
        for (int i = 0; i < characters.size(); i++) {
            for (int j = i+1; j<characters.size(); j++){
                if(characters.get(j).compareTo(characters.get(i))==(-1)){
                    LetterCounter temp = characters.get(i);
                    characters.set(i, characters.get(j));
                    characters.set(j, temp);
                }
            }
        }

        for (LetterCounter character : characters) {
            System.out.println(character.getLetter() + " Count " + character.getCount());
        }

        // now call binary search to look for letter
        System.out.println("Search for a character in the list: ");
        searchList(characters, input.nextLine().charAt(0));
    }
}
