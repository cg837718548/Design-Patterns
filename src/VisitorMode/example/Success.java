package VisitorMode.example;

public class Success extends Status {

	@Override
	public void Manfanying(Man man) {
		System.out.println(man.getClass().getName()+man.getName()+"�ɹ�(man)");
	}

	@Override
	public void Womanfanying(Woman woman) {
		System.out.println(woman.getClass().getName()+woman.getName()+"�ɹ�(man)");
	}

}
