import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("사과 개수 입력: ");
        int apple = in.nextInt();
        int box = 1;

        while(apple > 10){
            apple -= 10;
            box += 1;
        }
        System.out.printf("사과:%d 박스:%d",apple,box);
    }
}
