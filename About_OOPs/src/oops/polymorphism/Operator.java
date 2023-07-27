package oops.polymorphism;
class Multiplication{
    public int Multiple(int a ,int b){
        return a*b;
    }
    public int Multiple(int a ,int b,int c){
        return a*b*c;
    }
    public float Multiple(float a ,float b){
        return a*b;
    }


}
class subtraction{
    int Subtract (int a ,int b){
        return a-b;
    }

}

// this is a example of compile time polymorphism
// in this type we have diff arguments or diff data types of data types
// Method overloading is there
public class Operator {
    public static void main(String[] args) {
     Multiplication multiplication = new Multiplication();
     multiplication.Multiple(3.45f,5.23f);
     multiplication.Multiple(4,6,7);
    }
}
