package Area_of_Shapes;


import java.util.Scanner;
/**
 *This is a rectangle area project
 *
 * @since 2023-07-24
 * @author Ansh Pandey
 *
 */
public class Area {
    /**
     *
     * @param a a length of Rectangle
     * @param b b width of Rectangle
     */
    public static void   Rect_Area(double a,double b){
        System.out.println("Area of Rectangle is "+ a*b);
    }

    /**
     *
     * @param r radius of circle
     */
    public static void   Circle_Area(double r){
        System.out.println("Area of Circle is "+ Math.PI*r*r);
    }

    /**
     *
     * @param b base of triangle
     * @param h height of triangle
     */
    public static  void   Triangle_Area(double b,double h){
        System.out.println("Area of triangle is "+ (b*h)/2);
    }

    /**
     *
     * @param args
     */


@SuppressWarnings("reaources")
    public static void main(String[] args) {
        Area area = new Area();
        Scanner S= new Scanner(System.in);
        int choice;


    do {
            System.out.println("choose shape");
            System.out.println("1. Rect");
            System.out.println("2.Circle");
            System.out.println("3.Triangle");
            choice=S.nextInt();

        switch (choice){
                case 1:
                    System.out.println("Enter length and breadth of rect");
                    double l=S.nextDouble();
                    double br=S.nextDouble();
                    area.Rect_Area(l,br);
                    break;
                case 2:
                    System.out.println("Enter Radius of Circle");
                    double r=S.nextDouble();

                    area.Circle_Area(r);
                    break;
                case 3:
                    System.out.println("Enter height and breadth of triangle");
                    double h=S.nextDouble();
                    double b=S.nextDouble();
                    area.Rect_Area(h,b);
                    break;
                default:
                    System.out.println("none");
            }



    }
        while (choice>3);


    }
}
