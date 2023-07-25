package OOPs_.OOPS_Concept.Final;

public class Final_Keyword {
    // a final variable
    // direct initialize
    final int Direct = 5;

    // a blank final variable
    final int Blank;


    // a final static variable
    // direct initialize
    static final double Static_Variable = 3.35d;

    // a  blank final static  variable
    static final double Blanlk_Static_variable;

    // instance initializer block for
    // initializing Blank
    {
        Blank = 25;
    }

    // static initializer block for
    // initializing Static Blank_Static
    static{
         Blanlk_Static_variable= 2.3;
    }


}
