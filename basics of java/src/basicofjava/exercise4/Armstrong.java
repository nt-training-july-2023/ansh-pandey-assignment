package basicofjava.exercise4;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int remainder =0,sum=0,number;
        int n = sc.nextInt();
        number =n;

        while (number>0){
            remainder = number%10;
            sum+=Math.pow(remainder,3);
            number =number/10;
        }
        if (sum ==n){
            System.out.println("armstrong number");
        }
        else {
            System.out.println("not an armstrong number");
        }

    }
}