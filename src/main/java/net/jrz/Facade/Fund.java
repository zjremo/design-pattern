package net.jrz.Facade;

public class Fund {
    private final Stock2 gu2;
    private final Stock3 gu3;
    private final  Realty2 r2;
    private final NationalDebt2 nationalDebt2;

    public Fund() {
        gu2 = new Stock2();
        gu3 = new Stock3();
        r2 = new Realty2();
        nationalDebt2 = new NationalDebt2();
    }

    public void buyFund(){
        gu2.buy();
        gu3.buy();
        r2.buy();
        nationalDebt2.buy();
    }

    public void sellFund(){
        gu2.sell();
        gu3.sell();
        r2.sell();
        nationalDebt2.sell();
    }
}
