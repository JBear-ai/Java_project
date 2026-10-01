package Condition;

// switch문도 if문과 마찬가지로 조건 제어문
// 변수의 값에 따라 분기 함 (조건식이 올 수 없음)

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("계산식 입력(EX: 12 + 50): ");
//        int x = sc.nextInt();
//        char op =sc.next().charAt(0);
//        int y = sc.nextInt();
//
//        switch (op)
//        {
//            case '+':
//                System.out.println(x+y);
//                break;
//            case '-':
//                System.out.println(x-y);
//                break;
//            case '*':
//                System.out.println(x*y);
//                break;
//            case '/':
//                System.out.println((double)x/y);
//                break;
//            default:
//                System.out.println("계산식 잘못 입력하셨습니다.");
//        }

        System.out.println("================================");
        System.out.println("     \uD83E\uDD64자판기에 오신걸 환영합니다."); // 자판기 만들기
        System.out.println("================================");

        String menu = "콜라";
        int price = 1500;
//        System.out.println("1. "+ menu+ "   - " + price+"원");
        System.out.printf("1. %-5s - %,5d원\n",menu,price);

        String menu2 = "사이다";
        int price2 = 1500;
//        System.out.println("2. "+ menu2+ "   - " + price2+"원");
        System.out.printf("2. %-4s - %,5d원\n",menu2,price2);

        String menu3 = "커피";
        int price3 = 1500;
//        System.out.println("3. "+ menu3+ "   - " + price3+"원");
        System.out.printf("3. %-5s - %,5d원\n",menu3,price3);

        String menu4 = "생수";
        int price4 = 500;
//        System.out.println("4. "+ menu4+ "   - " + price4+"원");
        System.out.printf("4. %-5s - %,5d원\n",menu4,price4);

        System.out.println("================================");

        System.out.print("투입 금액 입력: ");
        int priceNum = sc.nextInt();

        System.out.print("메뉴 번호 선택(1~4): ");
        int menuNum = sc.nextInt();
        System.out.println("================================");

        switch (menuNum)
        {
            case 1: // 콜라
                if (priceNum >=price) {
                    System.out.println("✅"+menu + " 가 나왔습니다! ");
                    System.out.println("투입 금액 : " + priceNum);
                    System.out.println("상품 금액 : " + price);
                    System.out.println("거스름돈 : " + (priceNum - price));
                }
                else
                {
                    System.out.println("❌ 잔액이 부족합니다.");
                    System.out.println("투입 금액 : " + priceNum);
                    System.out.println("필요 금액 : " + price);
                    System.out.println("부족 금액 : " + (price - priceNum)); //
                }
                break;
            case 2: // 사이다
                if (priceNum >=price2) {
                    System.out.println("✅"+menu2 + " 가 나왔습니다! ");
                    System.out.println("투입 금액 : " + priceNum);
                    System.out.println("상품 금액 : " + price2);
                    System.out.println("거스름돈 : " + (priceNum - price2));
                }
                else
                {
                    System.out.println("❌ 잔액이 부족합니다.");
                    System.out.println("투입 금액 : " + priceNum);
                    System.out.println("필요 금액 : " + price2);
                    System.out.println("부족 금액 : " + (price2 - priceNum)); //
                }
                break;
            case 3: // 커피
                if (priceNum >=price3) {
                    System.out.println("✅"+menu3 + " 가 나왔습니다! ");
                    System.out.println("투입 금액 : " + priceNum);
                    System.out.println("상품 금액 : " + price3);
                    System.out.println("거스름돈 : " + (priceNum - price3));
                }
                else
                {
                    System.out.println("❌ 잔액이 부족합니다.");
                    System.out.println("투입 금액 : " + priceNum);
                    System.out.println("필요 금액 : " + price3);
                    System.out.println("부족 금액 : " + (price3 - priceNum)); //
                }
                break;
            case 4: // 생수
                if (priceNum >=price4) {
                    System.out.println("✅"+menu4 + " 가 나왔습니다! ");
                    System.out.println("투입 금액 : " + priceNum);
                    System.out.println("상품 금액 : " + price4);
                    System.out.println("거스름돈 : " + (priceNum - price4));
                }
                else
                {
                    System.out.println("❌ 잔액이 부족합니다.");
                    System.out.println("투입 금액 : " + priceNum);
                    System.out.println("필요 금액 : " + price4);
                    System.out.println("부족 금액 : " + (price4 - priceNum)); //
                }
                break;
            default:
                System.out.println("❌없는 메뉴 입니다.");

        }
        System.out.print("================================");
    }
}
