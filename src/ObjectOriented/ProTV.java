package ObjectOriented;

public abstract class ProTV {
    // 인스턴스 필드
    boolean isOn;
    int channel;
    int volume;

    // 기본 생성자 생성, 생성자는 클래스 이름과 동일, 반환 타입이 존재 하지 않음, 클래스가 객체로 만들어 질 때 호출
    public ProTV() {
        isOn = false;
        channel = 1;
        volume = 50;
    }

    // 생성자 오버로딩, 오버로딩은 동일한 이름의 메서드에 대해 매개변수의 개수와 타입으로 구분해서 호출 하는 것, 정적 바인딩
    public ProTV(boolean isOn, int channel, int volume) {
        this.isOn = isOn;
        this.channel = channel;
        this.volume = volume;
    }

    public void setChannel(int channel) {
        if (channel >= 1 && channel <= 1000) {
            // 채널 설정값이 1~1000까지를 유효값으로 간주함
            // this는 자기자신의 객체를 참조하는 변수
            this.channel = channel;
        } else {
            System.out.println("채널 유효범위를 벗어났습니다.");
        }
    }
}


