package basicofjava.exercise4;

import java.util.Scanner;

public class Reversing {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),remainder;
        int Reverse_number=0;
        while(n!=0){
            remainder= n%10;
            Reverse_number = Reverse_number*10 + remainder;
            n = n/10;

        }
        System.out.println(Reverse_number);
    }
}
