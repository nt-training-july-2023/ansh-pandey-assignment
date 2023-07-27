package basicofjava.exercise6;
import java.util.Scanner;

public class AverageNum {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int num = S.nextInt();
        int average = 0;
        int array[] = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = S.nextInt();
        }
        for (int i = 0; i < num; i++) {
            average = average+array[i];
        }
        average = average/(num-1);
        System.out.println(average);
    }
}
