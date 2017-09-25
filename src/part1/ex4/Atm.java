package part1.ex4;

/**
 * Created by User on 2017-08-11.
 */
public class Atm extends Bank {

    protected void enterCard() {
        System.out.println("Please, enter your card.");
    }

    protected void enterPIN() {
        System.out.println("Please, enter your PIN number.");
    }

    protected void enterCashAmount() {
        System.out.println("Please, enter cash amount");
    }

    protected void executePayment() {
        System.out.println("Please wait, payment is executing ...");
    }

    protected void displayThanks() {
        System.out.println("Thank you for using our Bank!");
    }
}
