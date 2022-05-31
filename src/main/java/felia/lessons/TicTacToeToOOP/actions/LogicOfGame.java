package felia.lessons.TicTacToeToOOP.actions;

import felia.lessons.TicTacToeToOOP.Map;

public class LogicOfGame extends Map {

    boolean checkWin(char dot) {
        if (checkHorizontalVertical(dot))
            return true;

        if (checkMainDiagonalToRight(dot))
            return true;

        if (checkMainDiagonalToDown(dot))
            return true;

        if (checkReversDiagonalToDown(dot))
            return true;

        if (checkReverseDiagonalToLeft(dot))
            return true;

        return false;
    }

    boolean checkReverseDiagonalToLeft(char dot) {
        int diagonals;
        for (int j = 1; j < SIZE; j++) {
            diagonals = 0;
            for (int i = 0; i < SIZE; i++) {
                int k = (SIZE - 1) - j - i;
                if (k >= 0) {
                    if (map[i][k] == dot) {
                        diagonals++;
                    } else if (map[i][k] != dot && diagonals < SIZE_GAME_WIN) {
                        diagonals = 0;
                    }
                }
                if (diagonals >= SIZE_GAME_WIN) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean checkReversDiagonalToDown(char dot) {
        int diagonals;
        for (int j = 0; j < SIZE; j++) {
            diagonals = 0;
            for (int i = 0; i < SIZE; i++) {
                int k = (SIZE - 1) - i;
                int l = j + i;
                if (k >= 0 && l < SIZE) {
                    if (map[l][k] == dot) {
                        diagonals++;
                    } else if (map[l][k] != dot && diagonals < SIZE_GAME_WIN) {
                        diagonals = 0;
                    }
                }
                if (diagonals >= SIZE_GAME_WIN) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean checkMainDiagonalToDown(char dot) {
        int diagonal;
        for (int j = 1; j < SIZE; j++) {
            diagonal = 0;
            for (int i = 0; i < SIZE; i++) {
                int k = j + i;
                if (k < SIZE) {
                    if (map[k][i] == dot) {
                        diagonal++;
                    } else if (map[k][i] != dot && diagonal < SIZE_GAME_WIN) {
                        diagonal = 0;
                    }
                }
                if (diagonal >= SIZE_GAME_WIN) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean checkMainDiagonalToRight(char dot) {
        int diagonal;
        for (int j = 0; j < SIZE; j++) {
            diagonal = 0;
            for (int i = 0; i < SIZE; i++) {
                int k = j + i;
                if (k < SIZE) {
                    if (map[i][k] == dot) {
                        diagonal++;
                    } else if (map[i][k] != dot && diagonal < SIZE_GAME_WIN) {
                        diagonal = 0;
                    }
                }
                if (diagonal >= SIZE_GAME_WIN) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean checkHorizontalVertical(char dot) {
        int vertical;
        int horizontal;
        for (int i = 0; i < SIZE; i++) {
            horizontal = 0;
            vertical = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == dot) {
                    horizontal++;
                } else if (map[i][j] != dot && horizontal < SIZE_GAME_WIN) {
                    horizontal = 0;
                }
                if (map[j][i] == dot) {
                    vertical++;
                } else if (map[j][i] != dot && vertical < SIZE_GAME_WIN) {
                    vertical = 0;
                }
            }
            if (horizontal >= SIZE_GAME_WIN || vertical >= SIZE_GAME_WIN) {
                return true;
            }
        }
        return false;
    }

}

