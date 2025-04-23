package controller;

import model.Operation;
import model.OperationFactory;
import view.ConsoleUI;

public class CalculatorController {
	
	ConsoleUI ui;
	
	public CalculatorController(ConsoleUI ui) {
		this.ui = ui;
	}
	
	public void start() {
		ui.displayMensage("Hello! Choose a arithmetic operation!");
		
		boolean isGoing = true;
		while (isGoing) {
			
			int operationCode = ui.operationDecision();
			Operation operation = OperationFactory.createOperation(operationCode);
			
			double firstOperator = ui.retrieveInput("Chose the first operator");
			double secondOperator = ui.retrieveInput("Chose the second operator");
			
			operation.execute(firstOperator, secondOperator);
			
			isGoing = ui.userWishtoContinue("Do you wish to do another operation? \n 1 - Yes \n 2 - No");
		}
		
		ui.closeScanner();
	}
}
