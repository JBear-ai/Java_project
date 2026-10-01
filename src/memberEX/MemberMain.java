package memberEX;


public class MemberMain { //
    public static void main(String[] args) {
        // MemberClass 클래스에 대한 객체 생성
        MemberClass member = new MemberClass();
        member.setName(); // 프라이빗으로 설정하면 안에 있는 name이라는 변수에 대한 접근을 제한한다
        member.setAge();
        member.setGender();
        member.setJobs();
        member.getInfo();
    }
}
