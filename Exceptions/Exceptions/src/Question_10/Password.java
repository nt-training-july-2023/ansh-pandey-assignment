package Question_10;

import java.util.Scanner;
class InvalidPasswordException extends Exception{
    public InvalidPasswordException(String message) {
        super(message);
        System.out.println(message);
    }
}

public class Password
{
    public static void main(String[] args) {

   try{
    Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the password :");
        String password   = Sc.nextLine();
        checkPaswordCriteria(password);
        System.out.println("password is valid");
    } catch (InvalidPasswordException e) {
       System.out.println("Invalid Password "+e.getMessage());
   }
    }

    private static void checkPaswordCriteria(String password)throws InvalidPasswordException {

        if(!(password.length()>=8)){
            throw new InvalidPasswordException("Password must have at least eight character");
        }
        boolean Con_Letter =false;
        boolean con_num = false;
        for(char c: password.toCharArray()){
            if(Character.isLetter(c)){
                Con_Letter =true;
            } else if (Character.isDigit(c)) {
                con_num = true;

            }
        }
        if (!con_num|| !Con_Letter){
            throw new InvalidPasswordException("Password must contain letters and numbers");
        }
    }
    }
