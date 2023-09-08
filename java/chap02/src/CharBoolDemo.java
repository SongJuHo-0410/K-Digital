/*
 * 문자 및 논리 타입 응용하는 자바 프로그램
 */

public class CharBoolDemo {
    public static void main(String[] args){
        char ga1 = '가';
        char ga2 = '\uac00';

        boolean cham = true;
        boolean geojit = false;

        System.out.println(ga1);
        System.out.println((int)ga1); //형변환
        System.out.println(ga2);
        System.out.println(++ga2);
        System.out.println(cham + "가 아니면 " + geojit + "입니다.");
    }
}
