import java.util.Scanner;
import java.util.Arrays;
/**
*handles the game flow and user commands
 */
class GameMaster {
	static int counter;
	static boolean hintChecker;
	static String input;
	public static void main(String args[]) {
		SimpleEnigma.setNumber(Integer.parseInt(args[0]));
		SimpleEnigma enigma = new SimpleEnigma(SimpleEnigma.getNumber());
		runtime();
	}
	
	
/**
*this method asks user for commands. checks if commands are right and shows the results to the user.
 */
	public static void runtime() {
		int integer;
		counter = 0;

		do {
			hintChecker = false;
			Scanner read = new Scanner(System.in);
			System.out.println("Enter command:");
			input = read.nextLine();
			try {
				if (input.equals("hint")) {
					for (int i = 0; i < SimpleEnigma.getNumber(); i++) {
					System.out.println("rad " + (i + 1) + " : " + String.valueOf(SimpleEnigma.hint()[i]));
					}
					hintChecker = true;
				} else if (Character.isWhitespace(input.toCharArray()[4])) {
					String[] parts = input.split(" ");
					String part1 = parts[0]; 
					String part2 = parts[1];
					System.out.println(SimpleEnigma.hint(Integer.parseInt(part2)));
					hintChecker = true;
					
				} 
			} 
			catch (IndexOutOfBoundsException e) {
			}

			if (input.equals("end")) {
				System.out.println("You gave UP!");
				break; }
			if (!hintChecker) {
				if (SimpleEnigma.receive(input.toCharArray())) {
					counter = 1;
				} 
			}

		} while (counter == 0);
		if (!input.equals("end")) {
				
			System.out.println("You have beaten the machine. You can now enter Mount Doom. In the flame the ring was forged, it can also be destroyed. Throw it in the flames to end the misery of middle-earth");
		}
			
			
			

			
	}


























}