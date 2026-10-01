package Movie;

import java.util.Scanner;

public class Movie1 {
    public static void main(String[] args) {
        MovieTicket1 ticket = new MovieTicket1(10000);

        ticket.printSeat();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("\n=== 영화표 예매 시스템===");
            System.out.println("[1] 예매하기");
            System.out.println("[2] 취소하기");
            System.out.println("[3] 종료하기");
            System.out.print("메뉴 선택: ");

            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    ticket.selectSeat();
                    break;
                case 2:
                    ticket.cancelSeat();
                    break;
                case 3:
                    System.out.println("총 한매 금액: " + ticket.getTotalPrice());
                    return;
                default:
                    System.out.println("메뉴 선택이 잘못 되었습니다.");
            }

        }


    }
}
