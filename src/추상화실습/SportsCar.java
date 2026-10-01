package 추상화실습;

public class SportsCar extends Car implements Aircon,Audio{
    /*
    - 연비: 8km/L
    - 속도: 250km/h
    - 연료탱크: 30L
    - 좌석: 2
    - 이름: 생성자 입력
    - 부가기능: **터보** (속도 20% 증가)
     */
   public SportsCar(String name)
   {
       super();
       this.name=name;
       this.efficiency=8;
       this.speed=250;
       this.efficiency_size=30;
       this.count=2;

   }


    @Override
    public void setMode(boolean isOn)
    {

        if(isOn)
        {
            System.out.println("터보 ON");
            speed=(int) Math.ceil((speed*0.2)+speed);
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
}
