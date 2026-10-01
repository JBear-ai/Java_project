package Singleton;

// 싱글톤
// 하나만 생성이되서 이 객체를 싱글톤이라 부름
// -Spring Boot의 Spirng container에 bean 등록이 싱글톤
// 실제로 해볼일은 거의 없지만 개념에 대한 중요
// 스프링부트에서 자동으로 만들어줌 워낙 많이 사용해서
// 문제점 : 코드가 복잡해 지고, 동시성 문제를 해결하기위해 Syncronzied를 사용해야 하는 경우가 있음
// 동시성 문제는 운영체제에서 다뤄지는 주제이다.

public class SingleMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.setInfo("원이", 3000);


        student1.print();
        student2.print();
    }




}
