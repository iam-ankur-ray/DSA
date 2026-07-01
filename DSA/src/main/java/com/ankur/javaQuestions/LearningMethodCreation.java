package com.ankur.javaQuestions;

public class LearningMethodCreation {

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static String getSize(int n) {
        if (n < 10) {
            return "small";
        }
        if (n <= 20) {
            return "medium";
        }
        return "large";
    }

    public static double area(double a, double b) {
        return a * b;
    }

    public static double areaOfCircle(double r) {
        return Math.PI * r * r;
    }

    public static void getPrimeNumbers(int n) {
        for (int j = 2; j < n; j++) {
            int count = 0;
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(j + " ");
            }
        }
    }

    public static void printPrimes(int n) {
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        return countFactors(n) == 2;
    }

    public static int countFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static int getCeiling(int A) {
        int divisor = 200;
        int result = A / divisor;

        if (A % divisor != 0 && A > 0) {
            result += 1;
        }
        return result;
    }

    public static void main(String[] args) {
        printPrimes(100);
    }


}
