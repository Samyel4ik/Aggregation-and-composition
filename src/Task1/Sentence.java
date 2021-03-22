package Task1;


public class Sentence {

    Word[] word;

    public Sentence(Word[] word) {
        this.word = word;
    }

    public void setWord(Word[] word) {
        this.word = word;
    }

    public Word[] getWord() {
        return word;
    }

    @Override
    public String toString() {
       StringBuilder sentence = new StringBuilder();
        for (int i = 0; i < word.length; i++) {
            sentence.append(word[i]).append(" ");
        }
        return sentence.toString();
    }
}
