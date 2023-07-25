package OOPs_.OOPS_Concept;
 class Employee {
    private int ID;
    private String name;

     @Override
     public String toString() {
         return "Employee{" +
                 "ID=" + ID +
                 ", name='" + name + '\'' +
                 '}';
     }

     public int getID() {
         return ID;
     }

     public void setID(int ID) {
         this.ID = ID;
     }

     public Employee() {
     }

     public Employee(int ID, String name) {
         this.ID = ID;
         this.name = name;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }
 }



public class Encapsulation {



    public static void main(String[] args) {

        Employee employee = new Employee(5,"Ansh Pandey");
        System.out.println(employee.getName());
        System.out.println(employee.toString());

    }
}
