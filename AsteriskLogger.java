package promineotech;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
	}

	@Override
	public void error(String error) {
	
		String errorMessage = "***ERROR: " + error + "***";
	
		for(int i = 0; i < errorMessage.length(); i++) {
			System.out.print("*");
		}
		System.out.println("\n" + errorMessage);
		
		for(int i = 0; i < errorMessage.length(); i++) {
			System.out.print("*");
		}
	}

}
