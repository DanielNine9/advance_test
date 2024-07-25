package lab3_ktnc;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class ErrorCollectorExample {

	@Rule
	public ErrorCollector errorCollector = new ErrorCollector();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// Setup before all tests
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// Cleanup after all tests
	}

	@Before
	public void setUp() throws Exception {
		// Setup before each test

	}

	@After
	public void tearDown() throws Exception {
		// Cleanup after each test

	}

	@Test
	public void test() {
		errorCollector.addError(new Throwable("This is an error in the first line"));
		errorCollector.addError(new Throwable("This is an error in the second line"));
		System.out.println("Hello tests");
		try {
			assertTrue("A".equals("B"));
		} catch (Throwable test) {
			errorCollector.addError(test);
		}
		System.out.println("World tests");
	}
}
