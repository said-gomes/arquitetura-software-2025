package model;

public class OperationFactory {
	
	public static Operation createOperation (int codigo) {
		return switch(codigo) {
	    case 1 -> new Addition();
	    case 2 -> new Subtraction();
	    case 3 -> new Multiplication();
	    case 4 -> new Division();
	    default -> null;
		};
	
	}

}
