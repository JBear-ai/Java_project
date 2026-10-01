package sample;

public class Sample { // 자바는 클래스 기반의 언어이므로 반드시 클래스가 필요함
    public static void main(String[] args) { // 프로그램의 시작 메서드
        System.out.println("Hello World"); // 자바는 반드시 ;(세미클론)으로 끝 맺음

        // 자바의 기본 출력 : print(),println(),printf()
        System.out.print(7);        //  print() 메소드느 줄 바꿈을 하지 않음
        System.out.println(3);      // 정수 출력
        System.out.println(3.14);   // 실수 출력
        System.out.println("자바!"); // 문자열 출력
        System.out.println("문자열끼리의 " + "연결도 가능함");
        System.out.println("숫자" + 3 +"과 문자열의 연결도" +"가능함");
        System.out.printf("%d\n",3);


    }
}
