package basicofjava.exerciseincdec;

public class IncDec {
    public static void main(String[] args) {
        int a =5;
        ++a;
        System.out.println ( "The value a is "+a); //(result is 6)
        a++;
        System.out.println("The value a is after a++" +a); //(result is 7)
        System.out.println("The value a is after a++" +a++);
        //result is 7 now
        System.out.println("The value a is after a++" +a);
        // result is 8
        System.out.println("The value a is after a++" + ++a);
        // result is 9

        // for decrement operator
        System.out.println("The value a is after a++" +a--);
        // result is 9
        System.out.println( "The value a is after a++" + a);
        // result is 8
        System.out.println("The value a is after a++" + --a);
        // result is  7

    }
}
