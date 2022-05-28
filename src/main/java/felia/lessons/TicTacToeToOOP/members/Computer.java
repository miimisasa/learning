package felia.lessons.TicTacToeToOOP.members;

import felia.lessons.TicTacToeToOOP.Map;
import felia.lessons.TicTacToeToOOP.actions.CheckOfNumbers;

import static felia.lessons.LessonGBH4.LessonGBH4.random;

public class Computer extends Map {
    public static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (CheckOfNumbers.cellIsEmpty(x, y));
        System.out.println("Компьютер сделал ход в ячейку " + "(" + (x + 1) + ";" + (y + 1) + ")");
        map[y][x] = DOT_O;
    }
}
