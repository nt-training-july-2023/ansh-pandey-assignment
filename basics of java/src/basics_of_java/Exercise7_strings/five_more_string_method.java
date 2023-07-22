package basics_of_java.Exercise7_strings;

public class five_more_string_method {
    public static void main(String[] args) {


        // Trimming the word
        String St = "I am working in nucleusTeq";
        System.out.println("Trim the word " + St.trim());
        // To Upper Case
        System.out.println( "Convert in to Lower case "+St.toLowerCase());
        // TO Upper Case
        System.out.println( "Convert in to Upper case "+St.toUpperCase());

        // equals method
        Boolean b = "Ansh".equals("ansh");
        System.out.println("Checking Equality  " + b);
        b = "Ansh".equals("Ansh");
        System.out.println("Checking Equality  " + b);

    }



}
