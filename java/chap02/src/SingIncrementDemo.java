public class SingIncrementDemo {
    public static void main(String[] args){
        int plusOne = 1;
        int minusOne = -plusOne;
        System.out.println("plusOne은 " + plusOne + "입니다.");
        System.out.println("minusOne은 " + minusOne + "입니다.");
     
        int x = 1, y = 1;
        System.out.println("x = " + x + ", ++x = " + ++x);
        System.out.println("y = " + y + ", y++ = " + y++);
        System.out.println("x = " + x + ", y = " + y);

        //bad code
        // int a= 1, b = 0;
        // b = ++a + a++;
        // System.out.println("b = " + b);
        // a= 1;
        // b = 0;
        // b = ++a + ++a;
        // System.out.println("b = " + b);
    }
}
