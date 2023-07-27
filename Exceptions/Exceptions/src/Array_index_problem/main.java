package Array_index_problem;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter thw value of index");
        int index = S.nextInt();
        int Arr[] = { 2,3,5,7,8,10};
        try{
            int element = getElementAt(index,Arr);
            System.out.println(" the value of arr[index ] on index "+ index +"is " +Arr[index]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("The value on that index is invalid");
        }

    }

    private static int getElementAt(int index, int[] arr) {
        if(arr == null){
            throw new NullPointerException();
        }
        return arr[index];
    }
}
