package lab3_ktnc;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitMessageTest {
	private String message = "fploy";
	JUnitMessage junitMessageTest;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.junitMessageTest = new JUnitMessage(this.message);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPrintMessage() {
		System.out.println("running testPrintMessage");
		junitMessageTest.printMessage();
	}

	@Test
	public void testPrintHiMessage() {
		System.out.println("running testPrintHiMessage");
		String expected = "Hi!fploy";
		assertEquals(expected, junitMessageTest.printHiMessage());
	}

	@Test(expected = JUnitMessage.class)
	public void testThrowException() throws Exception {
		System.out.println("running testThrowException");
		junitMessageTest.throwException();
	}
	
	
}
