package VisitorMode;

import java.util.ArrayList;
import java.util.List;

/**
 * ��ö������Ԫ�أ��ṩ�߲�ӿ���������߷�������Ԫ��
 * @author 83771
 *
 */
public class ObjectStructre {

	private List<Element> elements = new ArrayList<>();
	
	public void addElement(Element element){
		elements.add(element);
	}
	
	public void removeElement(Element element){
		elements.remove(element);
	}
	
	public void showData(Visitor visitor){
		for(Element element : elements){
			element.accept(visitor);
		}
	}
	
}
