package com.freeit.gameXO;

import java.util.Random;
import java.util.Scanner;

public class GameXO {
    static final char MARK_X = 'X';
    static final char MARK_0 = '0';
    static final char SIGN_EMPTY = '_';
    static int countStep = 0;
    static char[][] gameField;
    static Random random;
    static Scanner scanner;

    public static void main(String[] args) {
        random = new Random();
        scanner = new Scanner(System.in);
        gameField = new char[3][3];

        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                gameField[row][col] = SIGN_EMPTY;

        while (true) {
            int x;
            int y;

            // Ход пользователя
            do {
                do {
                    System.out.print("Введите ячейку Х от 1 до 3: ");
                    x = scanner.nextInt() - 1;
                } while (x < 0 || x >= 3);

                do {
                    System.out.print("Введите ячейку Y от 1 до 3: ");
                    y = scanner.nextInt() - 1;
                } while (y < 0 || y >= 3);

            } while (gameField[x][y] != SIGN_EMPTY);
            gameField[x][y] = MARK_X;
            countStep++;

            if (checkWin(MARK_X)) {
                System.out.println("--- Пользователь выйграл! ---");
                break;
            }

            if (countStep == 9) {
                System.out.println("--- Ничья! ---");
                break;
            }

            // Ход компьютера
            do {
                x = random.nextInt(3);
                y = random.nextInt(3);
            } while (gameField[x][y] != SIGN_EMPTY);
            gameField[x][y] = MARK_0;
            countStep++;

            // Вывод поля
            System.out.println("--------------------------------------------------------");
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++)
                    System.out.print(gameField[row][col] + " ");
                System.out.println();
            }

            if (checkWin(MARK_0)) {
                System.out.println("--- Компьютер выйграл! ---");
                break;
            }
        }
        System.out.println("--- Игра окончена! ---");

        // Вывод поля
        System.out.println("--------------------------------------------------------");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++)
                System.out.print(gameField[row][col] + " ");
            System.out.println();
        }
    }

    static boolean checkWin(char dot) {
        for (int i = 0; i < 3; i++)
            if ((gameField[i][0] == dot && gameField[i][1] == dot &&
                    gameField[i][2] == dot) ||
                    (gameField[0][i] == dot && gameField[1][i] == dot &&
                            gameField[2][i] == dot))
                return true;
        return (gameField[0][0] == dot && gameField[1][1] == dot &&
                gameField[2][2] == dot) ||
                (gameField[2][0] == dot && gameField[1][1] == dot &&
                        gameField[0][2] == dot);
    }
}
























