package VisitorMode;
/**
 * ״̬
 * @author 83771
 *
 */
public class ConVisistor2 extends Visitor {

	@Override
	public void visitConcreteElementA(Aelement aelement) {

		System.out.println(aelement.getClass().getName()+"Ԫ�ر�"+this.getName()+"����");
	}

	@Override
	public void visitConcreteElementB(Belement belement) {
		System.out.println(belement.getClass().getName()+"Ԫ�ر�"+this.getName()+"����");
	}

}
