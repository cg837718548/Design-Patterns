package StateMode.State;

import StateMode.Work;

public class SleepStatus implements Status {

	@Override
	public void workOut(Work work) {

		System.out.println("����   ��Ҫ˯����");
	}

}
