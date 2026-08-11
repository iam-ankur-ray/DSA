package com.ankur.DSA.candidates;

public class GreaterThanNByThree {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 1, 1, 2, 1};
        System.out.println(getMajorityNBy3Element(A));
    }

    public static int getMajorityNBy3Element(int[] A){
        int size = A.length;

        int candidateOne = 0, candidateTwo = 0;
        int countOne = 0, countTwo = 0;

        for(int i = 0; i < size; i++){
            if(A[i]==candidateOne){
                countOne++;
            } else if(A[i]==candidateTwo){
                countTwo++;
            } else if(countOne==0){
                candidateOne = A[i];
                countOne = 1;
            } else if(countTwo == 0){
                candidateTwo = A[i];
                countTwo = 1;
            } else {
                countOne--;
                countTwo--;
            }
        }

        countOne = 0;
        countTwo = 0;
        for(int value : A){
            if(value == candidateOne){
                countOne++;
            } else if(value == candidateTwo){
                countTwo++;
            }
        }

        if(countOne > size / 3){
            return candidateOne;
        } else if (countTwo > size / 3){
            return candidateTwo;
        }

        return -1;
    }
}
