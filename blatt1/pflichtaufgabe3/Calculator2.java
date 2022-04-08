class Calculator2{
	public static void main(String[] args){
	  
		float zahl1= Float.parseFloat(args[0]);
		float zahl2= Float.parseFloat(args[1]);
		String operator= args[2];
		
		
		
	
	
	
		switch(operator){
			case "+": System.out.println(zahl1+zahl2);
			break;
			case "-": System.out.println(zahl1-zahl2);
			break;
			case "/": System.out.println(zahl1/zahl2);
			break;
			case "*": System.out.println(zahl1*zahl2);
			break;
			default: System.out.println("Ungueltig");
		}
		
	}
}