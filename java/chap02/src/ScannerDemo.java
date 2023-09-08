import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("x :");
        int x = in.nextInt();
        System.out.print("y :");
        int y = in.nextInt();
        System.out.printf("%d * %d은 %d입니다.",x,y,x*y);
    }
    
}
