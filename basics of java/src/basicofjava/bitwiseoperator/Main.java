package basicofjava.bitwiseoperator;


// Java program to illustrate
// bitwise operators

public class Main {
    public static void main(String[] args)
    {
        // Initial values
        int num1 = 45;
        int num2= 20;

        // bitwise and
        // 101101 & 10100 = 100000
        System.out.println("num1&num2 = " + (num1& num2));

        // bitwise or
        // 101101 | 10100 = 7
        System.out.println("num1|num2 = " + (num1 | num2));

        // bitwise XOR
        // 101101 XOR 10100
        System.out.println("num1^num2 = " + (num1 ^ num2));

        //// bitwise not
        //   101101 ~
        System.out.println("~num1 = " + ~num1);



    }
}
