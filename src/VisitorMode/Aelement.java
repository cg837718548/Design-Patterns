package VisitorMode;
/**
 * A�ķ�Ӧ
 * @author 83771
 *
 */
public class Aelement implements Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);
	}

	
}
