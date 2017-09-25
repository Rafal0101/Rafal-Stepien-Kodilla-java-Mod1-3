package part1.ex4;

/**
 * Created by User on 2017-08-11.
 */
abstract public class Bank {
    private void receiveCashAmount() {
        System.out.println("Payment amount receiving by Bank ...");
    }

    private void checkAccountBalance() {
        System.out.println("Checking account blance ...");
    }

    private void confirmAbilityToPay() {
        System.out.println("Confirmation of ability to pay.");
    }

    abstract protected void enterCard();

    abstract protected void enterPIN();

    abstract protected void enterCashAmount();

    abstract protected void executePayment();

    abstract protected void displayThanks();

    public void run() {
        this.enterCard();
        this.enterPIN();
        this.enterCashAmount();
        this.receiveCashAmount();
        this.checkAccountBalance();
        this.confirmAbilityToPay();
        this.executePayment();
        this.displayThanks();
    }
}
