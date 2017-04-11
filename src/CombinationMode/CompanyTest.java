package CombinationMode;

public class CompanyTest {

	public static void main(String[] args) {

		ConcreteCompany companyRoot = new ConcreteCompany("ȫ���ܹ�˾");
		companyRoot.add(new HRDepartment("�ܹ�˾������"));
		companyRoot.add(new FinanceDepartment("�ܹ�˾����"));
		
		ConcreteCompany comp = new ConcreteCompany("shanghai�ֹ�˾");
		comp.add(new HRDepartment("����������"));
		comp.add(new FinanceDepartment("��������"));
		companyRoot.add(comp);
		
		ConcreteCompany comp1 = new ConcreteCompany("hangzhou�ֹ�˾");
		comp1.add(new HRDepartment("hangzhou������"));
		comp1.add(new FinanceDepartment("hangzhou����"));
		comp.add(comp1);
		
		ConcreteCompany comp2 = new ConcreteCompany("huzhou�ֹ�˾");
		comp2.add(new HRDepartment("huzhou������"));
		comp2.add(new FinanceDepartment("huzhou����"));
		comp.add(comp2);
	
		companyRoot.DisPlay(1);
		System.out.println();
		companyRoot.doDuty();
		
	}

}
