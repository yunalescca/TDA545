package WeekTwo;

/**
 * Created by Yunalescca on 2017-07-13.
 *
 * a) Create a method sign(int n), which returns 1, -1 or 0 if n is positive, negative or 0 respectively
 *
 * b) Create a method factorial(int n) which calculates n!
 *
 * c) Create a method gcd(int a, int b) which returns the greatest common divisor for a and b, with the help of Euclid's method
 */
public class Methods {

    public Methods(){

        /*System.out.println(sign(100));
        System.out.println(sign(-50));
        System.out.println(sign(0));

        System.out.println(factorial(5));*/


        System.out.println(gcd(192, 270));


    }

    /**
     * Checks sign for n
     * @param n
     * @return 1 if n is positive, -1 if negative and 0 otherwise
     */
    private int sign(int n){

        if (n > 0) {
            return 1;
        } else if (n < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    /**
     * function for n factorial
     * @param n
     * @return the factorial of n
     */
    private int factorial(int n){
        if(n == 0){
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }


    /**
     * Calculates the greatest common divisor of two integers with the help of Euclid's algorithm
     * @param a integer a
     * @param b integer b
     * @return the greatest common divisor
     */
    private int gcd(int a, int b){

        int rest;

        if (a < 0) {
            a = (-1) * a;
        }

        if (b < 0) {
            b = (-1) * b;
        }

        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("Error! Both a and b cannot be 0");
        }

        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else {
            rest = a % b;

            a = b;
            b = rest;
        }

        return gcd(a,b);
    }

    public static void main(String[] args){
        new Methods();
    }
}
