package ObserverMode;

public class Subject extends Notifier  {

	@Override
	public void addObserver(Object object, String methodName, Object... args) {
		System.out.println("����һ������ͬѧ");
		EventHandler eventHandler = this.getEventHandler();
		eventHandler.addEvent(object, methodName, args);
	}

	@Override
	public void callUp() {
		System.out.println("Ŀ������");
		try {
			this.getEventHandler().notifyX();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
