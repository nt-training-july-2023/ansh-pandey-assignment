package List_String;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
                list.add("Sunday");
        list.add("monday");
        list.add("tuesday");
        list.add("Wed");

        Scanner S = new Scanner(System.in);

        try{
            System.out.println("Enter the index");
            int ind= S.nextInt();
            if(list ==null){
                throw new NullPointerException();
            }

            System.out.println( "the element will be  at index "+ ind +" is" +list.get(ind));
        } catch ( IndexOutOfBoundsException e){
            System.out.println("Invlaid index ");
        } catch (NullPointerException e){
            System.out.println("The list is null");
        }
//

    }
}
