package StateMode.State;

import StateMode.Work;

public class NoonStatus implements Status {

	@Override
	public void workOut(Work work) {
		if(work.getNowTime()<12){
			System.out.println("���ڳ��з�");
		}
		else{
			Status status = new AfternoonStatus();
			work.setStatus(status);
			work.workOut();
		}
	}

	
}
