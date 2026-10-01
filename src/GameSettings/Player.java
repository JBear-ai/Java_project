package GameSettings;

public class Player {
    Gamesetting gamesetting=Gamesetting.getInstance();



    void setInfo(String resolution, int volume, String difficulty) {
        gamesetting.resolution="1920*1080";
        gamesetting.volume = 50;
        gamesetting.difficulty = "Hard";

    }
    public void print(){
        System.out.println("해상도: " + gamesetting.resolution);
        System.out.println("음량: " + gamesetting.volume);
        System.out.println("난이도: " + gamesetting.difficulty);


    }
}
