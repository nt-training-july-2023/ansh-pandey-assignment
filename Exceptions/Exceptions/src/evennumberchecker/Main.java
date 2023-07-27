package evennumberchecker;

import java.util.InputMismatchException;
import java.util.Scanner;

class NotEvenNumberException extends Exception{
    public NotEvenNumberException(String message) {
        super(message);
    }
}
class EvenNumberChecker{
    public static void Checker(int Number) throws NotEvenNumberException{
        if(!(Number%2==0)){
            throw new NotEvenNumberException("The number u give is not even at all");
        }
        if(Number%2==0){
            System.out.println("It is a Even number");
        }
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num =s.nextInt();
        try{
            EvenNumberChecker E = new EvenNumberChecker();
            E.Checker(num);
        } catch (NotEvenNumberException e) {
            System.out.println("Error "+e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Enter a valid input");
        }
    }
}
