package Task1;

import java.util.Arrays;

public class Text {

    Sentence[] sentences;

    public Text(Sentence[] sentences) {
        this.sentences = sentences;
    }

    public Sentence[] getSentences() {
        return sentences;
    }

    public void setSentences(Sentence[] sentences) {
        this.sentences = sentences;
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < sentences.length; i++) {
            text.append(sentences[i]).append(".");
        }

        return text.toString();
    }

    public Sentence[] addSentence(Sentence[] sentences, String str) {

        String[] wordsNew = str.split(" ");// массив слов

        Word[] words2 = new Word[wordsNew.length];

        for (int i = 0; i < wordsNew.length; i++) {
            words2[i] = new Word(wordsNew[i]);
        }
        Sentence sentence = new Sentence(words2);

        sentences = Arrays.copyOf(sentences, sentences.length + 1);
        sentences[sentences.length - 1] = sentence;

        return sentences;
    }
}