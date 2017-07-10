package LectureSix;

/**
 * Created by Yunalescca on 2017-07-05.
 * Testing with enums and generic methods
 */
public class Lect6_4 {

    public enum Weekday {
        MON, TUE, WED, THU, FRI, SAT, SUN
    }

    public enum Color {
        WHITE, GREY, BLUE, RED, GREEN, YELLOW, ORANGE, PINK, BLACK
    }

    public Lect6_4(){
        Weekday[] days = Weekday.values();

        Weekday d = Weekday.MON;

        testMethod(days);

        Integer[] numbers = {1,2,3,4,5};

        testMethod(numbers);
    }

    //A Generic method will not work with primitive types and arrays of primitive types (must extend Object)
    <T> void testMethod (T[] arr){
        for(T t : arr){
            System.out.println(t);
        }
    }

}
