package StrategyMode;

public class StrategyTest {

	public static void main(String[] args) {
		cashContext cc = new cashContext("��200��50");
		System.out.println(cc.getResult(300));
	}

}
