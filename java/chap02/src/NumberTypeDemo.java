/*
 * 콘솔에 정수 및 실수 탑입 응용하는 자바 프로그램
 */

public class NumberTypeDemo {
    public static void main(String[] args){
        int mach;
        int distance;
        mach = 340;
        distance = mach * 60 * 60;
        System.out.println("소리가 1시간 동안 가는 거리: " + distance + "m");

        double radius = 10;
        double area;
        area = radius * radius * 3.14;
        System.out.println("반지름이 " + radius + "인 원의 넓이: " + area);
    }
}
