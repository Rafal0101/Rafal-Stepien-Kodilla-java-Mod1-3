package part1.ex2;

/**
 * Created by User on 2017-08-07.
 */
public class Kodilla12 {
    public static void main (String[] args) {

        ATMImpl atmImpl = new ATMImpl();

        atmImpl.connectionEstablished();
        atmImpl.createDeposit();
        atmImpl.makePayment();
        System.out.println(Atm.connectionClosed());
    }
}
