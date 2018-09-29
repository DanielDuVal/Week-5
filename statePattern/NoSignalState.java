package statePattern;

public class NoSignalState implements State{
	Phone phone;

	public NoSignalState(Phone phone) {
		this.phone = phone;
	}

	public boolean initiateCall() {
		System.out.println("No signal.");
		boolean success = false;
		return success;
	}

	public boolean dial() {
		System.out.println("No signal.");
		boolean success = false;
		return success;
	}

	public boolean callStatus() {
		System.out.println("No signal.");
		boolean success = false;
		return success;
	}

	public boolean endCall() {
		System.out.println("No signal.");
		boolean success = false;
		return success;
	}
}
