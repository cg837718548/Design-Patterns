package BuilderMode;

import BuilderMode.Product1.Apple;
import BuilderMode.Product1.Fruit;

public class AppleBuilder implements Builder {

	private Fruit apple = new Apple();
	@Override
	public void builderPart1() {
		apple.addPart("ƻ��Ҷ��");
	}

	@Override
	public void builderPart2() {
		apple.addPart("ƻ��Ƥ");
	}

	@Override
	public Fruit getFruit() {
//		return null;
//		apple.complite();
		return apple;
	}

}
