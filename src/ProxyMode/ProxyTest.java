package ProxyMode;

public class ProxyTest {

	public static void main(String[] args) {
		Girl girl  = new Girl();
		girl.setName("���");
		
		ProxyGiveYou giveYou = new ProxyGiveYou(girl);
		giveYou.giveApple();
		giveYou.giveBanana();
		giveYou.giveOrange();
	}
}
