package part3.visitor;

public class Napoj implements Visitable {
    private double price;

    public Napoj(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
