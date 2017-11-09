package mytests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class myUnitTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		System.out.println("junit before all");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		System.out.println("junit before each");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		
		System.out.println("test");
		Assertions.assertEquals(0, 0);	
			
//		fail("Not yet implemented");
	}

}
