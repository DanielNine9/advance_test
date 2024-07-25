package lab3_ktnc;

import static org.junit.Assert.*;
import org.junit.rules.ExpectedException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

public class PersonTest {
	private Person person;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test(expected = IllegalArgumentException.class)
	public void testConstructorThrowsException() {
		this.person = new Person("Fpoly", -1);
	}

	@Test
	public void testConstructorThrowsExceptionWithRule() {
		int age = -1;
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("Invalid age: " + age);
		this.person = new Person("Fpoly", age);
	}

	@Test
	public void testConstructorWithTryCatch() throws Exception {
		try {
			int age = -1;

			this.person = new Person("Fpoly", age);
			fail("Should have thrown an IllegalArgumentException because age is invalid!");
		} catch (IllegalArgumentException ex) {
			
		}

	}
	@Test
	public void testConstructorTrue() throws Exception {
		try {
			int age = 1;

			this.person = new Person("Fpoly", age);
			System.out.println("Bạn đã nhập đúng");
		} catch (IllegalArgumentException ex) {
			fail("Age must be greater than or equal to 1");
		}

	}
}
