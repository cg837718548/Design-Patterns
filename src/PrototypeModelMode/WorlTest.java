package PrototypeModelMode;

public class WorlTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Resume resume  = new Resume("jeker_chen");
		resume.setAge(22);
		resume.setSex(1);
		workExperience  work = new workExperience("�㽭ʡ", "����");
		resume.setExperience(work);
		
		Resume a = (Resume) resume.clone();
		Resume b = (Resume) resume.clone();
		Resume c = (Resume) resume.clone();
		
		b.setAge(23);
		c.setName("�¸�");
		work.setAddress("����");
		c.setExperience(work);
		
		a.show();
		b.show();
		c.show();
	}
}
