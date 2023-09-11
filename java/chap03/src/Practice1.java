import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int score = in.nextInt();

        if(score % 2 == 0)
            System.out.println("2배수");
        if(score % 3 == 0)
            System.out.println("3배수");
        if(score % 5 == 0)
            System.out.println("5배수");
    }
}
