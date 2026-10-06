package 제너릭;

public class GenericPrinter<T> {
    private T material;

    public T getMaterial(){
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    @Override
    public String toString(){ // Object Class에서 가지고 있는 메서드 오버라이딩
        return material.toString();
    }
}

// 재료가 분말
class Power{
    public void doPrinting(){
        System.out.println("Power 재료로 출력");
    }
    @Override
    public String toString(){
        return "재료는 Power 입니다.";
    }
}

// 재료가플라스틱
class Plastic{
    public void doPrinting(){
        System.out.println("플라스틱 재료");
    }
    @Override
    public String toString(){
        return "재료는 플라스틱";
    }
}

class Nylon{
    public void doPrinting(){
        System.out.println("나일론 재료");
    }
    @Override
    public String toString(){
        return "재료는 나일론";
    }
}