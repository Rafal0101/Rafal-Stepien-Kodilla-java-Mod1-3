package part3.visitor;

public interface Visitable {
    public double accept(Visitor visitor);
}
