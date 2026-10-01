package 정적멤버와메소드;

public class Bank {
    private static int count = 0; // 정적 멤버, 클래스 생성 시 단 한번 생성
    private static  final String name ="KAKAO"; // 정적변수이면서 상수로 정의
    private int account;
    private String owner;

    // 생성자를 통해서 예금주와 잔액을 생성
    public Bank(String owner, int account){
        this.owner=owner;
        this.account=account;
        count++; // 계좌 개설 개수 확인용, 정적 멤버
        System.out.println(owner+"은행에 계좌 개설합니다. 잔액은 "+account + "입니다.");
    }

    public static int getCount(){
        return count;
    }

    // 예금
    public void setDeposit(int amount){
        account += amount;
        System.out.println(amount+"를 예금 했습니다. 잔액은 "+account + "원 입니다.");
    }

    // 출금
    public void setWithdraw(final int amount){ // final을 붙이면 내부의 값을 안바뀜
        if(amount>account){
            account-=amount;
            System.out.println(amount+"원 출금 되었습니다. 잔액은 "+account+"원 입니다.");

        }else {
            System.out.println("잔액이 부족합니다,");
        }
    }

    // 현재 잔고 구하기
    public void viewAccount(){
        System.out.println(owner+"님의 현재 잔액은 " + account+"입니다.");
    }

}
