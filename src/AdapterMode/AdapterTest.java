package AdapterMode;

public class AdapterTest {

	public static void main(String[] args) {
		BgPlayer bgPlayer = new BgPlayer();
		bgPlayer.setName("��˸��׵�");
		bgPlayer.attack();
		
		BgPlayer bgPlayer1 = new BgPlayer();
		bgPlayer1.setName("james");
		bgPlayer1.attack();
		
		AdapterPlay adapterPlay = new AdapterPlay();
		adapterPlay.setName("Ҧ��");
		adapterPlay.attack();
		adapterPlay.Defense();
	}
}
