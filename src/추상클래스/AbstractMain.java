package 추상클래스;

public class AbstractMain {
    public static void main(String[] args) {

        System.out.println("");
        Phone phone = new AndroidPhone("갤럭시 S23+");
        phone.call();
        phone.store();

        System.out.println("===");

        Phone phone2 = new ApplePhone("iPhone 15");
        phone2.call();
        phone2.store();

//        Phone phone3 = new Phone(); 이건 불가능



    }
}
