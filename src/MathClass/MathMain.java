package MathClass;


// Math 클래스 : 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해 놓은 클래스
// - Math 클래스의 모든 메서드는 클래스 메서드(static method)이므로, 객체를 생성하지 않고도 사용 가능

import java.util.ArrayList;
import java.util.List;

public class MathMain {
    public static void main(String[] args)
    {
        //        Math.abs;
        // 객체르 만들면 안되는 이유 정적 메서드 ,final
        // random 메서드 : 0.0 이상 1.0 미만의 범ㅇ위에서 임의의 double형 값을 하나 생성하여 반환
//        int val = (int)(Math.random() * 45 +1);
        // 1~45 사이의 임의의 값

        // 1~100사이의 중복되지 않은 값 10개 생성
        List<Integer> list = new ArrayList<>();

        while (list.size() <10){
            int val = (int)(Math.random()*100+1);
            if(!list.contains(val))
            {
                list.add(val);
            }
        }
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        while (list2.size()<7){
            int val2 = (int)(Math.random()*45+1);
            if (!list2.contains(val2)){
                list2.add(val2);
            }
        }
        System.out.println("로또 번호: "+list2);


        // ceil() : 소수점이하가 있으면 무조건 올림
        System.out.println(Math.ceil(10.0));
        System.out.println(Math.ceil(10.1));
        System.out.println(Math.ceil(10.00000001));
        // floor() : 소수점 이하를 무조건 날림
        System.out.println(Math.floor(10.0));
        System.out.println(Math.floor(10.9));
        System.out.println(Math.floor(10.00000001));
        // round() : 반올림
        System.out.println(Math.round(10.0));
        System.out.println(Math.round(10.4999));
        System.out.println(Math.round(10.5));
        // max()와 min()
        int x = 10;
        int y = 20;
        System.out.println(Math.max(x, y));
        System.out.println(Math.min(x, y));


        System.out.println(Math.max(3.14, 3.14159)); // 3.14159
        System.out.println(Math.min(3.14, 3.14159)); // 3.14
    }
}
