package StateMode.State;

import StateMode.Work;

public class NightStatus implements Status {

	@Override
	public void workOut(Work work) {
		if(work.isFlag()){
			System.out.println("���첻��ҹ����   ˯��");
		}
		else{
			if(work.getNowTime()<21){
				System.out.println("�ŵ���   ��Ӧ���ڳ�ҹ����");
			}
			else{
				Status status = new SleepStatus();
				work.setStatus(status);
				work.workOut();
			}
		}
	}

}
