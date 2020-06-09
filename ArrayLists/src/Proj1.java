import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Proj1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String letters = input.nextLine().toLowerCase().replaceAll(" ", "");
        List<Character> characters = new ArrayList<>(letters.length());
        List<Integer> counts = new ArrayList<>(letters.length());
        counts.addAll(Collections.nCopies(letters.length(), 0));

        for (int i = 0; i < letters.length(); i++) {
            if (!characters.contains(letters.charAt(i))) {
                characters.add(letters.charAt(i));
                counts.set(characters.size() - 1, 1);
            } else if (characters.contains(letters.charAt(i))) {
                counts.set(characters.indexOf(letters.charAt(i)), 1 + counts.get(characters.indexOf(letters.charAt(i))));
            }
        }
        while (counts.contains(0)) {
            counts.remove((Integer) 0);
        }
        for (Character character : characters) {
            System.out.print(character + " ");
        }
        System.out.print("\n");
        for (Integer count : counts) {
            System.out.print(count + " ");
        }
        input.close();
    }
}