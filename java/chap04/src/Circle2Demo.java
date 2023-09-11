class Circle2{
    private double radius;

    public Circle2(double r){
        radius = r;
    }

    void print(){
        System.out.println(radius);
    }
}

public class Circle2Demo{
    public static void main(String[] args){
        Circle2 myCircle = new Circle2(10.0);
        myCircle.print();
    }
}