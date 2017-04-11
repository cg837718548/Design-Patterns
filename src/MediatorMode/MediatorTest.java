package MediatorMode;

public class MediatorTest {

	public static void main(String[] args) {
		UnionOrg union = new UnionOrg();
		Country America = new USA(union);
		America.setName("USA");
		Country Japan = new Japan(union);
		Japan.setName("JPN");
		
		union.setJapan(Japan);
		union.setUsa(America);
		
		America.shenMing("С����  ��Ҫ���");
		Japan.shenMing("����  �Ҵ���");
	}
}
