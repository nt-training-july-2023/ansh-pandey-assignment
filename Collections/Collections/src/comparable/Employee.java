package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee> {

    // problem in comparable is that only one logic or single sorting is done
    private  String name;
    private  int id;
    private String phone;


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public Employee(String name, int id, String phone) {
        this.name = name;
        this.id = id;
        this.phone = phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("Ansh Pandey",1,"9977986276"));
        list.add(new Employee("Anchal Sharma",2,"9131210806"));
        list.add(new Employee("Ashish Sharma",3,"9074720661"));
        System.out.println(list);
        //Collections.sort(list);
        System.out.println(list);
    }


   // @Override
    public int compareTo(Employee o) {

        // for decreasing order
        return o.id-this.id;
        // for increasing order
        // return this.id-o.id;
    }


}
