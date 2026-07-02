package com.ankur.javaQuestions;

import java.util.Scanner;

public class Facotors {

    public static void main(String[] args) {
        //Count the number of prime factors till any input.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        if (A < 2) {
            System.out.println(0);
        }

        int count = 1;

        for (int i = 3; i <= A; i += 2) {
            int factors = LearningMethodCreation.countFactors(i);

            if (factors == 2) {
                count++;
            }
        }

        System.out.println(count);
    }

}
