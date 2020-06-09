import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Proj1WithLetterCounter {
    public static void main(String[] args) {
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

        for (LetterCounter character : characters) {
            if (character.getCount() != 0) {
                System.out.println(character.toString() + " ");
            }
        }
        input.close();
    }
}