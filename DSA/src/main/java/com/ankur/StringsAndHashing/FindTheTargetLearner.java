package com.ankur.StringsAndHashing;

import com.ankur.DSA.util.HelperMethods;

import java.util.HashMap;

public class FindTheTargetLearner {
    public static void main(String[] args) {
        int[] A = {1, 2, 1, 1, 2, 2, 2, 2, 2, 2, 5, 5, 5, 5, 2, 3, 3, 1};
        int[] B = {1, 5, 3};
        HelperMethods.printIntegerArray(getFrequencyOfLearnersByMap(A, B));

    }

    public static int[] getFrequencyOfLearnersByMap(int[] A, int[] B) {
        HashMap<Integer, Integer> frequencyOfStudents = new HashMap<>();

        for (int students : A) {
            if (frequencyOfStudents.containsKey(students)) {
                int oldFrequency = frequencyOfStudents.get(students);
                frequencyOfStudents.put(students, oldFrequency + 1);
            } else {
                frequencyOfStudents.put(students, 1);
            }
        }

        int[] answer = new int[B.length];
        int index = 0;

        for(int value : B){
            int frequency = 0;
            if(frequencyOfStudents.containsKey(value)){
                frequency = frequencyOfStudents.get(value);
            }
            answer[index] = frequency;
            index++;
        }

        return answer;
    }

    //Brute force approach which can get answer for smaller data

    public int[] getFrequencyOfLearners(int[] A, int[] B) {
        int[] answer = new int[B.length];

        int index = 0;
        for (int targetedLearner : B) {
            int frequency = 0;
            for (int learners : A) {
                if (learners == targetedLearner)
                    frequency++;
            }
            answer[index] = frequency;
            index++;
        }

        return answer;
    }

}
