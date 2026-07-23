package com.ankur.DSA.DP;

import java.util.Scanner;

public class Nqueen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        char[][] chess = new char[size][size];
        fillChess(chess);
        nByNQueen(chess, 0);
    }

    public static void fillChess(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = '.';
            }
        }
    }

    public static void print(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void nByNQueen(char[][] chess, int row) {
        if (row == chess.length) {
            print(chess);
            System.out.println("-".repeat(40));
        }

        for (int col = 0; col < chess.length; col++) {
            if (isSafe(chess, row, col)) {
                chess[row][col] = 'Q';
                nByNQueen(chess, row + 1);
                chess[row][col] = '.';
            }
        }
    }

    public static boolean isSafe(char[][] chess, int row, int col) {
        // check the current column
        for (int i = 0; i < row; i++) {
            if (chess[i][col] == 'Q') {
                return false;
            }
        }

        // check right side diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j] == 'Q') {
                return false;
            }
        }

        // check left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }
}
