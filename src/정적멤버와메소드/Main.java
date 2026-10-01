package 정적멤버와메소드;

// 정적 멤버는 클래스에 고정된 멤버로서 객체를 생성하지 않고 사용 할수 있는 필드와 메소드를 의미

public class Main {
    public static void main(String[] args) {
        Bank bank1 = new Bank("원이",1000);
        Bank bank2 = new Bank("지원",3000);
        Bank bank3 = new Bank("은지",10000);

        bank1.setDeposit(3500);
        bank1.setWithdraw(10000);
        bank1.viewAccount();

        bank2.setDeposit(5000);
        bank2.setWithdraw(3000);
        bank2.viewAccount();

        System.out.println(Bank.getCount()); // 클래스의 정적 메서드 호출

    }
}
