package LectureSix;

import java.util.Arrays;

/**
 * Created by Yunalescca on 2017-07-05.
 * Merges and sorts an array*/
public class Lect6_2 {

    public int[] merge(int[] arr1, int[] arr2){

        int newArr[] = new int[arr1.length + arr2.length];

        //System.arraycopy(arr1, 0, newArr, 0, arr1.length);
        //System.arraycopy(arr2, 0, newArr, arr1.length, arr2.length);

        for(int i = 0; i < arr1.length; i++){
            newArr[i] = arr1[i];
        }

        for(int i = 0; i < arr2.length; i++){
            newArr[arr1.length+i] = arr2[i];
        }

        sort(newArr);

        return newArr;
    }

    private void sort(int[] newArr) {
        Arrays.sort(newArr);
    }
}
