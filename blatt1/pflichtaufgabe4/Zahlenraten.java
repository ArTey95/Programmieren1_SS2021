import java.util.Scanner;
class Zahlenraten{
	public static void main(String[] args){
		int anzahl= args.length;
		if (anzahl!=0) {
			int arg= Integer. parseInt(args[0]);	
			computerRaten(arg);	
		}
		else {
			selberRaten();	
		}
	  
		
		
	}
	static void computerRaten(int x){
		for (int i=1; ; i++){
			int zahl=(int)(Math.random()*100)+1;
			if (zahl==x){
				System.out.println("\n Your Number was: "+ zahl);
		        System.out.println("\n Number of tries: " + i);
				break;
			}
				
		}
	}	
	static void selberRaten(){
		int zahl = ((int) (Math.random()*100))+1;
		for (int i=1;  ;i++ ){
            System.out.println("Bitte Erraten Sie eine zahl zwischen 1 und 100.");
			Scanner sc = new Scanner(System.in);
			int nextNumber = sc.nextInt();
			if (nextNumber==zahl){
				System.out.println("Glueckwuensch! Sie haben die zahl erraten.");
				break;
			} else if (nextNumber > zahl) {
				System.out.println("Die gesuchte zahl ist kleiner!");
			} else if (nextNumber < zahl) {
				System.out.println("Die gesuchte zahl ist größer!");
			}
				
			
				
		}
		
	}	
}