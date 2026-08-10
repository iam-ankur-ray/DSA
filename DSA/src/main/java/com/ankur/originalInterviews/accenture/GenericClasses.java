package com.ankur.originalInterviews.accenture;

public class GenericClasses {
    public static void main(String[] args) {
        NumbericDataType<Integer> dti = new NumbericDataType<>();
        NumbericDataType<Double> dtd = new NumbericDataType<>();
        NumbericDataType<String> dts = new NumbericDataType<>();
        dti.addition(10,65);
        dtd.addition(50.6,49.4);
        dts.addition("Ankur ", "Ray");
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
       } else if(a instanceof String){
           System.out.println( a + (String) b);
       }
    }


}
