package GameSettings;

public class GameMain {
    static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();


        player1.setInfo("1920*1080",50,"Hard");
        player1.print();
        player2.setInfo("1280*960",25,"Normal");
        player2.print();
    }


}
