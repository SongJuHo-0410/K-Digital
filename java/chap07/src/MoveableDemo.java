interface Moveable{
    void move(int x);
}

class Car implements Moveable{
    private int pos = 0;

    public void move(int x){
        pos += x;
    }

    public void show(){
        System.out.println(pos + "m 이동했습니다.");
    }
}

public class MoveableDemo {
    public static void main(String[] args) {
        Moveable m = new Car();

        m.move(5);

        Car c = (Car) m;
        c.move(10);
        c.show();
    }
}
