package VisitorMode;
/**
 * B�ķ�Ӧ
 * @author 83771
 *
 */
public class Belement implements Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementB(this);
	}

	
}
