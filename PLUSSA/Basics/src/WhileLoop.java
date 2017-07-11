import java.math.BigDecimal;

/**
 * Created by Yunalescca on 2017-07-11.
 *
 * Write a program which prints the following (all should use a while loop):
 *
 * a) -20, 19, ..., 3
 * b) 10, 9, ..., -10
 * c) 5, 10, ..., 95, 100
 * d) 0.0, 0.3, ..., 8.7, 9.0
 * e) 1/2, 1/4, ..., 1/256 (not 0.5, 0.25...)
 * f) Calculates the value for PI with the help of
 *      PI/4 = 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... (add 100 terms)
 */
public class WhileLoop {

    public WhileLoop(){

        whileA();
        //whileB();
        //whileC();
        //whileD();
        //whileE();
        //whileF();
    }

    private void whileA() {
        int i = -20;
        while (i <= 3) {
            System.out.println(i);
            i++;
        }
    }

    private void whileB() {
        int i = 10;
        while (i >= -10) {
            System.out.println(i);
            i--;
        }
    }

    private void whileC() {
        int i = 5;
        while (i <= 100) {
            System.out.println(i);
            i += 5;
        }
    }

    private void whileD() {
        BigDecimal j = BigDecimal.valueOf(0.0);
        while ((j.compareTo(BigDecimal.valueOf(9.0)) != 1)) {
            System.out.println(j);
            j = j.add(BigDecimal.valueOf(0.3));
        }
    }

    private void whileE() {
        int i = 2;
        while (i <= 256) {
            System.out.println("1/" + i);
            i += 2;
        }
    }

    private void whileF() {
        double pi = 1;
        int count = 1;
        double denominator = 3;

        while (count <= 99) {
            if (count % 2 != 0) {
                pi -= (1 / denominator);
            } else {
                pi += (1 / denominator);
            }
            count ++;
            denominator += 2;

            if (count == 100) {
                System.out.println("PI/4 = " + pi);
            }
        }
    }

    public static void main(String[] args){
        new WhileLoop();
    }
}
