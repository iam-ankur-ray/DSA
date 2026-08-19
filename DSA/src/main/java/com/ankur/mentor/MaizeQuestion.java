package com.ankur.mentor;

import java.util.LinkedList;
import java.util.Scanner;

public class MaizeQuestion {
    public static void main(String[] args) {
        char[][] matrix = generateCharMatrix();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        shortestPathGrid(matrix);
    }

    public static void shortestPathGrid(char[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        int[] StartingPoint = new int[2];
        int left = 0, right = col - 1, up = 0, down = row - 1;

        int[][] clone = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                clone[i][j] = -1;
                if (matrix[i][j] == 'S') {
                    StartingPoint[0] = i;
                    StartingPoint[1] = j;
                    clone[i][j] = 0;
                }
            }
        }

        int startingRow = StartingPoint[0];
        int startingCol = StartingPoint[1];

        LinkedList<int[]> queue = new LinkedList<>();
        while(startingRow <= row && startingCol <= col){
            if(matrix[startingRow][startingCol]=='.'){

            }
            startingRow++;
            startingCol++;
        }
    }

    public static char[][] generateCharMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows of matrix : ");
        int rows = sc.nextInt();
        System.out.print("Enter the columns of matrix : ");
        int columns = sc.nextInt();
        char[][] matrix = new char[rows][columns];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter the element you want to add for row " + i + " and column " + j + ": ");
                matrix[i][j] = sc.next().charAt(0);
            }
        }

        return matrix;
    }
}
