package StateMode.State;

import StateMode.Work;

public class MorningStatus implements Status {

	@Override
	public void workOut(Work work) {
		if(work.getNowTime()<9){
			System.out.println("���ھŵ� ���ڳ��緹��");
		}
		else{
			Status status = new NoonStatus();
			work.setStatus(status);
			work.workOut();
			
		}
	}

}
