package Movie;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MovieTicket {
    private final int[] seat = new int[10];
    private final Scanner sc = new Scanner(System.in);
    int price;

    /*
    1) 학습 목표
    - 클래스/필드/메서드/생성자 활용
    - 배열로 상태 관리(좌석 10개)
    - 조건문/반복문/입출력(Scanner) 사용
    - 메서드 분리와 캡슐화(가격·좌석 정보 관리)

    2) 기능 요구사항
    - 메뉴: [1] 예매하기 [2] 취소하기 [3] 종료하기
    - 좌석은 총 10개(1~10번), **빈 좌석 / 예매됨 [V]** 로 표시
    - **좌석당 가격은 생성자를 통해 주입** (예: 12,000원)
    - **예매하기**: 빈 좌석만 예매 가능, 중복 예매 방지
    - **취소하기**: 예매된 좌석만 취소 가능
    - **종료하기**: 총 판매 금액 출력 후 프로그램 종료
    - 입력 범위(좌석 번호 1~10) 체크 및 잘못된 입력 처리

    3) 구현 단계 (TODO 가이드)
    1. MovieTicket 클래스 설계
        - int[] seat = new int[10]; (0: 빈 좌석, 1: 예매됨)
        - price(좌석당 가격): 생성자로 주입
        - printSeat(): 좌석 상태 출력
        - selectSeat(): 예매
        - cancelSeat(): 취소
        - totalAmount(): 총 판매 금액 계산
    2. MovieMain 작성
        - while(true)로 메뉴 반복
        - switch/if로 분기
        - 각 메뉴에 맞게 MovieTicket의 메서드 호출
    3. 예외/검증
        - 좌석 번호 범위(1~10) 아닌 경우 메시지 출력
        - 중복 예매/취소 불가 상황 처리
        - 숫자 외 입력 발생 시 안내 후 재입력(선택)
     */

    // 생성자를 통해서 가격을 주입 받음
    public MovieTicket(int price)
    {
        this.price=price;
    }

    public void printSeat() // 좌석 상태 출력
    {
        for(int i =0; i< seat.length; i++){
            //for(시작 ; 조건 ; 증감;)

            if (seat[i]==0){
                System.out.println((i+1)+"번 좌석 : [ ]");
            }else {
                System.out.println((i+1)+"번 좌석 : [V]");
            }
        }
    }
    public void selectSeat() // 예매
    {
        while (true)
            try {
                System.out.println("예매하실 자리를 선택하세요: ");
                int select_num = sc.nextInt(); // 숫자 입력값

                // 범위 검사
                if(select_num >=1 && select_num <=10){
                    if(seat[select_num -1]==0)
                    {

                        System.out.println(select_num + "번 좌석에 예매 완료했습니다");
                    }
                    else
                    {
                        System.out.println("이미 예매된 자리입니다.");
                        continue;
                    }

                }
                else
                {
                    System.out.println("존재하지 않는 좌석입니다.");
                }
//                if (seat[i] == 0) // 중복 검사
//                {
//                    System.out.println("예매에 성공했습니다.");
//                    break;
//                }else {
//                    System.out.println("이미 예매된 자리입니다.");
//                    return;
//                }

            }catch (InputMismatchException e){

            }

    }
    public void cancelSeat() // 취소
    {

    }
    public void totalAmount() // 총 판매 금액 계산
    {

    }

}
