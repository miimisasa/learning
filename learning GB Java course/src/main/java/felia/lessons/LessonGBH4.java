package felia.lessons;

import java.util.Scanner;

public class LessonGBH4 {

    public static Scanner scanner = new Scanner(System.in);
    public static char map[][];
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;

    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static void main(String[] args) {
        initMap();
        printMap();
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


}

