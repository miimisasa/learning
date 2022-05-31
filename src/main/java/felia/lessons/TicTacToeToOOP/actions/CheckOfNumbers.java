package felia.lessons.TicTacToeToOOP.actions;

import felia.lessons.TicTacToeToOOP.Map;

public class CheckOfNumbers extends Map {

    public boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY)
                    return false;
            }
        }
        return true;
    }

    public boolean cellIsEmpty(int x, int y) {
        if (map[y][x] == DOT_EMPTY) {
            return false;
        } else {
            System.out.println("ЭТА ЯЧЕЙКА УЖЕ ЗАНЯТА!");
            return true;
        }
    }
}
