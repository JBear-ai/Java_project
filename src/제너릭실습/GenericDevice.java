package 제너릭실습;

public class GenericDevice <T extends Device>{
    private T device;

    public T getDevice(){
        return device;
    }

    public void setDevice(T device) {
        this.device = device;
    }

    @Override
    public String toString(){ // Object Class에서 가지고 있는 메서드 오버라이딩
        return device.toString();
    }
}

abstract class Device{
    public abstract void doPrinting();
}

class PowerOn extends Device{
    public void doPrinting(){
        System.out.println("전원을 킵니다");
    }
    @Override
    public String toString(){
        return "전원 ON";
    }
}

class PowerOff extends Device{
    public void doPrinting(){
        System.out.println("전원을 종료합니다,");
    }
    @Override
    public String toString(){
        return "전원 OFF";
    }

}

