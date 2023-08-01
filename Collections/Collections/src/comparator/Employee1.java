package comparator;

import comparable.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// used for multiple sorting we use Comparator


 public class Employee1 {
     // problem in comparable is that only one logic or single sorting is done
     private String name;
     private int id;
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


     public Employee1(String name, int id, String phone) {
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
        List<Employee1> list1 = new ArrayList<>();
        list1.add(new Employee1("Ansh Pandey", 1, "9977986276"));
        list1.add(new Employee1("Anchal Sharma", 3, "9131210806"));
        list1.add(new Employee1("Ashish Sharma", 2, "9074720661"));
        System.out.println(list1);
        Collections.sort( list1,new IdComparator());
       System.out.println(list1);
       List<Employee1>list2 = new ArrayList<>(list1);
       Collections.sort(list2,new NameComparator());
        System.out.println(list2);
    }

}
