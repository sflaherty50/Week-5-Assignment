
public class App {

	public static void main(String[] args) {

		Logger asteriskLogit = new AsteriskLogger();

		asteriskLogit.Log("Hello");

		asteriskLogit.Error("Hello");

		Logger spacedLogit = new SpacedLogger();

		spacedLogit.Log("Hello");

		spacedLogit.Error("Hello");

	}

}