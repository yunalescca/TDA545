import java.util.Scanner;

/**
 * Created by Yunalescca on 2017-07-11.
 *
 * Write a program which calculates when Easter Day is given a certain year (1900-2099)
 *
 * The algorithm for the calculation is as follows:
 * A = year mod 19
 * B = year mod 4
 * C = year mod 7
 * S = 19 * A + 24
 * D = S mod 30
 * T = 2 * B + 4 * C + 6 * D + 5
 * E = T mod 7
 * date = 22 + D + E
 *
 * If the date is less than 32 then Easter Day will be on that date in March. Else, the date is D + E - 9 and then
 * Easter Day is on that date in April, except for two exceptions:
 * - If date = 26 then Easter Day will be on April 19th
 * - If date = 25 and A = 16 and D = 28 then Easter Day will be on April 18th
 *
 * The program should work according to:
 * "Input a year (1900-2099) > 2016 (enter)
 * Easter Day for 2016 is : 27/3"
 */
public class EasterDay {

    public static final int MIN_DATE = 1900;
    public static final int MAX_DATE = 2099;

    public static final int MARCH = 3;
    public static final int APRIL = 4;

    private int inputDate;


    public EasterDay(){

        startup();
        calculateEaster();

    }

    /**
     * Retrieves input from the user
     */
    private void startup() {
        System.out.print("Input a year (1900-2099): ");
        Scanner scanner = new Scanner(System.in);
        inputDate = scanner.nextInt();

        while(!(inputDate >= MIN_DATE && inputDate <= MAX_DATE)){
            System.out.println("Please enter a valid date: ");
            inputDate = scanner.nextInt();
        }
    }

    /**
     * The given algorithm
     */
    private void calculateEaster() {
        int a = inputDate % 19;
        int b = inputDate % 4;
        int c = inputDate % 7;
        int s = 19 * a + 24;
        int d = s % 30;
        int t = 2 * b + 4 * c + 6 * d + 5;
        int e = t % 7;
        int date = 22 + d + e;

        int month;

        if(date < 32){
            month = MARCH;
        } else {
            date = d + e - 9;

            if(date == 26){
                date = 19;
            } else if(date == 25 && a == 16 && d == 28){
                date = 18;
            }

            month = APRIL;
        }

        output(date, month);
    }

    /**
     * Simple output
     * @param date for Easter Day
     * @param month for Easter Day
     */
    private void output(int date, int month){
        System.out.print("Easter Day for " + inputDate + " is: " + date + "/" + month);
    }


    public static void main(String[] args){
        new EasterDay();
    }
}
