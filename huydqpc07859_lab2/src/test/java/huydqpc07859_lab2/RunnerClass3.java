package huydqpc07859_lab2;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunnerClass3 {
	public static void main(String[] args) {
		Result rs = JUnitCore.runClasses(TestAnnotation.class);
		for (Failure failure : rs.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("Run tests count: " + rs.getRunCount());
		System.out.println("Failure count: " + rs.getFailureCount());
		System.out.println("Ignore count: " + rs.getIgnoreCount());
		System.out.println("Result == " + rs.wasSuccessful());
	}
}