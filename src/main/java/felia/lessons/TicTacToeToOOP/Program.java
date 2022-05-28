package felia.lessons.TicTacToeToOOP;

import felia.lessons.TicTacToeToOOP.actions.Result;

public class Program {

    public static void main(String[] args) {

        Map.chooseMapSize();
        Map.chooseWinSize();
        Map.initMap();
        Map.printMap();
        Result.isResultOfGame();
    }
}
