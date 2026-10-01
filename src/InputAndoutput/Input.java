package InputAndoutput;

import java.util.Scanner;

public class Input{
    public static void main(String[] args) {

        // 표준 입력은 스캐너 객체 사용
        Scanner sc = new Scanner(System.in); // 스캐너 객체 생성
        // 이름, 주소, 성별, 나이, 이메일을 입력 받아 출력
        System.out.print("이름 입력: "); // 줄 바꿈 없는 출력
        String name = sc.next();            // 문자열을 공백 기준으로 입력 받음
        sc.nextLine();

        System.out.print("주소 입력: ");
        String addr = sc.nextLine();        // 문자열을 줄바꿈 기준으로 입력 받음

        System.out.print("성별 입력(M/F): ");
        char gender = sc.next().charAt(0);  // 문자열에서 해당 인덱스의 문자를 추출

        System.out.print("나이 입력: ");
        int age = sc.nextInt();             // 정수

        System.out.print("이메일 입력: ");
        String email = sc.next();           // 문자열 입력


        System.out.printf("이름은 %s\n 주소는 %s\n 성별은 %s\n 나이는 %d\n 이메일은 %s\n"
                            ,name,addr,gender=='M' ? "남성":"여성",age,email);
    }
}
