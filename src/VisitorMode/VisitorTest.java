package VisitorMode;
/**
 * ������ģʽ���������ݽṹ�ȶ��������
 * ˫����
 * @author 83771
 *
 */
public class VisitorTest {

	public static void main(String[] args) {

		ObjectStructre structre = new ObjectStructre();
		structre.addElement(new Aelement());
		structre.addElement(new Belement());
		
		Visitor conVisistor = new ConVisistor();
		conVisistor.setName("�¸�");
		Visitor conVisistor1 = new ConVisistor2();
		conVisistor1.setName("���");
		
		structre.showData(conVisistor);
		structre.showData(conVisistor1);
		System.out.println("-----------------");
		new Aelement().accept(conVisistor1);
		new Aelement().accept(conVisistor);
		
		
		
		
	}

}
