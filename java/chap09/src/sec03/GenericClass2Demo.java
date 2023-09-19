package sec03;

import sec03.generic.Cup;

public class GenericClass2Demo {
    public static void main(String[] args) {
        Cup<Beer> c = new Cup<Beer>();

        c.setBeverage(new Beer());
        Beer b1 = c.getBeverage();

        b1 = c.getBeverage();
    }
}
