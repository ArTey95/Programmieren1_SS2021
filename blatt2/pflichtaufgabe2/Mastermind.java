import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
/**
	*This program generates 4 unique numbers between 1-8 randomly. The user has to guess these numbers in correct order.
	*Program will tell the user if the numbers were in the right place or not.
	*User can try 10 times.
*/
class Mastermind {
	public static void main(String[] args) {
		System.out.println("\n Hello and welcome to the game Mastermind!\n"); 
		System.out.println(" You must try to guess 4 unique numbers in the right order. You only have 10 tries. Good Luck!");
		int[] secret = generateNumber();	
		
		for (int versuch = 1; versuch <= 11; versuch++) {
			if (versuch == 11) {
				System.out.println(" You used all your chances. You lost :(\n\n the correct answer was :" + Arrays.toString(secret));
				break;
			}	
			System.out.println(" Try #" + versuch);	
			
			int[] guess = userInput();
			System.out.println("Your guess was: " + Arrays.toString(guess));
			
			boolean finish = control(guess, secret, versuch);
			if (finish) {
				break;
			}
		}	
	}	
	
	/**
	* generates 4 random unique digits between 1 and 8
	*{@return the generated numbers array}
	*/
	public static int[] generateNumber() {
		int[] secret1 = new int[4];
		int number = 0;
		for (int i = 0; i < secret1.length; i++) {	
			while (true) {
				Random random = new Random();
				number = random.nextInt(8) + 1;
				int n = 0;
				for (int k = 0; k < secret1.length; k++) {
					if (secret1[k] != number) {
						n = n + 1;
					}
				}
				if (n == 4) {
					break;
				}			
						  
			}
			secret1[i] = number;
					
		}
		return secret1;
	}	

	/**
	* asks user for input. puts the numbers in an array.
	*{@return the guessed numbers array}
	*/

	public static int[] userInput() {
	    int[] guess1 = new int[4];
		System.out.println("\nPlease enter four unique integers\n");
		Scanner input = new Scanner(System.in);
		String eingabe = input.next(); 	
		for (int i = 0; i < 4; i++) {
			guess1[i] = Character.getNumericValue(eingabe.charAt(i));
		}
		return guess1;
	}
	
	/**
	* ccompares the input with the randomly generated numbers. 
	*{@return if the answer was correct}
	*@param		x	guessed array
	*@param		y	randomely generated array
	*@param		z   number of tries
	*/
	public static boolean control(int[]x, int[]y, int z) {
		boolean end;
		if (Arrays.equals(x, y)) {
			System.out.println("\n Congratulations, you've won!! It took you " + z + " tries.\n");
			end = true;
		} else {	
			int k = 0;
			for (int i = 0; i < 4; i++) {
				if (x[i] == y[i]) {
					k = k + 1;
				}
			}
			System.out.println("\n correct numbers in correct place " + k + "\n");
				
			int m = 0;
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (x[i] == y[j] && i != j) {
						m = m + 1;			
					}
				}			
			}
			System.out.println("\n correct numbers in false place " + m + "\n");
			end = false;
		}
		return end;
	}
	
}