package felia.lessons.TicTacToeToOOP.actions;

import felia.lessons.TicTacToeToOOP.Map;
import felia.lessons.TicTacToeToOOP.members.Computer;
import felia.lessons.TicTacToeToOOP.members.Player;

public class Result extends Map {

    public static void isResultOfGame() {
        while (true) {
            Player.humanTurn();
            printMap();
            if (LogicOfGame.checkWin(DOT_X)) {
                System.out.println("Поздравляем! Вы победили");
                break;
            }
            if (CheckOfNumbers.isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            Computer.aiTurn();
            printMap();
            if (LogicOfGame.checkWin(DOT_O)) {
                System.out.println("К сожалению, компьютер вас обыграл...");
                break;
            }
            if (CheckOfNumbers.isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }
}
