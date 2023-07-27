package oops.staticc;

class Employee{
    static String Company_name ="NucleusTeq";
    // If variable is declared as static, it is known as a static variable.
    // like working in  a common company employee have common company
    String Name ;
    int Employee_ID;
    String  skills;

    public Employee(String name, int employee_ID, String skills) {
        Name = name;
        Employee_ID = employee_ID;
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "Name=" + Name +
                ", Employee_ID=" + Employee_ID +
                ", skills='" + skills + '\'' +
                ']';
    }
}


public class Static_Variable {
    public static void main(String[] args) {
        Employee employee =new Employee("Ansh",0142,"java ,SpringBoot");
        System.out.println(employee);
    }

}
