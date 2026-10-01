package Singleton;

public class Student {
    // 이미 생성되어 있는 싱글톤 객체의 주소를 가져옴
    // new를 안넣어도 됨 이미 만들어진 싱글톤 객체를 내것 처럼 사용
    Sigleton sigleton = Sigleton.getInstance();

    void setInfo(String name, int id) {
        sigleton.name = name;  // 싱글톤 객체의 인스턴스 필드 객체 접근
        sigleton.id = id;

    }
    public void print(){
        System.out.println("이름: " + sigleton.name);
        System.out.println("아이디: " + sigleton.id);


    }
}
