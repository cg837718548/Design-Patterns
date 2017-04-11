package CommandMode;

public class ConcreteCommand extends Command {

	public ConcreteCommand(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void Excute() {
		getReceiver().doAction();
	}

}
