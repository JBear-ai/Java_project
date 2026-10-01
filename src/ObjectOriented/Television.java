package ObjectOriented;

// ProTV로 부터 상속을 받아 Television 클래스 생성
public class Television extends ProTV {
    String brand;
    boolean isSmart;


    // 생성자는 클래스가 객체로 만들어 질 때 호출 됨
    public Television() {
        // super(false,1,50);
    }

    // 생성자 오버로딩이
    public Television(boolean isOn, int channel, int volume, String brand) {
        super(isOn, channel, volume);
        this.brand =brand;
        // super()는 부모의 생성자를 호출
        // 기본 생성자 주석 처리를 풀어도 실행이 가능함
    }

    // 전원을 켜고 끄는 메서드 생성
//    public void setOn(boolean onOFF) {
//        isOn = onOFF;
//        String onOFFStr = (isOn) ? "ON" : "OFF";
//        System.out.println("TV: " + onOFFStr);
//    }
    public void setPower(boolean isOn){
        this.isOn=isOn;

    }
    public boolean getPower(){
        return isOn;
    }

    // 불륨을 설정하고 불륨값을 읽는 메서드 생성
    // 불륨 설정 범위 0~100
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println("볼륨을 " + volume + "변경 하였습니다.");
        }
    }
    public int getVolume(){
        return volume;
    }

    // 부모가 만든 채널 설정을 오버라이딩해서 채널을 1~2000
    // 오버라이딩은 부모가 만들 메서드를 재정의해서 사용
    @Override
    public void setChannel(int channel) {
        if (channel >=1 && channel <=2000){
            // 채널 설정값이 1~1000까지를 유효값으로 간주함
            // this는 자기자신의 객체를 참조하는 변수
            this.channel=channel;
        }else {
            System.out.println("채널 유효범위를 벗어났습니다.");
        }
    }


    // 오버라딩된 채널 설정을 오버로딩에서 스마트 기능 구현 하기 ()
    public void setChannel (int channel, boolean isSmart){
        if(isSmart){
            System.out.println("스마트 TV 모드 입니다.");
            this.isSmart=true;
        }else {
            this.isSmart=false;
            if (channel >= 1 && channel <= 1000) {
                // 채널 설정값이 1~1000까지를 유효값으로 간주함
                // this는 자기자신의 객체를 참조하는 변수
                this.channel = channel;
            } else {
                System.out.println("채널 유효범위를 벗어났습니다.");
            }
        }
    }


    // TV 정보 출력하기
    public void InfoTV() {
        System.out.println("=".repeat(7)+"TV 정보"+"=".repeat(7));
        System.out.println("브랜드: "+ brand);
        System.out.println("전원: "+ isOn);
        System.out.println("채널: "+ channel);
        System.out.println("볼륨: "+ volume);
        System.out.println("인터넷모드: "+ isSmart);
    }
}