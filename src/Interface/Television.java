package Interface;

public class Television implements RemoteControl {
    private int volume;


    @Override
    public void turnON() {
        System.out.println("TV 전원을 킵니다.");
    }

    @Override
    public void turnOFF() {
        System.out.println("TV 전원을 종료합니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME){
            this.volume=RemoteControl.MAX_VOLUME;
        }else if(volume < RemoteControl.MIN_VOLUME){
            this.volume=RemoteControl.MIN_VOLUME;
        }else{
            this.volume=volume;
        }
        System.out.println("현재 TV 볼륨: " + this.volume);
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
