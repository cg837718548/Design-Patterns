package ResponsibilityChainModel;

public class H3 extends Handler {

	@Override
	public void chuLi(int jibie) {

		if(jibie<15){
			System.out.println("��C�Ѿ������������");
		}else{
			getNextHandler().chuLi(jibie);
		}
	}

	
}
