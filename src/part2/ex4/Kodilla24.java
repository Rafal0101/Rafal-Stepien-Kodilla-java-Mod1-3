package part2.ex4;

/**
 * Created by User on 2017-08-09.
 */
public class Kodilla24 {
    public static void main(String[] args) {
        int primitiveInt = 8;
        char primitiveChar = 's';
        boolean primitiveBoolean = false;
        Integer wrapperInt = 8;
        Character wrapperChar = 's';
        Boolean wrapperBoolean = false;

        if (primitiveInt == wrapperInt && primitiveChar == wrapperChar && primitiveBoolean == wrapperBoolean) {
            System.out.println("SUCCESS!");
        }
        else {
            System.out.println("Something went wrong ...");
        }
    }
}
