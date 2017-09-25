package part1.ex1;

/**
 * Created by User on 2017-08-07.
 */
public class Kodilla11 {
    public static void main(String[] args) {

        String name = "Adam";
        double age = 30;
        double height = 176;

        Validator validator = new Validator();
        if (name != null) {
            System.out.println(validator.validateAgeAndHeight(age, height));
        }
    }
}
