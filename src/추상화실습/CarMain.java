package 추상화실습;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car;
//        Car car = new SportsCar("스포츠카");
//        Car car1 = new Sedan("승용차");
//        Car car2 = new Bus("버스");

        // 사용자 입력

        // 지역 선택
        // [1] 부산 (400km), [2] 대전 (150km), [3] 강릉 (200km), [4] 광주 (300km)
        System.out.println("");
        String[] regions = {"","부산", "대전", "강릉", "광주"};
        int[] distances = {0,400, 150, 200, 300};

        System.out.println("[1] 부산 (400km), [2] 대전 (150km), [3] 강릉 (200km), [4] 광주 (300km)");
        System.out.print("이동 지역 선택: ");
        int regionsSelect = sc.nextInt(); // 지역 선택 번호

        //
//        while (true){
//            int select = sc.nextInt();
//            try {
//
//                switch (select){
//                    case 1:
//                        select
//                }
//            }
//        }

        //

        // 승객 수 입력
        System.out.print("이동할 승객 수 입력: ");
        int passenger = sc.nextInt(); // 승객수 직접 입력

        // 차량 선택
//        String[] carType= {"", "스포츠카", "승용차", "버스"};

        System.out.print("이동할 차량 선택 [1]스포츠카, [2]승용차, [3]버스 : ");
//        System.out.print("차량 선택: ");
        while (true) {
            int carSelect = sc.nextInt();
            switch (carSelect) {
                case 1:
                    car = new SportsCar("스포츠카");
                    break;
                case 2:
                    car = new Sedan("승용차");
                    break;
                case 3:
                    car = new Bus("버스");
                    break;
                default:
                    System.out.println("존재 하지 않는 차량입니다.");
                    continue;
            }
            break;
        }

        // 부가기능 선택
        System.out.print("부가기능 선택 [1] ON / [2] OFF : ");
        int modelSelect = sc.nextInt();

        boolean isOn;
        if(modelSelect == 1){
            isOn = true;
        }else {
            isOn = false;
        }

        // 날씨 선택
        String[] weather = {"","맑음","비(이동 시간 +20%)","눈(이동 시간 +40%)"};
        double[] weatherFactor = {0, 1.0, 1.2, 1.4};
        System.out.print("날씨 [1]맑음 [2]비 [3]눈 : ");
        int weatherSelect = sc.nextInt();

        // =====================
        // 인터페이스 기능 구현
        // 에어컨
        System.out.println("");
        System.out.print("G80 에어컨 [1]ON [2]OFF : ");
        int aircon_Select = sc.nextInt();

        String aircon_State;
        boolean aircon_On;
        if(aircon_Select == 1){
            // ON
            aircon_On = true;
            aircon_State = "에어컨 ON";

        }else {
            // OFF
            aircon_On = false;
            aircon_State = "에어컨 OFF";
        }
        System.out.println("G80: "+aircon_State );

        // 오디오
        System.out.print("G80 오디오 [1]ON [2]OFF : ");
        int audio_Select = sc.nextInt();

        String audio_State;
        boolean audio_On;
        if(audio_Select == 1){
            // ON
            audio_On = true;
            audio_State = "오디오 ON";

        }else {
            // OFF
            audio_On = false;
            audio_State = "오디오 OFF";
        }
        System.out.println("G80: "+audio_State );

        // 자율 주행
        System.out.print("G80 자율주행 [1]ON [2]OFF : ");
        int autopilot_Select = sc.nextInt();

        String autopilot_State;
        boolean autopilot_On;
        if(autopilot_Select == 1){
            // ON
            autopilot_On = true;
            autopilot_State = "자율주행 ON";

        }else {
            // OFF
            autopilot_On = false;
            autopilot_State = "자율주행 OFF";
        }
        System.out.println("G80: "+autopilot_State );
        //======================

        // 변수 정리
        //총 비용
        int totalCost = car.getTotalCost(passenger,distances[regionsSelect]);

        // 총 주유 횟수
        int totalCount = car.getRefuelCount(passenger,distances[regionsSelect]);

        // 총 이동 시간
        double traveTime = car.getTravelTime(passenger,distances[regionsSelect],weatherFactor[weatherSelect]);
        int hour = (int) traveTime; // 시간
        int minute = (int)((traveTime-hour) * 60); // 분

        System.out.println("\n"+"=".repeat(7) + car.name + "=".repeat(7));
        System.out.printf("총 비용 : %,d원\n",totalCost);
        System.out.println("총 주유 횟수 : "+totalCount+"회" );
        System.out.println("총 이동 시간 : "+hour+"시간"+minute+"분" );

        System.out.println("=======확인용======");
        System.out.println("확인 속도 = " + car.speed + "km/L");
        System.out.println("확인 이동 거리 = " + distances[regionsSelect]+"km");
        System.out.println("확인 총 이동 횟수 = " + car.getMoveCount(passenger)+"회");
        System.out.println("확인 날씨 지연 배율 = " + weatherFactor[weatherSelect] + "배");
        System.out.println("확인 총 이동 시간 = " + traveTime + "시간");

        // 예외 처리 아직 구현 안함 인원수에 맞지 않는 차량 선택시 어떻게 할것인가?
    }
}
