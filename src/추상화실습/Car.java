package 추상화실습;

public abstract class Car {

    public int speed;             // 속도
    public double efficiency;     // 연비
    public int efficiency_size;   // 연료탱크 크기
    public int count;             // 좌석 수
    public String name;           // 차량 이름
    public static final int fuel_Price = 2000; // 기름값은 상수로 정의
    // 총 이동 횟수: ceil(승객 수 / 좌석 수)
    public int getMoveCount(int passenger) {

        int moveCount = (int) Math.ceil((double) passenger / count);
        return moveCount;
    }

    // 총 이동 거리 : 지역 거리 * 횟수
    public int getTotalDistance(int passenger, int distance)
    {
        int totalMoving = getMoveCount(passenger) * distance;
        return totalMoving;
    }

    //  총 연료 소모량
    public double getFuelConsumption(int passenger, int distance)
    {
        double oil = getTotalDistance(passenger,distance) / efficiency;
        return oil;

    }

    // 총 주유 횟수
    public int getRefuelCount(int passenger,int distance)
    {
        int oilCount = (int) Math.ceil(getFuelConsumption(passenger,distance)/efficiency_size);
        return oilCount;
    }

    // 총 비용
    public int getTotalCost(int passenger,int distance)
    {
        int total= (int)(getFuelConsumption(passenger,distance)*fuel_Price);
        return total;
    }

    // 이동 시간
    public double getTravelTime(int passenger,int distance,double weatherFactor){
        double movingTime = (double)distance/ speed * getMoveCount(passenger)*weatherFactor;
        return movingTime;
    }


    // 부가 모드 설정 시 각 차량별 기능 반영
    // 스포츠 : 터보 (속도 20%)증가
    // 승용차 : 트렁크 좌석화 (좌석 1석 추가)
    // 버스 : 보조 연료 탱크(30L 추가)
    public abstract void setMode(boolean isOn);


}