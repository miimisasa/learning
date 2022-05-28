package felia.lessons.TicTacToeToOOP.members;

import felia.lessons.TicTacToeToOOP.Map;
import felia.lessons.TicTacToeToOOP.actions.CheckOfNumbers;

import static felia.lessons.LessonGBH4.LessonGBH4.scanner;

public class Player extends Map {
    public static void humanTurn() {
        int x, y;
        do {
            while (true) {
                System.out.println("Введите координаты ячейки по X");
                String inputData = scanner.nextLine();
                if (checkInputData(inputData, 1, SIZE)) {
                    x = Integer.parseInt(inputData) - 1;
                    break;
                }
            }

            while (true) {
                System.out.println("Введите координаты ячейки по Y");
                String inputData = scanner.nextLine();
                if (checkInputData(inputData, 1, SIZE)) {
                    y = Integer.parseInt(inputData) - 1;
                    break;
                }
            }

        } while (CheckOfNumbers.cellIsEmpty(x, y));

        map[y][x] = DOT_X;
    }
}
