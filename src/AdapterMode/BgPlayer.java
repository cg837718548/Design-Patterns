package AdapterMode;

public class BgPlayer extends Player {

	@Override
	public void attack() {
		System.out.println(getName()+"�����˽�������");
	}

	@Override
	public void Defense() {
		System.out.println(getName()+"�����˷�ʽ����");
	}

	
}
