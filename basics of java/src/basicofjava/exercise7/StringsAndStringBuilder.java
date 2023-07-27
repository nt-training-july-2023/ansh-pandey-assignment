package basicofjava.exercise7;

public class StringsAndStringBuilder {
    // this is about string
    // Concatenates to String
    public static void concaat(String first)
    {
        first = first + "Pandey";
    }

    // String_Builder
    // Concatenates to StringBuilder
    public static void concat2(StringBuilder second)
    {
        second.append("pandey");
    }

    public static void main(String[] args) {
        String Original ="Ansh";
        concaat(Original);
        System.out.println(Original);
        StringBuilder original = new StringBuilder("Ansh");
        concat2(original);
        System.out.println(original);

        // here we can clearly see that string is immutable thar is its value is fixed but in case of  string builder its value  will change that is muttable pr changeable
   // but stringBuilder execute faster  than string when performing the modification program


    }
}
