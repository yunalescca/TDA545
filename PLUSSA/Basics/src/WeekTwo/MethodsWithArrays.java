package WeekTwo;

/**
 * Created by Yunalescca on 2017-07-13.
 *
 * a) Create a method sumArray, which sums all the integers in an array
 *
 * b) Create a method indexOfMax which returns the index of the biggest integer in an array
 *
 * c) Create a method occurrences, which calculates the number of occurrences of a certain element in an array
 */
public class MethodsWithArrays {

    public MethodsWithArrays(){
        int[] arr = {1,1,3,4,5};

        System.out.println(sumArray(arr));

        System.out.println(indexOfMax(arr));

        System.out.println(occurrences(arr, 1));
    }

    /**
     * Calculates the sum of all integers in the array
     * @param arr of integers
     * @return the sum of the integers
     */
    private int sumArray(int[] arr){

        if(arr.length != 0){
            int sum = 0;

            for(int a: arr){
                sum += a;
            }

            return sum;
        }

        return -1;
    }

    /**
     * Method for finding the index of the max element in an array
     * @param arr array of integers
     * @return index
     */
    private int indexOfMax(int[] arr){

        if(arr.length != 0){
            int index = 0;
            int max = arr[0];

            for(int i = 0; i < arr.length; i++){
                if(arr[i] > max){
                    max = arr[i];
                    index = i;
                }
            }

            return index;
        }

        return -1;
    }

    /**
     * Calculates the number of occurrences of a certain element in an array
     * @param arr array of integers
     * @param n the element that's being searched for
     * @return number of occurrences
     */
    private int occurrences(int[] arr, int n){

        if (arr.length != 0) {

            int occ = 0;

            for(int i: arr){
                if (i == n) {
                    occ++;
                }
            }

            return occ;
        }

        return -1;
    }

    public static void main(String[] args){
        new MethodsWithArrays();
    }
}
