package felia.lessons;

import sun.security.x509.InvalidityDateExtension;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LessonGB3 {
    static final int COUNT_AVAILABLE_SHIPS = 3;
    static final int SIZE_WAR_FIELD = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] userWarField = createAndFillUserWarField();
        int[] computerWarField = createAndFillComputerWarField();

        int remainingUserShips = COUNT_AVAILABLE_SHIPS;
        int remainingComputerShips = COUNT_AVAILABLE_SHIPS;

        int[] computerDoesShot = new int[userWarField.length];

        boolean isUserShoot = random.nextBoolean();
        System.out.println("\n=========== Начало игры! ===========\n");
        while (remainingComputerShips > 0 && remainingUserShips > 0) {
            if (isUserShoot) {
                System.out.println("Ход пользователя. Укажите ячейку для стрельбы: ");
                int indexCeil = scanner.nextInt();

                if (computerWarField[indexCeil] == 1) {
                    System.out.println("Убил!");
                    computerWarField[indexCeil] = -1;
                    remainingComputerShips--;
                } else {
                    System.out.println("Промах!");
                    isUserShoot = false;
                }
            } else {
                System.out.println("Ход компьютера");
                int indexCeil = random.nextInt(userWarField.length);
                while (computerDoesShot[indexCeil] == 1) {
                    indexCeil = random.nextInt(userWarField.length);
                }
                computerDoesShot[indexCeil] = 1;
                if (userWarField[indexCeil] == 1) {
                    System.out.println("Компьютер убил!");
                    userWarField[indexCeil] = -1;
                    remainingUserShips--;

                    System.out.println(Arrays.toString(userWarField));
                } else {
                    System.out.println("Компьютер промахнулся!");
                    isUserShoot = true;
                }
            }
        }
        scanner.close();
    }

    private static int[] createAndFillComputerWarField() {
        Random random = new Random();

        int[] warField = new int[SIZE_WAR_FIELD];
        int countAvailableShips = COUNT_AVAILABLE_SHIPS;

        while (countAvailableShips > 0) {
            int indexCeil = random.nextInt(warField.length);
            if (warField[indexCeil] == 0) {
                warField[indexCeil] = 1;
                countAvailableShips--;
            }
        }
        return warField;
    }

    private static int[] createAndFillUserWarField() {
        Scanner scanner = new Scanner(System.in);

        int[] warField = new int[SIZE_WAR_FIELD];
        int countAvailableShips = COUNT_AVAILABLE_SHIPS;

        System.out.println("Ваше поле для расстановки кораблей:" + Arrays.toString(warField));
        while (countAvailableShips > 0) {
            System.out.println("Укажите ячейку для установки коробля :");
            int indexCeil = scanner.nextInt();

            if (indexCeil < 0 || indexCeil >= warField.length) {
                System.err.println("Недопустимый индекс : укажите число от 0 до " + warField.length);
            } else if (warField[indexCeil] != 0) {
                System.err.println("Ячейка уже занята!");
            } else {
                warField[indexCeil] = 1;
                countAvailableShips--;
                System.out.println("Актуальноe состояние поля" + Arrays.toString(warField));
            }
        }
        return warField;
    }
}

