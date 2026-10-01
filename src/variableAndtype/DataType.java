package variableAndtype;

public class DataType {
    public static void main(String[] args) {

        boolean isTrue = true; // 참과 거짓 구분 용도 (1byte)
        char gender = 'M';     // 문자 저장, 자바는 문자는 '' 문자열 "" 문자는 내부적으로 정수값이 사용 됨 부호없는 2byte
        byte bVar = 120;       // 1byte
        short sVar = 30000;    // 2byte
        int iVar = 100000;     // 4
        long lVar = 100000000L; // 8
        float fVar = 3.14f;    // 4
        double dVar = 3.14;    // 8
        String name = "곰도링"; // 문자열을 저장, 참조 타입

        // 묵시적 형변환: 컴파일로 자동으로 형변환을 하는 것
        int num = 10;
        double dNUm = 20.13;
        double rst = num+dNUm;
        System.out.println(rst);

        // 명시적 형변환: 사용자가 의도를 가지고 형변환을 하는 것
        int kor = 66;
        int math = 33;
        int eng = 77;
        double avg = (double)(kor+math+eng) / 3; // 명시적 형변환과 묵시적 형변환이 함께 일어남
        // double avg = (kor+math+eng) / 3.0;   58.66
        System.out.println(avg);


    }
}
