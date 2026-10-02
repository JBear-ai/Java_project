package JavaApi;

// 자바API: 자바에서 제공하는 다양한 API이며, 라이브러리라고 부르기도 함
// JDK에서 제공하는 많은 클래스를 활용하면 프로그램을 더욱 효율적으로 구현
// java.lang: 자바에서 가장 기본적인 동작을 수행하는 클래스들의 집합 (import 불필요)
// -Object: 자바의 최상위 클래스 (11개의 메서드를 가짐)
// java.util: 자바에서 두번째로 가장 많이 사용하는 집합체 (import 필요)

public class APIMain {
    public static void main(String[] args) {
        Student student1 = new Student("장원영",1000);
        Student student2 = new Student("안유진",2000);

        System.out.println(student2); // toString() 메서드 생략 가능
        System.out.println(student1.equals(student2)); // 주소값 비교하는
        System.out.println(student1.name.equals(student2.name)); // 문자열은 String 클래스에서 문자열 비교로 오버라이딩 해둠

    }
}

class Student{
    String name;
    int id;

    @Override
    public String toString(){
        return "이름: " + name + ", 아이디: "+id +"\n";
    }


    Student(String name, int id){
        this.name=name;
        this.id=id;

    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }


}