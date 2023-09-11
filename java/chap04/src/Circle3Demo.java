class Circle3{
    double radius;
    String color;

    public Circle3(double r, String c){
        this.radius = r;
        this.color = c;
    }

    public Circle3(double r){
        this.radius = r;
        this.color = "blue";
    }

    public Circle3(String c){
        this.radius = 10.0;
        this.color = c;
    }

    public Circle3(){
        this.radius = 10.0;
        this.color = "red";
    }
}

public class Circle3Demo {
    public static void main(String[] args){
        Circle3 c1 = new Circle3(10.0,"red");
        Circle3 c2 = new Circle3(5.0);
        Circle3 c3 = new Circle3("yellow");
        Circle3 c4 = new Circle3();
    }    
}
