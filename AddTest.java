package programming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	public void Addtest() {
		MyJunitClass junit = new MyJunitClass();
		int Result = junit.add(100,200);
		assertEquals(301,Result);
				
		
		
	}

}
