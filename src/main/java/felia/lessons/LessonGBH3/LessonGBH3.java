package felia.lessons.LessonGBH3;

import java.util.Random;
import java.util.Scanner;

public class LessonGBH3 {
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

   public static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
            "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static String hiddenWord = words[random.nextInt(words.length)];
    public static StringBuilder codedWord = new StringBuilder("###############");

    public static void main(String[] args) {
        startGameGuessNumber(1);
        guessWord();
    }

    public static void guessNumber() {
        int number = random.nextInt(9);
        for (int i = 0; i < 3; i++) {
            System.out.println("Попытка номер " + (i + 1));
            System.out.println("Введите предполагаемое число :");
            int x = scanner.nextInt();
            if (x != number) {
                if (x < number) {
                    System.out.println("Меньше");
                } else {
                    System.out.println("Больше");
                }
                System.out.println("К сожалению, вы не угадали");
            } else {
                System.out.println("Вы угадали!");
                System.out.println("«Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
                int num = scanner.nextInt();
                startGameGuessNumber(num);
            }
        }
        System.out.println("Загаданный номер был: " + number);
        System.out.println("«Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
        int num = scanner.nextInt();
        startGameGuessNumber(num);
    }

    public static void startGameGuessNumber(int num) {
        if (num == 1) {
            guessNumber();
        }
        if (num == 0) {
            System.out.println("Ну ладно. До встречи!");
        }
    }

    public static void guessWord() {
        System.out.print("Тебе загадали какое-то слово. Тебе предстоит его угадать. Возможные слова: ");
        for (String word : words) System.out.print(word + " ");
        System.out.println("\nУгадай загаданное слово.Ты увидишь совпавшие буквы в качестве подсказки.");

        while (true) {
            System.out.print("\nВведите слово: ");
            String input = scanner.nextLine();
            if (hiddenWord.equals(input)) {
                System.out.println("\nВы угадали! Это было слово " + hiddenWord + "!");
                break;
            } else {
                int guessChar = Math.min(input.length(), hiddenWord.length());
                for (int i = 0; i < guessChar; i++) {
                    if (input.charAt(i) == hiddenWord.charAt(i)) {
                        codedWord.setCharAt(i, input.charAt(i));
                    }
                }
            }
            System.out.println("Закодированное слово: " + codedWord);
        }

        System.out.println("Игра завершена! До встречи");
        scanner.close();
    }
}

