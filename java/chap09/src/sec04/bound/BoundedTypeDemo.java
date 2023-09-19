package sec04.bound;

import sec03.*;
import sec04.*;

public class BoundedTypeDemo {
    public static void main(String[] args) {
        Cup<Beer> c1 = new Cup<>();
        Cup<Boricha> c2 = new Cup<>();
    }
}

class Cup <T extends Beverage>{
    private T beverage;

    public T getBeverage(){
        return beverage;
    }

    public void setBeverage(T beverage){
        this.beverage = beverage;
    }
}
