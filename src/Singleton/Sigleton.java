package Singleton;

public class Sigleton {
    String name;
    int id;
    // 전역변수에 싱글톤 객체를 생성해서 대입,
    // 전역 변수는 프로그램 종료 시 까지 사라지지 않음

    private static Sigleton singleton = new Sigleton();

    private Sigleton(){
        // 외부에서 생성자 호출을 막기 위해
        name = "곰도링";
        id = 100;
    }
    static Sigleton getInstance(){
        // 외부 호출 시 미리 만들어진 싱글톤 객체의 주소를 반환
        return singleton;
    }



}
