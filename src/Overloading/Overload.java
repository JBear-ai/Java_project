package Overloading;

// 오버로딩: 메서드의 매개변수의 개수 또는 타입으로 메서드를 구분하는 것
// 반환값은 영향이 없음

public class Overload {
    public static void main(String[] args) {
        System.out.println(add(100,200));
        System.out.println(add(100,200,300));
        System.out.println(add(100,"ddd","아아"));
    }
    static  int add(int a, int b){

        return a+b;
    }
    static  int add(int a, int b, int c){
        return a+b+c;
    }

    static  String add(int a, String b, String c){
//        return Integer.parseInt(a + b + c);
        return a+b+c;
    }


}
