package huydqpc07859_lab2;

public class JUnitMessage {
	private String message;

	public JUnitMessage() {
		// TODO Auto-generated constructor stub
		this.message = "";
	}

	public JUnitMessage(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}

	public String printMessage() {
		throw new ArithmeticException();
	}

	public String printHiMessage() {
		return "Hi!" + message;
	}
}
