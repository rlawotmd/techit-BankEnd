import java.util.*;

public class UserRegister {
    public static void main(String[] args) {
        System.out.println("=================");
        System.out.println("회원등록");
        System.out.println("=================");

        boolean register = false;
        Scanner sc = new Scanner(System.in);

        while(!register) {
            System.out.println("회원가입을 하기셌습니까?\nY: 진행    N: 취소");
            System.out.print(">>> ");

            String register_input = sc.nextLine();

            if(register_input.equalsIgnoreCase("y")) {
                register = true;
                System.out.println("=================");
                System.out.println("회원가입이 진행됩니다.");
                System.out.println("=================");
            } else if (register_input.equalsIgnoreCase("n")) {
                System.out.println("=================");
                System.out.println("회원가입이 종료됩니다.");
                System.out.println("=================");
                System.exit(0);
            } else {
                System.out.println("입력값을 확인해주세요.");
            }
        }

    }
}
