package Exercise4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int reversed_num =0 ,remainder;
        int temp =n;
        while (n!=0){
           remainder= n%10;
            reversed_num = reversed_num*10 +remainder;
            n/=10;
        }
        n= temp;
        if (reversed_num ==n){
            System.out.println( n+ " number is palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
