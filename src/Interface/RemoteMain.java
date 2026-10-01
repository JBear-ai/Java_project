package Interface;

import java.rmi.Remote;
import java.util.Scanner;

public class RemoteMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("제품을 선택 [1]PlayStation [2]TV [3]Audio: ");
        int menu = sc.nextInt();

        RemoteControl remote = null;

        switch (menu){
            case 1:
                remote = new Playstation();
                remote.turnON();
                remote.setVolume(110);
                break;
            case 2:
                remote = new Television();
                remote.turnON();
                remote.setVolume(40);
                break;
            case 3:
                remote= new Audio();
                remote.turnON();
                remote.setVolume(30);
                break;
            default:
                System.out.println("제품 선택이 잘못 되었습니다.");
        }


    }
}
