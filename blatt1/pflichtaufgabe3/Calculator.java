class Calculator{
	public static void main(String[] args){
	  
	  
		float zahl1= Float.parseFloat(args[0]);
		float zahl2= Float.parseFloat(args[1]);
		String operator= args[2];
		
		
		
	
		if(operator.equals("+")) {
			System.out.println("\n Ergebnis: \n");
			System.out.println(zahl1 + zahl2);
		} 
		else if (operator.equals("-")){
			System.out.println("\n Ergebnis: \n");
			System.out.println(zahl1 - zahl2);
		} 
		else {
			System.out.println( "\n Error: falsche Rechenoperation! \n");
		}
			
		
	}
}