package week4.day1;

public class Payment {
    public static void main(String[] args) {
        Account account = new Account();
        boolean isSufficient1 = account.isSufficient();
        if(isSufficient1){
            System.out.println("결제 처리 합니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }

}
