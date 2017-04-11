package ObserverMode;

import java.util.LinkedList;
import java.util.List;

public class EventHandler {

	//ʹ��һ��List
	private List<Event> objs;

	public EventHandler() {
		super();
		objs = new LinkedList<>();
	}
	
	//���ĳ���¼�
	public void addEvent(Object object,String methodName,Object...args){
		objs.add(new Event(object,methodName,args));   
	}
	
	//֪ͨ�����¼�ִ��ָ�����¼�
	public void notifyX() throws Exception{
		for( Event event: objs){
			event.invoke();
		}
	}
}
