package promineotech;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		for(int i = 0; i < log.length(); i++) {
			System.out.print(log.charAt(i) + " ");
		}
	}

	@Override
	public void error(String error) {
		String errorMessage = "";
		
		for(int i = 0; i < error.length(); i++) {
			errorMessage += error.charAt(i) + " ";
		}
		System.out.println("ERROR: " + errorMessage);
	}

}
