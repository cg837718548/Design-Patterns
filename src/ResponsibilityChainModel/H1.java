package ResponsibilityChainModel;

public class H1 extends Handler {

	@Override
	public void chuLi(int jibie) {

		if(jibie<5){
			System.out.println("��A�Ѿ������������");
		}else{
			getNextHandler().chuLi(jibie);
		}
	}

	
}
