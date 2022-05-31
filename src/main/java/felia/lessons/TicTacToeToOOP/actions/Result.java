package felia.lessons.TicTacToeToOOP.actions;

import felia.lessons.TicTacToeToOOP.Map;
import felia.lessons.TicTacToeToOOP.members.Computer;
import felia.lessons.TicTacToeToOOP.members.Player;

public class Result extends Map {
    CheckOfNumbers check = new CheckOfNumbers();
    LogicOfGame logic = new LogicOfGame();
    Player human = new Player();
    Computer bot = new Computer();

    public void isResultOfGame() {
        while (true) {
            human.humanTurn();
            printMap();

            if (logic.checkWin(DOT_X)) {
                System.out.println("Поздравляем! Вы победили");
                break;
            }
            if (check.isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            bot.aiTurn();
            printMap();

            if (logic.checkWin(DOT_O)) {
                System.out.println("К сожалению, компьютер вас обыграл...");
                break;
            }
            if (check.isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }
}
