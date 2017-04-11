package SingletonMode;

public class Singleton {

	//�ڴ�ʵ�����Ļ�Ϊ����ģʽ
	private static Singleton instance = new Singleton();
	
	private Singleton(){
		
	}
	public static Singleton getInstance(){
		if(instance == null){
			//�ڴ�Ϊ����ģʽ
			instance  = new Singleton();
		}
		return instance;
	}
}
