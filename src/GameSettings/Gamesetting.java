package GameSettings;

public class Gamesetting {
    private static Gamesetting gameSetting = new Gamesetting();

    String resolution;
    int volume;
    String difficulty;

    private Gamesetting(){


    }

    static Gamesetting getInstance(){
        // 외부 호출 시 미리 만들어진 싱글톤 객체의 주소를 반환
        return gameSetting;
    }


}
