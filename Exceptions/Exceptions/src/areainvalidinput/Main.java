package areainvalidinput;

import java.util.Scanner;

class InvalidDimensionException extends Exception{
    public InvalidDimensionException(String message) {
        super(message);
    }
}
class Dimensions {
    double length;
    double width;

    public Dimensions(double length, double width){
        this.length=length;
        this.width= width;
    }
    public void area (double length,double width) throws InvalidDimensionException {

            if (length<=0 || width<=0) {
                throw new InvalidDimensionException("Invalid Dimensions . length and width must be +ve");
            }
        System.out.println(length*width);

    }

}

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("enter  the length ");
        double length = S.nextDouble();
        System.out.println("Enter the breadth");
        double width = S.nextDouble();
        try{
            Dimensions dimensions = new Dimensions(length,width);
            dimensions.area(length,width);
        }
        catch (InvalidDimensionException e){
            System.out.println("Invalid Dimensions "+ e.getMessage());
        }
    }


}
