package part3.visitor;

public interface Visitor {
    public double visit(Napoj napoj);
    public double visit(Papieros papieros);
    public double visit(Dzem dzem);
}
