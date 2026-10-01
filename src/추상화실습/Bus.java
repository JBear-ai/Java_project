package 추상화실습;

public class Bus extends Car implements Aircon,AutoPilot {

    public Bus(String name)
    {
        super();
        this.name=name;
        this.efficiency=5;
        this.speed=150;
        this.efficiency_size=100;
        this.count=20;
    }

    @Override
    public void setMode(boolean isOn)
    {
        if (isOn) {
            System.out.println("보조 연료탱크 (30L 추가)");
            efficiency_size += 30;
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
    public void autoDrive() {
        // 자율주행 활성화시 최고속도 -10퍼 (세단기준)
        // 200 - (200*0.1)
        // 180
        speed = -speed-(int)(speed*auto_Rate);
    }
}
