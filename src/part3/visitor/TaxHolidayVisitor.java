package part3.visitor;

public class TaxHolidayVisitor implements Visitor {

    @Override
    public double visit(Napoj napoj) {
        System.out.println("Wakacyjny Podatek od napoju:");
        return  napoj.getPrice() * 0.50;
    }

    @Override
    public double visit(Papieros papieros) {
        System.out.println("Wakacyjny Podatek od papierosow:");
        return  papieros.getPrice() * 0.7;
    }

    @Override
    public double visit(Dzem dzem) {
        System.out.println("Wakacyjny Podatek od dzemu:");
        return  dzem.getPrice() * 0.4;
    }
}
