import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = in.nextInt();

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            System.out.println("윤년입니다.");
        else
            System.out.println("평년입니다.");
    }
}
