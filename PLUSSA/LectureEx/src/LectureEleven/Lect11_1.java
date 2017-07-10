package LectureEleven;

/**
 * Created by Yunalescca on 2017-07-07.
 * SImple testing with exceptions
 */
public class Lect11_1 {

    public Lect11_1(){

        exceptionOne();
        exceptionTwo();

    }

    private void exceptionOne() {
        int i = 5;
        int j = 0;

        try{
            System.out.println(i/j);
        } catch(ArithmeticException e){
            System.out.println("You divided by 0!");
        } finally {
            System.out.println("Here's other things to do anyways");
        }


        System.out.println("This happens");
    }

    private void exceptionTwo() {

        String s = null;

        if(s == null){
            throw new NullPointerException("Nulls not allowed");
        }

        System.out.println("So this won't happen");
    }
}
