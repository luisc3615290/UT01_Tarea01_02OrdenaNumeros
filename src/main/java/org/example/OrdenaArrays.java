package org.example;

import java.util.Arrays;

public class OrdenaArrays {
    public static int[] convertToIntArray(String[] stringArray){
        int[] intArray = new int[stringArray.length];

        try {
            for (int i = 0; i < stringArray.length; i++) {
                intArray[i] = Integer.parseInt(stringArray[i]);
            }
            return intArray;
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }
    public static void OrdenarArray(int[] arrayInt) {
        Arrays.sort(arrayInt);
        try {
            for (int num: arrayInt) {
                System.out.println(num);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);//
        }
    }
}
