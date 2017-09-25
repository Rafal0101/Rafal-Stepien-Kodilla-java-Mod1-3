package part2.ex6;

/**
 * Created by User on 2017-08-10.
 */
public class Grade {
    double math;
    double geography;
    double biology;

    public Grade(double math, double geography, double biology) {
        this.math = math;
        this.geography = geography;
        this.biology = biology;
    }

    public String toString() {
        return "Average of grades: " + (math + geography + biology) / 3;
    }
}
