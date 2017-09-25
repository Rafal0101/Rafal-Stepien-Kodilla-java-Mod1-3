package part3.visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        TaxVisitor taxVisitor = new TaxVisitor();
        TaxHolidayVisitor taxHolidayVisitor = new TaxHolidayVisitor();

        Dzem dzem = new Dzem(80);
        Napoj napoj = new Napoj(120);
        Papieros papieros = new Papieros(75);

        System.out.println(dzem.accept(taxVisitor));
        System.out.println(napoj.accept(taxVisitor));
        System.out.println(papieros.accept(taxVisitor));
        System.out.println(dzem.accept(taxHolidayVisitor));
        System.out.println(napoj.accept(taxHolidayVisitor));
        System.out.println(papieros.accept(taxHolidayVisitor));

    }
}
