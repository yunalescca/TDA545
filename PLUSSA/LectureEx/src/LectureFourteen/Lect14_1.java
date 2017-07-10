package LectureFourteen;

/**
 * Created by Yunalescca on 2017-07-10.
 * Simple recursive teting
 */
public class Lect14_1 {

    private int n;

    public Lect14_1(int n){
        this.n = n;
        System.out.println(recFunc(n));
    }

    public int recFunc(int n){
        if(n == 1){
            return n;
        } else {
            return n * recFunc(n-1);
        }
    }

}
