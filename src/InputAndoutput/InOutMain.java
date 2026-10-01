package InputAndoutput;

public class InOutMain {
    public static void main(String[] args) {
        // System.in:표준 입력 스트림
        // System.out:표준 출력 스트림
        // System.err:표준 오류 스트림 거의 쓸일이 없음

        // 이름, 주소, 성별, 국어, 영어, 수학,
        String name = "강문석";
        String addr = "천안시";
        char gender = 'M';
        int kor = 55;
        int eng = 80;
        int math = 67;

        int total = 0;
        double aver = 0.0;
        total = kor+eng+math;
        aver = (double) total / 3;

        // 자바의 오버로딩 문법을 사용, 데이터 타입을 자동으로 찾아줌
        System.out.println("====== Java Style output =======");
        System.out.println("이름: "+name);
        System.out.println("주소: "+addr);
        System.out.println("성별: "+gender);
        System.out.println("총점: "+(kor+eng+math)+"점");
        System.out.println("평균: "+(double)(kor+eng+math)/3+"점");
        System.out.println(aver);

        // C언어 스타일 (printf 서식지정자)
        // 서식 지정자를 사용해서 출력 하는 방식
        System.out.println("====== C Style Output ======");
        System.out.printf("Name : %s\n", name);
        System.out.printf("Address : %s\n", addr);
        System.out.printf("Gender : %c\n", gender);
        System.out.printf("Total : %d\n", (kor + eng + math));
        System.out.printf("Average : %.2f\n", (double)(kor + eng + math)/3);
        System.out.printf("%.2f",aver);

        System.out.println();
        System.out.println("================================");
        System.out.println("나를 소개합니다! ");
        System.out.println("================================");

        int age = 25;
        String hobby = "코딩, 독서, 게임";
        String comment = "\"안녕하세요, 잘 부탁드립니다.\"";

        System.out.println("이름 : "+name);
        System.out.println("나이 : "+age+"세");
        System.out.println("취미 : "+hobby);
        System.out.println("한마디 : "+comment);
        System.out.println("=================================");

        // 2번
        //        String cafeName = "JAVA CAFE 영수증";


        String menu = "아메리카노";
        int count = 2;
        int price = 9000;

        String menu2 = "카페라떼";
        int count2 = 1;
        int price2 = 5500;

        String menu3 = "치즈케이크";
        int count3 = 1;
        int price3 = 6800;

        System.out.printf("%-10s %5d잔 %,d원%n", menu, count, price);
        System.out.printf("%-10s %5d잔 %,d원%n", menu2, count2, price2);
        System.out.printf("%-10s %5d조각 %,d원%n", menu3, count3, price3);

    }
}

