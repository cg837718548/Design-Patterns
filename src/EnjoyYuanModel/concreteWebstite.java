package EnjoyYuanModel;

public class concreteWebstite extends Website {

	
	
	@Override
	public void use(User user) {
		System.out.println("��վ�����ǣ�"+getName()+"---ʹ�����ǣ�"+user.getName());
	}

	
}
