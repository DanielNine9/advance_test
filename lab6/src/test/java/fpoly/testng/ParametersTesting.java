package fpoly.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTesting {
	@Parameters({ "BrowserName" })
	@Test
	public void OpenBrowser(String BrowserName) {
		System.out.println("browser passed as :- " + BrowserName);
	}

	@Parameters({ "UserName", "Passcode" })
	@Test
	public void FillLoginForm(String UserName, String Passcode) {
		System.out.println("Parameter for User Name passed as :- " + UserName);
		System.out.println("Parameter for Pass code passed as :- " + Passcode);

	}
}
