package Task1;


public class Sentence {

    Word[] word;

    public Sentence(Word[] word) {
        this.word = word;
    }

    public static Sentence parseSentence(String str) {
        String[] wordsNew = str.split(" ");// массив слов

        Word[] words2 = new Word[wordsNew.length];

        for (int i = 0; i < wordsNew.length; i++) {
            words2[i] = new Word(wordsNew[i]);
        }
        Sentence sentence = new Sentence(words2);
        return sentence;
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
