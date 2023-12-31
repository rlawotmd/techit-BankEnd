import java.lang.reflect.Array;
import java.util.ArrayList;

public class ExceptionExample {
    public static void main(String[] args) {
        // 예외 (Exception)
/*
        int a = 10;
        int b = 0;
        int c = a / b;

 */

        ArrayList arrayList = new ArrayList(3);

        try {
            arrayList.get(10);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("에러발생");
        } finally {
            System.out.println("finally");
        }
    }
}
