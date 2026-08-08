package com.ankur.originalInterviews;

public class GenericClasses {
    public static void main(String[] args) {
        NumbericDataType<Integer> dt = new NumbericDataType<>();
        dt.addition(10,65);
    }
}

class NumbericDataType <T> {

    void addition(T a, T b){
       if(a instanceof Integer && b instanceof Integer){
           System.out.println((Integer)a + (Integer)b);
       } else if(a instanceof Double && b instanceof Double){
           System.out.println((Double)a + (Double)b);
       } else if(a instanceof Float && b instanceof Float) {
           System.out.println((Float) a + (Float) b);
       } else if(a instanceof Long && b instanceof Long) {
           System.out.println((Long) a + (Long) b);
       }
    }


}
