package part1.ex1;

/**
 * Created by User on 2017-08-07.
 */
public class Validator {
    public String validateAgeAndHeight(double age, double height) {
        // if(age > 30 && height > 160) {
        if(age >= 30 && height >= 160) {
            return "User is older than 30 and higher then 160cm";
        }
        else {
            return "User is younger than 30 or lower than 160cm";
        }
    }
}
