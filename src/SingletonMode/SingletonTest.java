package SingletonMode;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2  = Singleton.getInstance();
		if(singleton1 == singleton2){
			System.out.println("����ʵ��Ϊͬһ��");
		}else{
			System.out.println("����Ϊ��ͬһ��ʵ��");
		}
	}
}
