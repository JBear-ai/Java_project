package DownCasting;

public class Animal {
    public void move(){
        System.out.println("동물이 움직 입니다.");

    }
}

class Human extends Animal{
    @Override // 오버라이드 관계 성립 여부 확인
    public void move(){
        System.out.println("사람은 두 발로 걷습니다.");
    }
    public void readBook(){
        System.out.println("사람이 책을 읽습니다.");
    }
}
class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }
    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}
class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 납니다.");
    }
    public void flying() {
        System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
    }
}
class Dog extends  Animal{
    @Override
    public void move() {
        System.out.println("강아지가 산책하기 위해 움직입니다.");
    }
    public void eat(){
        System.out.println("강아지가 사료를 먹음");
    }
}
