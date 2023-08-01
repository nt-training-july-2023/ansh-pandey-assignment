package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(3);
        marks.add(45);
        marks.add(455);
        marks.add(34);
        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);
        // but if the generic type is object
    }

}
