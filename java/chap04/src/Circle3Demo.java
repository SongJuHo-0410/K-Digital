class Circle{
    double radius;
    String color;

    public Circle(double r, String c){
        radius = r;
        color = c;
    }

    public Circle(double r){
        radius = r;
        color = "blue";
    }

    public Circle(String c){
        radius = 10.0;
        color = c;
    }

    public Circle(){
        radius = 10.0;
        color = "red";
    }
}

public class Circle3Demo {
    public static void main(String[] args){
        Circle c1 = new Circle(10.0,"red");
        Circle c2 = new Circle(5.0);
        Circle c3 = new Circle("yellow");
        Circle c4 = new Circle();
    }    
}
