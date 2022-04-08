import java.util.Scanner;
import java.util.InputMismatchException;
/**
*Handles the way code receives the input. uses toString method to give it back digit by digit.
 */
class Main {
	public static void main(String[] args) throws WrongInputException {
		try {
			int input;
			if (args.length == 0) {
				Scanner read = new Scanner(System.in);

				System.out.print("Please type the numerical code you want to create: ");
				input = read.nextInt();
			} else {
				input = Integer.parseInt(args[0]);	
			}

			Code code = new Code(input);
			System.out.println();
			System.out.println("The code " + code.toString() + " was created.");	
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException | InputMismatchException e) {
			throw new WrongInputException(e.getMessage());
		}
			
	}	
}
