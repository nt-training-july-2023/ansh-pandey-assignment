package OOPs_.OOPS_Concept.PolyMorphism;

// This is a example of runtimme polymorphism
// method overriding
class Bhind{
    void about(){
        System.out.println("It is a district and contains many tehsils");
    }
}
class Mehgaon extends Bhind{
    void about(){
        System.out.println(" It is the part of Bhind District or tehsil");
    }
}
class Malanpur extends Bhind{
    void about(){
        System.out.println("All industry are in Malanpur");
    }
}

public class City {
    public static void main(String[] args) {
       Bhind bhind =new Mehgaon();
       Bhind malanpur = new Malanpur();
       bhind.about();
    }
}
