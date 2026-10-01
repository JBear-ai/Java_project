package 추상클래스;

public class ApplePhone extends Phone {

    public ApplePhone(String name) {
        super(name);
    }

    @Override
    void call() {
        System.out.println("부모의 요청으로 iPhone폰에 통화 기능을 구현합니다.");
    }

    @Override
    void store(){
        System.out.println("앱 스토어 기능을 구현합니다.");
    }
}
