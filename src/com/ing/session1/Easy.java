package com.ing.session1;

public class Easy {

    /*
    Given an int array, return true if the array contains 2 twice, or 3 twice.
    The array will be length 0, 1, or 2.
     */

    public static void main(String[] args) {
        // write your code here
        System.out.println(double23(new int[]{2, 2}));   // true
        System.out.println(double23(new int[]{3, 3}));   // true
        System.out.println(double23(new int[]{2, 3}));   // false
    }

    private static boolean double23(int[] nums) {
        return false;
    }
}
