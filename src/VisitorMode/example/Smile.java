package VisitorMode.example;

public class Smile extends Status {

	@Override
	public void Manfanying(Man man) {
		System.out.println(man.getName()+"Ц��");

	}

	@Override
	public void Womanfanying(Woman woman) {
		System.out.println(woman.getName()+"Ц��");
	}

}
