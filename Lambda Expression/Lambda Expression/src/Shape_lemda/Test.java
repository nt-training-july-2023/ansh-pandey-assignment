package Shape_lemda;

interface  shape{
    public  void area();
}

public class Test {
    public static void main(String[] args) {

        int length = 5;
        int breadth = 10;
        int radius = 4;
        int dimension = 10;
        int height =5;



        shape Rect = ()-> {
            int area = 0;
            area = length * breadth;
            System.out.println(" the area of rect is " + area);
        };
        shape Square=()->{
            int area =0;
            area = dimension*dimension;
            System.out.println(" The area of square is "+ area);
        };
        shape Circle=()-> {
            double area = 0;
            area = Math.PI * radius * radius;
            System.out.println("The area of square is " + area);
        };
        shape cube=()-> {
            double area = 0;
            area = Math.pow(dimension, 3);
            System.out.println("The area of cube is " + area);
        };
        shape sphere =()-> {
            double area = 0;
            area = 4 * Math.PI * radius * radius;
            System.out.println("The area of sphere is " + area);
        };
        shape Cylinder =()-> {
            double area = 0;
            area = 2 * Math.PI * radius * height;
        };

        Rect.area();
        sphere.area();
        Cylinder.area();
        Square.area();
        cube.area();




        }



    }

