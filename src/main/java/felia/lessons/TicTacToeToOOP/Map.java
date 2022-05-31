package felia.lessons.TicTacToeToOOP;

import static felia.lessons.LessonGBH4.LessonGBH4.checkInputData;
import static felia.lessons.LessonGBH4.LessonGBH4.scanner;

public class Map {
    public static int SIZE;
    public static char[][] map;
    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static int SIZE_GAME_WIN;
    private static int number;

    public void chooseMapSize() {
        System.out.println("Выберите размер поля размером от 3х3 до 99х99. Введенное значение N будет использовано в качестве NхN");
        while(true) {
            String inputData = scanner.nextLine();
            if(checkInputData(inputData, 3, 99)){
                SIZE = Integer.parseInt(inputData);
                System.out.println("Вы выбрали поле размером: " + SIZE + "х" + SIZE);
                break;
            }
        }
    }

    public void chooseWinSize() {
        System.out.println("Выберите количество фишек для победы от 2 до " + SIZE);
        while (true) {
            String inputData = scanner.nextLine();
            if(checkInputData(inputData, 2, SIZE)){
                SIZE_GAME_WIN = Integer.parseInt(inputData);
                System.out.println("Вы выбрали победу при " + SIZE_GAME_WIN + " фишках подряд");
                break;
            }
        }
    }

    public void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }

    }

    public void printMap() {
        for (int i = 0; i <= map.length; i++) {
            if (i == 0) {
                System.out.print("\t");
            } else {
                System.out.print(i + "\t");
            }
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean checkInputData (String inputData, int min, int max) {
        try {
            number = Integer.parseInt(inputData);
            if (number >= min && number <= max) {
                return true;
            } else
                System.out.println("Сказали же от " + min +" до " + max);
        } catch (NumberFormatException nfe) {
            System.out.println("Кажется, вы не учили что такое цифры...");
        }
        return false;
    }
}
