package ProxyMode;

public class cgGiveYou implements GiveGift {
	
	private Girl girl;
	
	public cgGiveYou(Girl girl) {
		this.girl = girl;
	}
	@Override
	public void giveApple() {
		System.out.println(girl.getName()+"����һ��ƻ��");
	}

	@Override
	public void giveOrange() {
		System.out.println(girl.getName()+"����һ������");
	}

	@Override
	public void giveBanana() {
		System.out.println(girl.getName()+"����һ���㽶");
	}

	
}
