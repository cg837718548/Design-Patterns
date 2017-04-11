package StrategyMode;

import StrategyMode.strategy.DiscountCharge;
import StrategyMode.strategy.OrdinaryCharge;
import StrategyMode.strategy.RebateCharge;

/**
 * �������context��
 * �򵥹���ģʽ�����ģʽ����
 * @author 83771
 *
 */
public class cashContext {

	private ChargeClass cc;

	public ChargeClass getCc() {
		return cc;
	}

	public void setCc(ChargeClass cc) {
		this.cc = cc;
	}

	public cashContext(String mode) {
		switch (mode) {
		case "����":
			cc = new DiscountCharge(0.8);
			break;
		case "��200��50":
			cc = new RebateCharge(200, 50);
			break;
		default:
			cc = new OrdinaryCharge();
			break;
		}
	}
	
	public double getResult( double money){
		return cc.accept(money);
	}
}
