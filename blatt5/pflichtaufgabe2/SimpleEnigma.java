import java.util.Random;
/**
* this class handles the whole syste, and interaction between letterwheels 
* with eachother and the user.
 */
class SimpleEnigma {
	private static int rotationCounter = 0;
	private static int number;
	private static Letterwheel[] list;
	private int[] random;
/**
*orders the cunstructions unique Letterwheels with random encryption.
*@param number  number of the wheels.
 */
	SimpleEnigma(int number) {
		list = new Letterwheel[number];
		random = new int[number];
		
		
		do {
			for (int i = 0; i < number; i++) {
				Random r = new Random();
				random[i] = r.nextInt(Letterwheel.alphabet.toCharArray().length - 1) + 1; 
				list[i] = new Letterwheel(Letterwheel.alphabet.toCharArray()[random[i]]);
			} 
		} while (!unique());
	}
/**
*turns the wheel system. each wheel has its own rule for rotation.
 */		
	public static void turnwheels() {
		rotationCounter += 1;
		for (int i = 0; i < number; i++) {
			if (rotationCounter % (number - i) == 0) {
				for (int j = i; j < number; j++) {
					list[j].rotate();
				}
			}
		}
	}
/**
*receives four letters from user. compares them to the answer and gives back the result.
*@param input input from the user.
*@return if the answer is right.
 */
	public static boolean receive(char[] input) {
		char[] guess = new char[4];
		try {
			for (int i = 0; i < input.length; i++) {
				int index = new String(list[number - 1].ring).indexOf(Character.toUpperCase(input[i]));
				guess[i] = Letterwheel.alphabet.toCharArray()[index];
				turnwheels();
			}
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("too much input letters. First four letter will be concidered as your guess");
		}
		if (String.valueOf(guess).equals("RING")) {
			System.out.println("Output: " + String.valueOf(guess));
			return true;
		} else {
			System.out.println("Output: " + String.valueOf(guess));
			return false; 
		}
	}
			

	
	
/**
*helps the user by showing the current situation of the letter wheels.
*@return an string array of the letter wheels.
 */
	public static String[] hint() {
		String[] string = new String[number];
		for (int i = 0; i < number; i++) {
			string[i] = String.valueOf(list[i].ring);
		}
		return string;
	}

/**
*helps the user by showing the current situation of one letter wheel.
*@return a string array the letter wheel.
*@param input number of the desired letter wheel.
 */
	public static String hint(int input) {
		return String.valueOf(list[input - 1].ring);
	}

	public static void setNumber(int input) {
		number = input;
	}
	
	public static int getNumber() {
		return number;
	}
/**
*checks if the letter wheels generated are unique. it checks 
*@return if the two wheels are unique
 */
	public boolean unique() {
		for (int i = 0; i < random.length; i++) {
			for (int k = i + 1; k < random.length; k++) {
				if (list[i].equals(list[k])) {
					return false;	
				}					
			}
		}
		return true;
	}









}