public class SavingsAccount extends BankAccount implements Withdrawable {
    boolean isOverdraft;
    void transfer() {}

    public void withdraw() {
        System.out.println("Withdraw");
    } // 인터페이스에서 끌어다 재정의해서 사용할때는 접근제어자를 붙여서 사용해야함
}
