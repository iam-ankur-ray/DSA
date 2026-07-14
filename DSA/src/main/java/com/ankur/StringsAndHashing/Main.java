package com.ankur.StringsAndHashing;

import com.ankur.DSA.util.HelperMethods;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> students = new HashMap<>();
        students.put(1,"Ankur");
        students.put(2,"Priye");
        students.put(3,"Ashu");

        for(Integer keys: students.keySet()){  //This is how we iterate to Hashmap
            System.out.println(keys + " " + students.get(keys));
        }
//        int[] array = {1,2,1,2,4,5,1,2,5,3};
//        System.out.println(getUniqueElements(array));
//        System.out.println(getSumOfUniqueElements(array));
//        getFrequencyOfUniqueElements(array);
//        System.out.println(getUpperCaseCount("PriyeAnkurRay"));
//        reverseString("ankur ray");
//        System.out.println(getSumOfIntegersInString("a123bc34"));

    }


    /**
     * Get the size of unique elements
     * @param array of integer
     * @return unique elements
     */
    public static int getUniqueElements(int[] array) {
        HashSet<Integer> uniqueElements = new HashSet<>();
        for (int j : array) {
            uniqueElements.add(j);
        }

        return uniqueElements.size();
    }

    /**
     * Get the sum of unique elements
     * @param array of integer
     * @return sum of elements
     */
    public static int getSumOfUniqueElements(int[] array){
        HashSet<Integer> elements = new HashSet<>();
        for(int value : array){
            elements.add(value);
        }

        int sum = 0;
        for(int value : elements){
            sum += value;
        }
        return sum;
    }

    /**
     * Get the frequency of all the elements
     * @param array of integer
     * @return Hashmap with frequency of each element
     */
    public static void getFrequencyOfUniqueElements(int[] array){
        HashMap<Integer, Integer> fm = new HashMap<>();
        for(int values : array){
            if(fm.containsKey(values)){
                int oldFrequency = fm.get(values);
                fm.put(values, oldFrequency+1);
            } else {
                fm.put(values, 1);
            }
        }

        int count = 0;
        for(int key : fm.keySet()){
            if(fm.get(key) == 1) count++;
        }
        System.out.println(count);
    }

    /**
     * Get the count of upper case characters
     */
    public static int getUpperCaseCount(String value){
        int count = 0;
        for(int i = 0; i < value.length(); i++){
            if((int)value.charAt(i) >=65 && (int) value.charAt(i) <= 90){
                count++;
            }
        }
        return count;
    }

    /**
     * Reverse the string
     */
    public static void reverseString(String value){
        String reverse = "";
        for(int i = value.length()- 1; i >= 0; i--){
            reverse = reverse + value.charAt(i);
        }
        System.out.println(reverse);
    }

    /**
     * Find the sum of digits in a String.
     * Concatinate the numericals values at the same group
     * for example "ab233bc4 = 237
     * ASCII numerical value starts from 48 as 0
     */

    public static int getSumOfIntegersInString(String value){
        int sum = 0;
        for(int i = 0; i < value.length(); i++){
            int current = 0;
            while(i < value.length() && value.charAt(i) >= '0' && value.charAt(i) <= '9'){
                int latestDigit = (int) value.charAt(i) - '0';
                current = current * 10 + latestDigit;
                i++;
            }

            sum += current;
        }

        return sum;
    }
}
