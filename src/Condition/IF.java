package Condition;

// 조건문 : 주어진 조건식의 결과에 따라 별도의 명령을 수행하도록 명령문
// if~else, if , switch~case , 3항 연산자

import java.util.Scanner;

public class IF {
    public static void main(String[] args) {

    // 나이를 입력 받아 19세까지는 미성년자, 초과하면 성인
    // 3가지의 조건문 사용해 보기

    System.out.print("나이 입력: ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if (a>19)
    {
        System.out.println("성인입니다.");
    }
    else
    {
        System.out.println("미성년자 입니다.");
    }


    // 홀짝 구하기
    System.out.print("숫자 입력: ");
    int b = sc.nextInt();
    if (b%2 ==0)
    {
        System.out.println("홀수입니다.");
    }
    else
    {
        System.out.println("짝수입니다.");
    }


    System.out.print("성적 입력: ");
    int c = sc.nextInt();
    if (c>=90)
    {
        System.out.println("A");
    }
    else if (c <90)
    {
            System.out.println("B");
    }
    }
}


