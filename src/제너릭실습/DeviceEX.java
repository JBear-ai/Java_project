package 제너릭실습;

import 제너릭.GenericPrinter;

public class DeviceEX {
    static void main(String[] args) {
        GenericDevice<PowerOn> powerOn = new GenericDevice<>();
        powerOn.setDevice(new PowerOn());
        System.out.println(powerOn); // 자동으로 오버라이딩된 ToString으로 호출
        powerOn.getDevice().doPrinting();

        GenericDevice<PowerOff> powerOff = new GenericDevice<>();
        powerOff.setDevice(new PowerOff());
        System.out.println(powerOff);
        powerOff.getDevice().doPrinting();


    }
}
