import java.util.List;

public class LetterCounter {
    private char letter;
    private int count;

    LetterCounter(char letter) {
        this.letter = letter;
        count = 1;
    }

    public char getLetter() {
        return this.letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean comp(int index, List<LetterCounter> lister, LetterCounter other) {
        for (int i = 0; i < index; i++) {
            if (other.equals(lister.get(i))) {
                return false; //previous duplicate
            }
        }
        return true;
    }

    public int compareTo(LetterCounter other) {
        if(this.letter<other.getLetter()){
            return -1;
        }
        return 0;
    }

    public boolean equals(LetterCounter other) {
        return other.getLetter() == this.letter;
    }

    public String toString() {
        return "letter: " + this.letter + " Count: " + this.count;
    }
}
