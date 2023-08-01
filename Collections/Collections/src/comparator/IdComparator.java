package comparator;

import java.util.Comparator;

class IdComparator implements Comparator<Employee1> {

    @Override
    public  int compare(Employee1 o1, Employee1 o2) {
        return o1.getId()-o2.getId();
    }
}