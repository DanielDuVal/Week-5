package statePattern;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		
		Phone phone = new Phone(4);
		State hasSignalState = new HasSignalState(phone);
		State lostSignalState = new LostSignalState(phone);
		State noSignalState = new NoSignalState(phone);

		assertEquals(4, phone.getBars());
		
		assertTrue(phone.initiateCall());
		assertTrue(phone.dial());
		assertTrue(phone.callStatus());
		assertTrue(phone.endCall());
		
		phone.setState(noSignalState);
		
		assertFalse(phone.initiateCall());
		assertFalse(phone.dial());
		assertFalse(phone.callStatus());
		assertFalse(phone.endCall());
		
		
		
	}
}
