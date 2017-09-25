package part3.visitor;

public class Papieros implements Visitable {
    private double price;

    public Papieros(double price) {
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
