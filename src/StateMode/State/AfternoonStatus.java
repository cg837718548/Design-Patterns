package StateMode.State;

import StateMode.Work;

public class AfternoonStatus implements Status {

	@Override
	public void workOut(Work work) {

		if(work.getNowTime()<16){
			System.out.println("�ĵ���  �°�");
		}
		else{
			Status status = new NightStatus();
			work.setStatus(status);
			work.workOut();
		}
	}

}
