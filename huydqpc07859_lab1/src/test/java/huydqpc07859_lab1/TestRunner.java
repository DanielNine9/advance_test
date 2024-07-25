package huydqpc07859_lab1;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		Result rs = JUnitCore.runClasses(UnitTest.class, Unit2Test.class);
		for (Failure fail : rs.getFailures()) {
			System.out.println(fail);
		}
		System.out.println("Result == " + rs.wasSuccessful());
	}
}
