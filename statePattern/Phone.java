package statePattern;

public class Phone {

	State hasSignalState;
	State lostSignalState;
	State noSignalState;
	
	State state;
	int bars = 5;										//refers to the number of bars your phone has (signal strength).
	
	public Phone(int numberOfBars) {
		hasSignalState = new HasSignalState(this);
		lostSignalState = new HasSignalState(this);
		noSignalState = new HasSignalState(this);
		
		this.bars = numberOfBars;
		if(numberOfBars > 0)
			state = hasSignalState;
		else state = noSignalState;
	}
	
	public boolean initiateCall(){
		state.initiateCall();
		if(state.initiateCall() == true) {
			state.dial();
			return true;
		}
		else return false;
	}
	
	public boolean dial() {
		state.dial();
		if(state.dial() == true) {
			state.callStatus();
			return true;
		}
		else return false;
	}
	
	public boolean callStatus() {
		state.callStatus();
		if(state.callStatus() == true)
			return true;
		else return false;
	}
	
	public boolean endCall() {
		state.endCall();
		if(state.endCall() == true)
			return true;
		else return false;
	}
	
	int getBars() {
		return bars;
	}
	
	public void setState(State state) {
		this.state = state;
	}
}
