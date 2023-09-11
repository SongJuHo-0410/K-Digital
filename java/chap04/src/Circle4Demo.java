class Circle4{
    double radius;
    static int numOfCircles = 0;
    int numCircles = 0;

    public Circle4(double radius){
        this.radius = radius;
        numOfCircles++;
        numCircles++;
    }
}

public class Circle4Demo {
    public static void main(String[] args){
        Circle4 myCircle = new Circle4(10.0);
        Circle4 yourCircle = new Circle4(5.0);

        System.out.println("원의 개수: " + Circle4.numOfCircles);
        System.out.println("원의 개수: " + yourCircle.numCircles);
    }    

    void print(){
        System.out.println("인스턴스 메서드입니다.");
    }
}
