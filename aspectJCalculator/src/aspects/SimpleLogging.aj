package aspects;

public aspect SimpleLogging {
	
	
	pointcut operationLogging(double a , double b):
		execution(double model.Operation+.*(double, double)) && args(a, b);

	before (double a, double b): operationLogging(a , b){
		String operationName = thisJoinPoint.getTarget().getClass().getSimpleName();
		System.out.println(operationName.toUpperCase() + " CALLED!");
	}
	
	after(double a, double b): operationLogging(a, b){
		String operationName = thisJoinPoint.getTarget().getClass().getSimpleName();
		System.out.println(operationName.toUpperCase() + " DONE WITH " + a + " AND " + b); 
	}
	
	 after(double a, double b) returning (double result): operationLogging(a, b){
			String operationName = thisJoinPoint.getTarget().getClass().getSimpleName();
			System.out.println(operationName.toUpperCase() + " RESULT = " + result); 
	 }
	 
	 pointcut scannerLogging():
		 execution (void view.ConsoleUI.closeScanner());
	 
	 	after():scannerLogging(){
	 		System.out.println("OPERATION TERMINATED");
	 	}
}



