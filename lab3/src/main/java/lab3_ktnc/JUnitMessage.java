package lab3_ktnc;

public class JUnitMessage extends Exception {
    private String message;

    public JUnitMessage(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println(this.message);
    }

    public String printHiMessage() {
        message = "Hi!" + message;
        return message;
    }

    public void throwException() throws JUnitMessage {
        throw new JUnitMessage("This is a JUnitMessage exception");
    }
}
