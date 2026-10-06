package 프레임워크List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        // 1. 입력
        System.out.println("문자열 10개를 입력하세요.");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "번째: ");
            list.add(scanner.nextLine());
        }

        // 2. 전체 출력 및 크기
        System.out.println("\n[전체] " + list);
        System.out.println("크기: " + list.size());

        // 3. 추가
        list.add("Java");            // 맨 뒤에 추가
        list.add(0, "Start");        // 맨 앞(인덱스 0)에 삽입
        System.out.println("\n[추가 후] " + list);
        System.out.println("크기: " + list.size());

        // 4. 조회
        System.out.println("\n인덱스 3번 요소: " + list.get(3));

        // 5. 수정
        String oldValue = list.set(2, "Modified"); // 인덱스 2 변경 및 이전 값 반환
        System.out.println("\n인덱스 2번 변경 전 값: " + oldValue);
        System.out.println("[수정 후] " + list);

        // 6. 삭제
        String removedValue = list.remove(1); // 인덱스 1 삭제 및 삭제된 값 반환
        System.out.println("\n삭제된 요소(인덱스 1): " + removedValue);

        boolean isRemoved = list.remove("Java"); // 값으로 삭제
        System.out.println("\"Java\" 삭제 성공 여부: " + isRemoved);

        // 7. 검색
        System.out.print("\n검색어 입력: ");
        String searchWord = scanner.nextLine();

        boolean containsWord = list.contains(searchWord);
        System.out.println("포함 여부: " + containsWord);

        if (containsWord) {
            int index = list.indexOf(searchWord);
            System.out.println("위치: " + index + "번 인덱스");
        } else {
            System.out.println("찾을 수 없습니다.");
        }

        // 8. 반복 출력
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.println("[" + i + "] " + list.get(i));
        }

        // 9. 정렬
        Collections.sort(list);
        System.out.println("\n[정렬 후] " + list);

        // 10. 전체 삭제
        list.clear();
        System.out.println("\n[전체 삭제] 크기: " + list.size() + ", 비어있음: " + list.isEmpty());

        scanner.close();
    }
}
