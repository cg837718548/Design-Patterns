package VisitorMode.example;

public class test {

	public static void main(String[] args) {
		ObjMain main0 = new ObjMain();
		
		Man man = new Man();
		man.setName("�¸�");
		Woman woman =new Woman();
		woman.setName("���");
		
		main0.add(woman);
		main0.add(man);
		
		Failed failed = new Failed();
		main0.showData(failed);
		
		Success success = new Success();
		main0.showData(success);
		
		Smile smile = new Smile();
		main0.showData(smile);
	}

}
