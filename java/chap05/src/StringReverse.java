import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("문자열 입력:");
        String s = in.nextLine();
        //String strReverse;

        for(int i=s.length(); 0<=i; i--){
            System.out.print(s.charAt(i-1));
            //strReverse += String.format("%c", str.charAt(i-1));
        }
        in.close();
    }
}
