package DecorativeMode;

public  class Close extends Person{

	private Person component;
	 //װ��
	public  void  Decorate(Person person){
		this.component = person;
	}
	@Override
	public void show() {
		if(component!=null)
		{
			component.show();
		}
	}
	
	
}
