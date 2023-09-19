package sec02;

public class TryCatch3Demo {
    public static void main(String[] args) {
        int[] array = {0,1,2};
        try {
            int x = array[3];
        } catch (Exception e) {
            System.out.println("어이쿠!!!");
            
        } catch (ArrayIndexOutOfBoundsException e) { // Exception 객체를 처리하는 catch에서 모든 예외 처리
            System.out.println("원소가 존쟁하지 않습니다.");
        }
        System.out.println("종료");
    }
}
