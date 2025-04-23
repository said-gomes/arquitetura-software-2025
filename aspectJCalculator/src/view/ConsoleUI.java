package view;

import java.util.Scanner;

public class ConsoleUI {
	
    private Scanner scanner = new Scanner(System.in);
	
    public void displayMensage(String message) {
    	System.out.println(message);
    }
    
	public double retrieveInput(String message) {
		System.out.println(message);
		return scanner.nextDouble();
	}

	public int operationDecision() {
		
		System.out.println("Choose a operation: ");
		System.out.println(" 1 - Addition");
		System.out.println(" 2 - Subtraction");
		System.out.println(" 3 - Multiplication");
		System.out.println(" 4 - Division");
		
		return scanner.nextInt();
	}
	
	public boolean userWishtoContinue(String message) {
		int decision = (int)retrieveInput(message);
		return decision == 1;
	}
	
	public void closeScanner() {
		scanner.close();
	}
	

}
