package main;

import controller.CalculatorController;
import view.ConsoleUI;

public class App {

	public static void main(String[] args) {
		
		ConsoleUI ui = new ConsoleUI();
		CalculatorController calculator = new CalculatorController(ui);
		calculator.start();
		
	}
	

}
