package Interface;

// interface 키워드를 사용해 인터페이스 구성
// 인터페이스는 클래스가 구현해야 할 메서드들의 명세를 정의한 설계 명세
// 인터페이스는 "이런 기능을 제공해야 한다" 라는 규칙 또는 약속을 정의
// 이를 통해 다양한 크래스가 동일한 기능을 일관된 형식으로 구현
// 자바는 클래스의 다중 상속을 허용하지 않지만, 인터페이스는 다중 구현이 가능 (문제점이 있긴함)
//

public interface RemoteControl {
    // 자동으로 public static final 이 붙음
    // 상수취급
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    // 자동으로 public abstract가 추가됨
    // 즉 모든 메서드가 추상 메서드이다

    void turnON();
    void turnOFF();
    void setVolume(int volume);
    int getVolume();


}
