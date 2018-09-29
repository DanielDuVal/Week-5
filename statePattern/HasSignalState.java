package statePattern;

public class HasSignalState implements State{
	Phone phone;

	public HasSignalState(Phone phone) {
		this.phone = phone;
	}

	public boolean initiateCall() {
		System.out.println("Initiating Call...");
		boolean success = true;
		return success;
	}

	public boolean dial() {
		System.out.println("Dialing");
		boolean success = true;
		return success;
	}

	public boolean callStatus() {
		System.out.println("Call in Progress");
		boolean success = true;
		return success;
	}

	public boolean endCall() {
		System.out.println("Call ended");
		boolean success = true;
		return success;
	}
}
