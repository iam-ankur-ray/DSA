package com.ankur.javaQuestions;

public class Patterns {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int singleLine = sc.nextInt();
        printSpaceAndStar(6);

        //Print in single line
//        for(int i = 0; i < singleLine; i++){
//            System.out.print("*");
//        }
//        System.out.println();

    }

    /**
     * Return N rows and M columns of star
     * @param N rows
     * @param M columns
     */
    private static void printTriangle(int N, int M) {
        for(int i = 0; i < N; i++){
            System.out.println("*".repeat(M));
        }
    }

    /**
     * Print the pyramid
     */
    private static void printPyramid(int N){
        for(int row = 0; row < N; row++){
            for(int star = 0; star < row; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Print the pyramid as number
     */
    private static void printPyramidicalNumber(int N){
        for(int row = 1; row <= N; row++){
            for(int star = 1; star <= row; star++){
                System.out.print(star);
            }
            System.out.println();
        }
    }

    /**
     * Print the pyramid in reverse
     */
    private static void printReverse(int n){
        for(int i = n; i > 0; i--){
            System.out.println("*".repeat(i));
        }
    }

    /**
     * Print the stars and N-2 space in between in each row.
     */

    private static void printSpaceAndStar(int n){
        for(int i = 1; i <= n; i++) {
            System.out.print("*");
            int space = n - 2;  // Space should increase by n - 2
            for(int j =1; j <= space; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
