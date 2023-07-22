package basics_of_java.Area_triangle;

import java.util.Scanner;



public class Main {
    static double area(double h, double b)
    {

        // area of a triangle
        return (h * b) / 2;
    }
    public static void main(String[] args) {
        System.out.println("area of triangle ");
        Scanner S = new Scanner(System.in);
        float height =S.nextFloat();
        float base = S.nextFloat();

        System.out.println("The area of triangle is  "+ area(height,base));
    }
}