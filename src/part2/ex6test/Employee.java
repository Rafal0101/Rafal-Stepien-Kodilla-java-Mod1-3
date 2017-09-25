package part2.ex6test;

/**
 * Created by User on 2017-08-10.
 */
public class Employee {
    String firstName;
    String lastName;
    String peselId;

    public Employee(String firstName, String lastName, String peselId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselId = peselId;
    }

    @Override
    public boolean equals(Object o) {
        final Employee e = (Employee) o;
        return this.firstName.equals(e.firstName) && this.lastName.equals(e.lastName) && this.peselId.equals(e.peselId);

    }

    @Override
    public int hashCode() {
        return Integer.parseInt(peselId.substring(0, 5));
    }

    @Override
    public String toString() {
        return  firstName + " " + lastName + " " + peselId;
    }
}
