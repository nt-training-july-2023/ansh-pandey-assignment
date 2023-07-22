package basics_of_java.Exercise7_strings;

import java.util.Scanner;

public class String_Methods {
    public static void main(String[] args) {


        String str = "AnshPandey is a Employee at Nucleusteq";
        // or String s= new String ("AnshPandey is a Employee at Nucleusteq");
        // using length method
        // Returns the number of characters in the String.
        System.out.println("String length = " + str.length());


        // Concatenates string second to the end of string first.
        String string1 = "Ansh";
        String string2 = " Pandey";
        System.out.println(" string  will bw = " +
                string1.concat(string2));

        Scanner S = new Scanner(System.in);
         int n =S.nextInt();
        // Get the character at the index just give the index.
        if(n<string1.length()) {
            System.out.println("Character at nth position = "
                    + string1.charAt(3));
        }
        String st= "fbsofncwincwc";
        System.out.println("index of string "+ st.indexOf("f"));

        String st1 ="asccnsj fbcn fnan";
        System.out.println(st1.replace('s','f'));



    }
}
