package ResponsibilityChainModel;

public class H2 extends Handler {

	@Override
	public void chuLi(int jibie) {

		if(jibie<10){
			System.out.println("��B�Ѿ������������");
		}else{
			getNextHandler().chuLi(jibie);
		}
	}

	
}
