package 제너릭;

public class GenericEX {
    static void main(String[] args) {
        // 재료가 분말인 프린터
        GenericPrinter<Power> powerPrinter = new GenericPrinter<>();
        powerPrinter.setMaterial(new Power());
        System.out.println(powerPrinter); // 자동으로 오버라이딩된 ToString으로 호출
        powerPrinter.getMaterial().doPrinting();

        // 재료가 플라스틱
        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(new Plastic());
        System.out.println(plasticPrinter);
        plasticPrinter.getMaterial().doPrinting();

        // 재료가 Nylon
        GenericPrinter<Nylon> nylonPrinter = new GenericPrinter<>();
        nylonPrinter.setMaterial(new Nylon());
        System.out.println(nylonPrinter);
        nylonPrinter.getMaterial().doPrinting();


    }
}
