package FactoryMode;
// ���㸸��
public abstract class Operation {
	private double resulet;
	private double num1;
	private double num2;
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public double getResulet() {
		System.out.println(resulet);
		return resulet;
	}
	public void setResulet(double resulet) {
		this.resulet = resulet;
	}
	public abstract double gainResult();
}