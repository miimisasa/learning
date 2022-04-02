package felia.lessons;

import java.util.Random;
import java.util.Scanner;

public class LessonGBH4 {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static int SIZE;
    public static char[][] map;

    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static int SIZE_GAME_WIN;

    public static void main(String[] args) {
        isStartGame();
    }

    public static void isStartGame() {
        chooseMapSize();
        chooseWinSize();
        initMap();
        printMap();
        isResultOfGame();
    }


    public static void chooseMapSize() {
        System.out.println("Выберите размер поля размером от 3х3 до 99х99. Введенное значение N будет использовано в качестве NхN");

        while (true) {
            try {
                SIZE = Integer.parseInt(scanner.nextLine());
                if (SIZE > 3 && SIZE < 99) {
                    System.out.println("Вы выбрали поле размером: " + SIZE + "х" + SIZE);
                } else  throw new IllegalArgumentException("Сказали же " + "от 3 до 99");
                break;
            } catch (NumberFormatException nfe) {
                System.out.print("Кажется, вы не учили что такое цифры...Выберите размер поля от 3х3 до 99х99.");
            }
        }
        }



    private static void chooseWinSize() {
        System.out.println(" Выберите количество фишек для победы от 2 до " + SIZE);
        while (true) {
            try {
                SIZE_GAME_WIN = Integer.parseInt(scanner.nextLine());
                if (SIZE > 3 && SIZE < 99) {
                    System.out.println("Вы выбрали победу при " + SIZE_GAME_WIN + " фишках подряд");
                } else  throw new IllegalArgumentException("Сказали же " + "от 3 до 99");
                break;
            } catch (NumberFormatException nfe) {
                System.out.print("Кажется, вы не учили что такое цифры...Выберите количество фишек для победы от 2 до " + SIZE);
            }
        }
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }

    }

    public static void printMap() {
        for (int i = 0; i <= map.length; i++) {
            if (i == 0) {
                System.out.print("\t");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void isResultOfGame() {
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Поздравляем! Вы победили");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("К сожалению, компьютер вас обыграл...");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты ячейки в виде (х;у)");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!cellIsEmpty(x, y));
        map[y][x] = DOT_X;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!cellIsEmpty(x, y));
        System.out.println("Компьютер сделал ход в ячейку " + "(" + (x + 1) + ";" + (y + 1) + ")");
        map[y][x] = DOT_O;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static boolean cellIsEmpty(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) return false;
        return map[y][x] == DOT_EMPTY;
    }

    public static boolean checkWin(char dot) {
        int horizontal, vertical, diagonal, diagonals;
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

}

