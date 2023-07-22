package basics_of_java.Exercise6_array;

import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int Largest_Number= Integer.MIN_VALUE;
        int num = S.nextInt();
        int Array[] =new int[num];
        {
            for( int i =0; i<num ;i++){
                Array[i]= S.nextInt();
            }
        }
        for (int i = 0; i < num; i++) {
            if  (Array[i]>Largest_Number){
                Largest_Number =Array[i];
            }
        }
        System.out.println(Largest_Number);
    }

}