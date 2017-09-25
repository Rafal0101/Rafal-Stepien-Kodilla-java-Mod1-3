package part3.visitor;

public class TaxVisitor implements Visitor {

    @Override
    public double visit(Napoj napoj) {
        System.out.println("Podatek od napoju:");
        return  napoj.getPrice() * 0.18;
    }

    @Override
    public double visit(Papieros papieros) {
        System.out.println("Podatek od papierosow:");
        return  papieros.getPrice() * 0.32;
    }

    @Override
    public double visit(Dzem dzem) {
        System.out.println("Podatek od dzemu:");
        return  dzem.getPrice() * 0.08;
    }
}
