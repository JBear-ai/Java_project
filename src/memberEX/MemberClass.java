package memberEX;

import java.util.Scanner;

public class MemberClass {
    private String name;
    int age;
    char gender;
    int jobs;
    Scanner sc = new Scanner(System.in);
    /*
    private String name; 클래스 내부에서만 접근 가능
    private int age;
    private char gender;
    private int jobs;
    private final Scanner sc = new Scanner(System.in);
     */

    // 이름
    public void setName() {
        System.out.print("이름을 입력하세요.: ");
        name = sc.nextLine();
    }
    public String getName()
    {
        return name;
    }

    // ========================================================
    // 나이
    public void setAge()
    {
        while (true) {
            System.out.print("나이를 입력하세요.: ");
            age = sc.nextInt();
            if (age > 0 && age < 101)
                break;
            else
                System.out.println("나이를 잘못 입력 하셨습니다. 다시 입력하세요.");
        }
//       String ageStr = sc.nextline();
//        while (true) {
//            try
//            {
//                age = Integer.parseInt(ageStr);
//                if (age > 0 && age < 101) return;
//                // 브레이크는 반복문을 끝내지만 보이드라서 반환값이 없어서 리턴이 더 좋을수도 있다
//                System.out.println("나이 입력 범위가 아닙니다.");
//            }
//            catch (NumberFormatException e)
//            {
//                System.out.println("숫자만 입력");
//            }
//        }
    }

    public int getAge() {
        return age;
    }

    // =================================================================
    // 성별
    public char getGender() {
        return gender;
    }

    public int getGenderType() {
        if (gender == 'M' || gender == 'm') {
            return 1;
        } else {
            return 2;
        }
    }

    public void setGender() {
        while (true) {
            System.out.print("성별을 입력하세요.: ");
            gender = sc.next().toLowerCase().charAt(0);

            if (gender == 'm' || gender == 'f')
                break;
            else
                System.out.println("성별을 잘못 입력하셨습니다.");
        }
    }

    // ================================================================
    // 직업
    public void setJobs() {
        while (true) {
            System.out.print("직업을 입력 하세요(1~6): ");
            jobs = sc.nextInt();
            if (jobs > 0 && jobs < 7) {
                break;
            } else {
                System.out.println("직업이 잘못 선택 되었습니다. 다시 입력하세요.");
            }
        }
    }
    public int getJobs()
    {
        return jobs;
    }
    // ================================================================
    // 정보
    public void getInfo()
    {
        final String[] jobStr = {"","학생","회사원","주부","무직","개발자","프리랜서"};
        System.out.println("=".repeat(7)+"회원 정보"+"=".repeat(7));
        System.out.println("이름 : "+name);
        System.out.println("나이 : "+age);
        System.out.println("성별 : "+(gender == 'm' ? "남성":"여성"));
        System.out.println("직업 : "+jobStr[jobs]);
    }


}
