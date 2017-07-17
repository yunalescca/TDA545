package WeekThree;

import java.util.Arrays;

/**
 * Created by Yunalescca on 2017-07-16.
 * Basic exercise covering some simple array operations
 */
public class ArrayPuzzlers {

    public ArrayPuzzlers(){
        // This is testing. expected outcome as commented
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = {1, 2, 2, 3, 3};

        System.out.println(Arrays.toString(arr1));  // [1, 2, 3, 4, 5, 6, 7, 8]
        rotate(arr1, 3);
        System.out.println(Arrays.toString(arr1));  //[6, 7, 8, 1, 2, 3, 4, 5]

        System.out.println(Arrays.toString(arr2));   // [1, 2, 2, 3, 3]
        System.out.println(Arrays.toString(removeDupl(arr2)));  // [1, 2, 3]
        System.out.println(Arrays.toString(arr2));  // [1, 2, 2, 3, 3]
    }

    // Rotate all elements in arr k steps to the right (in a circular fashion)
    private void rotate(int[] arr, int k) {

        if(arr.length < k) {
            k = k % arr.length;
        }

        if(k >  0) {
            int[] temp = new int[arr.length];

            for(int i = 0; i < k; i++) {

                temp[i] = arr[arr.length - k + i];

            }

            int j = 0;

            for (int i = k; i < arr.length; i++) {
                temp[i] = arr[j++];
            }

            System.arraycopy(temp, 0, arr, 0, arr.length);
        } else {
            throw new ArrayIndexOutOfBoundsException("k must be non-negative");
        }
    }

    // Remove all duplicates from arr (original unchanged, copy created)
    // NOTE: We assume the array is sorted in ascending order
    private int[] removeDupl(int[] arr) {
        return null;
    }

    public static void main(String[] args) {
        new ArrayPuzzlers();
    }
}
