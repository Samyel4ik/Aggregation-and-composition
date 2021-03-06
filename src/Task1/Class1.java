package Task1;

import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Text text = createText();
        finish(scanner, text);
    }

    public static Text createText() {
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

        return new Text(sentences); //исходный текст

    }

    public static void finish(Scanner scanner, Text text) {
        System.out.println("Выберите пункт меню:" + "\n" +
                "1.Дополнить текст." + "\n" +
                "2.Распечатать текст." + "\n" +
                "3.Распечатать закголовок текста.");
        System.out.print("Ваш выбор: ");

        int x = Integer.parseInt(scanner.nextLine());

        if (x == 1) {
            System.out.println("Введите предложение - ");
            String str = scanner.nextLine();
            Text text1 = addText(text, text.getSentences(), str);
            System.out.println(text1);
        }

        if (x == 2) {
            System.out.println(text);
        }
        if (x == 3) {
            Sentence[] sentences = text.getSentences();
            System.out.println(sentences[0]);

        }

    }

    public static Text addText(Text text, Sentence[] sentences, String str) {

        Text text1 = new Text(text.addSentence(sentences, str));
        return text1;
    }

}
