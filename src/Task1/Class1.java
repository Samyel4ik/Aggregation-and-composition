package Task1;


import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        Word word = new Word("Hello");
        Word word2 = new Word("Java");
        Word word3 = new Word("Cat");

        Word[] words = new Word[]{word, word2, word3};

        Word[] words1 = new Word[]{
                new Word("Customer"),
                new Word("buys"),
                new Word("something"),
                new Word("per"),
                new Word("Customer"),
                new Word("money")
        };

        Sentence heading = new Sentence(new Word[]{new Word("Java ." + "\n")});
        Sentence sentence = new Sentence(words);
        Sentence sentence1 = new Sentence(words1);
        Sentence[] sentences = new Sentence[]{heading, sentence, sentence1};

        Text text = new Text(sentences);
        System.out.println(text);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение - ");
        String str = scanner.nextLine();

        Text text1 = new Text(text.addSentence(sentences, str));
        System.out.println(text1);
    }
}
