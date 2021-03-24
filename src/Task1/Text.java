package Task1;

import java.util.Arrays;

import static Task1.Sentence.parseSentence;

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

        sentences = Arrays.copyOf(sentences, sentences.length + 1);
        sentences[sentences.length - 1] = parseSentence(str);

        return sentences;
    }

}