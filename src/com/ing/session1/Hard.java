package com.ing.session1;

public class Hard {

    /*
    We'll say that a "mirror" section in an array is a group of contiguous elements such
    that somewhere in the array, the same group appears in reverse order.
    For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part).
    Return the size of the largest mirror section found in the given array.
     */

    public static void main(String[] args) {
        System.out.println(maxMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1}));   //→ 3
        System.out.println(maxMirror(new int[]{1, 2, 1, 4}));               //→ 3
        System.out.println(maxMirror(new int[]{7, 1, 2, 9, 7, 2, 1}));      //→ 2
    }

    private static int maxMirror(int[] nums) {

        return 0;
    }
}
