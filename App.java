package promineotech;

public class App {

	public static void main(String[] args) {

		Logger AsteriskLogger = new AsteriskLogger();	// instance of AsteriskLogger class 
		Logger SpacedLogger = new SpacedLogger();		// instance of SpacedLogger class 
		
		System.out.println("Log method on AsteriskLogger");
		AsteriskLogger.log("Hola");						// call to log method of an instance of the AsteriskLogger Class, passing String argument
		System.out.println("\nError method on AsteriskLogger");
		AsteriskLogger.error("Hello");					// call to error method of an instance of the AsteriskLogger Class, passing String argument
		
		System.out.println("\n\nLog method on SpacedLogger");
		SpacedLogger.log("JAVA");						// call to log  method of an instance of the SpacedLogger Class, passing String argument
		System.out.println("\n\nError method on SpacedLogger");
		SpacedLogger.error("ORACLE");					// call to error method of an instance of the SpacedLogger Class, passing String argument
	}

}
