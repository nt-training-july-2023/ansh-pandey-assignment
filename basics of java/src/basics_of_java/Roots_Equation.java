package basics_of_java;

import java.math.MathContext;
import java.util.Scanner;

import static java.lang.Math.sqrt;


public class Roots_Equation {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        float a = S.nextFloat();
        float b = S.nextFloat();
        float c = S.nextFloat();

        System.out.println("equation is " + a + "x^2+ " + b + "x+ " + c);
        double determinant = b*b -4*a*c;
        double d = (-b+ Math.sqrt(determinant)/2*a);
        double e = (-b- Math.sqrt(determinant)/2*a);


        System.out.println("roots of equation is "+d +"and "+e);
    }
}
