package com.ankur.javaQuestions;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int singleLine = sc.nextInt();
//
//        for(int i = 0; i < singleLine; i++){
//            System.out.print("*");
//        }
//        System.out.println();
        printSquareStar(5);
    }

    /**
     * Return N rows and M columns of star
     *
     * @param N rows
     * @param M columns
     */
    private static void printTriangle(int N, int M) {
        for (int i = 0; i < N; i++) {
            System.out.println("*".repeat(M));
        }
    }

    /**
     * Print the pyramid
     */
    private static void printPyramid(int N) {
        for (int row = 0; row < N; row++) {
            for (int star = 0; star < row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Print the pyramid as number
     */
    private static void printPyramidicalNumber(int N) {
        for (int row = 1; row <= N; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }

    /**
     * Print the pyramid in reverse
     */
    private static void printReverse(int n) {
        for (int i = n; i > 0; i--) {
            System.out.println("*".repeat(i));
        }
    }

    /**
     * Print the stars and N-2 space in between in each row.
     */

    private static void printSpaceAndStar(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");

            int space = n - 2;  // Space should increase by n - 2
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            System.out.println("*");
        }
    }

    private static void actualPyramid(int n) {
        int stars = 1;
        for (int i = 1; i <= n; i++) {
            int space = n - i;
            for (int j = i; j <= space; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= stars; k++) {
                System.out.print("*");
            }

            System.out.println();
            stars += 2;
        }
    }

    // stars = row * 2
    // space = row + 2 from second row onwards
    private static void printStars(int n) {
        int space = 0;
        for (int i = n; i > 0; i--) {
            int stars = i;
            for (int k = 0; k <= stars; k++) {
                System.out.print("*");
            }

            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= stars; k++) {
                System.out.print("*");
            }
            System.out.println();
            space += 2;
        }
    }

    private static void printStarsReverse(int n) {
        int space = n * 2 - 2;
        for (int i = 0; i < n; i++) {
            int stars = i;
            for (int k = 0; k <= stars; k++) {
                System.out.print("*");
            }

            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= stars; k++) {
                System.out.print("*");
            }
            System.out.println();
            space -= 2;
        }
    }

    private static void printDiamondPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int k = n - 1; k >= 1; k--) {
            for (int j = k; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printSpaceStar(int n) {
        for (int i = 1; i <= n; i++) {
            for(int k = 1; k < i; k++){
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printSquareStar(int n){

        for(int i = 1; i <=n; i++){
            if(i==1 || i == n){
                for(int j = n; j >= 1; j--){
                    System.out.print("*");
                }
            }
            if (i > 1 && i < n ){
                System.out.print("*");
                for(int j = 2; j < n; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
