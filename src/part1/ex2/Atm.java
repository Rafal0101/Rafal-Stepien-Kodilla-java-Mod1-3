package part1.ex2;

/**
 * Created by User on 2017-08-07.
 */
public interface Atm {
    void createDeposit();
    void makePayment();

    default void connectionEstablished() {
        System.out.println("Bank connection established.");
    }

    static String connectionClosed() {
        return "Bank connection closed.";
    }
}
