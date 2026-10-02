package Math실습;

import java.util.ArrayList;
import java.util.List;

public class MathPratice {
    public static void main(String[] args) {

    }

    // ============================================================
    // [실습 1] 주사위 시뮬레이션 (random)
    // 주사위 2개를 10,000번 굴려서 두 눈의 합(2~12)이 각각 몇 번 나왔는지 출력하세요.
    // 결과를 보고 어떤 합이 가장 많이 나오는지 확인해 봅시다. (예상: 7)
    // ============================================================
    static void practice1() {
        List<Integer> list = new ArrayList<>();

        while (list.size() <10000){
            int val = (int)(Math.random()*6+1);
            int va2 = (int)(Math.random()*6+1);
            int sum = val+va2;
            list.add(sum);
        }
        // 2 ~12 횟수를 저장
        int[] count = new int[13];
        System.out.println(list);

    }
    // ============================================================
    // [실습 2] 원하는 자리에서 반올림하기 (round, pow)
    // Math.round()는 항상 정수로 반올림합니다.
    // 실수 value를 소수점 digits 자리까지 반올림하는 메서드 roundTo(value, digits)를 만드세요.
    //   roundTo(3.14159, 2) -> 3.14
    //   roundTo(2.71828, 3) -> 2.718
    // 추가 질문: Math.round(-10.5)의 결과는? (-11이 아니라 -10)
    // ============================================================
    static void practice2() {
        System.out.println(roundTo(3.14159,2));
        System.out.println(roundTo(2.71828,3));

        System.out.println(Math.round(-10.5));
    }
    static double roundTo(double value, int digitics){
        double n = Math.pow(10,digitics);
        return Math.round(value*n)/n;
    }

    // ============================================================
    // [실습 3] 게시판 페이지 수 계산 (ceil)
    // 전체 게시글 수와 한 페이지에 보여줄 글 수가 주어질 때, 총 페이지 수를 구하세요.
    //   게시글 95개, 페이지당 10개 -> 10페이지
    //   게시글 100개, 페이지당 10개 -> 10페이지
    //   게시글 0개 -> 0페이지
    // 함정: Math.ceil(95 / 10) 은 왜 9.0이 나올까요? (정수 나눗셈이 먼저 일어남)
    // ============================================================
    static void practice3() {
        int post = 95;
        int page2 = 10;
        int page3 = 0;

        int totalpage;
        if( post == 0){
            totalpage=0;
        }else {
            totalpage=(int)Math.ceil((double) post / page2);
        }
        System.out.println("총 페이지 수 :" + totalpage);

    }
    // ============================================================
    // [실습 4] 두 점 사이의 거리 (abs, sqrt, pow)
    // 좌표 (x1, y1), (x2, y2)가 주어질 때 두 가지 거리를 구하세요.
    //   - 맨해튼 거리 : |x1 - x2| + |y1 - y2|
    //   - 유클리드 거리 : √((x1 - x2)² + (y1 - y2)²)
    //   (1, 2) ~ (4, 6) -> 맨해튼 7, 유클리드 5.0
    // ============================================================
    static void practice4() {
        int x1=1;
        int y1=2;
        int x2=3;
        int y2=4;
        // 맨해튼
        int manhattan =Math.abs(x1-x2) + Math.abs(x2-y2);
        double euclidean = Math.sqrt(Math.pow(x1-y1,2)) +
                Math.sqrt(Math.pow(x2-y2,2));
        System.out.println("맨해튼 거리 : " + manhattan);
        System.out.println("유클리드 거리 : " + euclidean);
    }
    // ============================================================
    // [실습 5] 성적 처리 (random, max, min, round 종합)
    // 1. 학생 10명의 점수를 0~100 사이 임의의 값으로 생성해 리스트에 저장하세요.
    // 2. Math.max / Math.min 을 사용해 최고점과 최저점을 구하세요. (Collections 사용 금지)
    // 3. 평균을 소수점 첫째 자리까지 반올림해 출력하세요. (실습 2의 roundTo 활용)
    // 4. 최고점과 최저점을 뺀 나머지 8명의 평균도 구하세요.
    // ============================================================
    static void practice5() {

    }
}
