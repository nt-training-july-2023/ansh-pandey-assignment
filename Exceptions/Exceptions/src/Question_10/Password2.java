package Question_10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Password2 {

   // using string regex (regular expression)
      void IsValidPassword(String password2){
          String reg1 = "^(?=.*[0-9])(?=\\S+$).{8,}$";
          String reg2 ="^(?=.*[a-z])(?=\\S+$).{8,}$";

          String reg3 ="^(?=\\S+$).{8,}$";
          // compile the regex
          Pattern p1 = Pattern.compile(reg1);
          Pattern p2 = Pattern.compile(reg2);
          Pattern p3 = Pattern.compile(reg3);
          // lets match it with password

          Matcher m1 = p1.matcher(password2);
          Matcher m2 = p2.matcher(password2);
          Matcher m3 = p3.matcher(password2);

          try{
              if (!m3.matches()) {
                  throw new InvalidPasswordException("Atleast eight ");
              }
              else if(!m1.matches()){
                  throw new InvalidPasswordException("Must have the digit 0-9");
              } else if (!m2.matches()) {
                  throw new InvalidPasswordException("Must have character a-z");
              } else {
                  System.out.println("your password is valid ");
              }
          } catch (InvalidPasswordException e) {
              e.getMessage();
          }


      }

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Password");
        String password2 = Sc.nextLine();
        Password2 pass = new Password2();
        pass.IsValidPassword(password2);
        Sc.close();

        // using regex to check the password



    }
}
