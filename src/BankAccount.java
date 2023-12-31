public class BankAccount {
    // 멤버변수
    int bankCode;
    int accountNo;
    String owner;
    int balance;
    boolean isDormant;
    int password;

    // 메소드
    void inquiry() {

    }
    void deposit() {

    }
    void withdraw() {

    }
    void heldInDormant() {

    }

    // 생성자
    // 클래스 내부에 정의, 생성자 메서드명은 클래스명과 일치
    // new 연산자와 함께 사용
    BankAccount() {}
    BankAccount(int bankCode, int accountNo, String owner, int balance, int password, boolean isDormant) {
        this.bankCode = bankCode;
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
        this.password = password;
        this.isDormant = isDormant;
    }
}
