package part2.ex6;

/**
 * Created by User on 2017-08-10.
 */
public class Student {
    private Integer id;
    private String name;
    private String surname;

    public Student(Integer id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public String toString() {
        return "Student: " + "id=" + id + ": " + name + " " + surname;
    }
}
