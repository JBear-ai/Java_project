package 추상화실습;

public class Sedan extends Car implements  Aircon,Audio,AutoPilot{
    public Sedan(String name){
        super();
        this.name=name;
        this.efficiency=12;
        this.speed=200;
        this.efficiency_size=45;
        this.count=4;
    }

    @Override
    public void setMode(boolean isOn)
    {
        if (isOn){
            System.out.println("트렁크 1석 추가");
            count+=1;
        }
    }


    @Override
    public void ariconOn() {
        // 에어컨 활성화시 연비 -5퍼
        // 12- (12*0.05)
        // 연비 - (연비* 연비-5퍼)
        efficiency=efficiency-(efficiency*Aircon_Rate);
    }

    @Override
    public void audionOn() {
        // 활성화시 메시지 출력만
        System.out.println("오디오 전원을 킵니다.");
    }

    @Override
    public void autoDrive() {
        // 자율주행 활성화시 최고속도 -10퍼 (세단기준)
        // 200 - (200*0.1)
        // 180
        speed = -speed-(int)(speed*auto_Rate);
    }
}
