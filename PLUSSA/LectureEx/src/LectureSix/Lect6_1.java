package LectureSix;

/**
 * Created by Yunalescca on 2017-07-05.
 * Prints:
 * XXXXXXXXXX
 * XXXXXXXXX
 * XXXXXXXX
 * XXXXXXX
 * XXXXXX
 * XXXXX
 * XXXX
 * XXX
 * XX
 * X
 */
public class Lect6_1 {

    public Lect6_1() {

        int n = 10;

        for(int i = 0; i < 10; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print("X");
            }
            System.out.println();
            n--;
        }
    }

}
