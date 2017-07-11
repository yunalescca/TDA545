import java.util.Scanner;

/**
 * Created by Yunalescca on 2017-07-11.
 *
 *This program should sum a number of integers and then print the number of numbers, the sum and the mean value.
 * The program should work according to (negative integers will cancel the input):
 * > 1
 * > 2
 * > 3
 * > 5
 * > -1
 * Count = 4, Sum = 11, Avg = 2.75
 *
 * Tip: Use the "loop and a half" pattern
 */
public class SumAvg {

    private double count = 0;
    private double sum = 0;

    public SumAvg(){
        program();
    }

    private void program() {
        System.out.println("Please enter some positive integers. Type a negative number to cancel the input:");
        Scanner scanner = new Scanner(System.in);
        int i;

        while (true) {
            i = scanner.nextInt();

            if(i < 0){
                break;
            }

            count ++;
            sum += i;
        }

        System.out.println("Count = " + (int) count + ", Sum = " + (int) sum + ", Avg = " + sum/count);
    }

    public static void main(String[] args){
        new SumAvg();
    }
}
