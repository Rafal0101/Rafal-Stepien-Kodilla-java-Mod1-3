package part2.ex6;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 2017-08-10.
 */
public class Kodilla26 {
    public static void main(String[] args) {

        Student student1 = new Student(1, "John", "Travolta");
        Student student2 = new Student(2, "Nicolas", "Cage");

        Grade grade1 = new Grade(5, 2, 3);
        Grade grade2 = new Grade(1, 2, 5);


        HashMap<Student, Grade> schoolDiary = new HashMap<>();
        schoolDiary.put(student1, grade1);
        schoolDiary.put(student2, grade2);

        for (Map.Entry<Student, Grade> entry : schoolDiary.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }
}
