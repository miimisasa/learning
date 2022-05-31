package felia.lessons.TicTacToeToOOP;

import felia.lessons.TicTacToeToOOP.actions.Result;

public class Program {

    public static void main(String[] args) {
        Result result = new Result();
        Map map = new Map();


        map.chooseMapSize();
        map.chooseWinSize();
        map.initMap();
        map.printMap();
        result.isResultOfGame();
    }
}
