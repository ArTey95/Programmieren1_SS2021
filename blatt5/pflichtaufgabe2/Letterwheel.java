import java.util.Arrays;
/**
   * this class generates wheels.
 */
class Letterwheel {
	public static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	char[] ring;
	int rotation;
	
/**
*constructs a letter wheel/ 
*@param input  the encryption key. ring rotates until the input equals A in the Alphabet.
* for example if input is B the letter wheel will be like :BCDEFGHIJKLMNOPQRSTUVWXYZ
 */
	Letterwheel(char input) {
		ring = alphabet.toCharArray();
		rotation = alphabet.indexOf(input);
		for (int i = 0; i < rotation; i++) {
			this.rotate();
		}
	}		
			
	

/**
*receives a letter and gives back the equal letter in the wheel
*@param input  letter in the alphabet
* @return letter in the wheel
 */
	public char process(char input) {
		char capitalInput = Character.toUpperCase(input);
		return ring[alphabet.indexOf(capitalInput)];
	}
			


/**
*rotates the wheel

 */
	public void rotate() {
		char hold = this.ring[0]; 
		for (int i = 0; i < alphabet.toCharArray().length; i++) {
			if ((i + 1) < alphabet.toCharArray().length) {
				this.ring[i] = this.ring[i + 1];
			} else { 
				this.ring[i] = hold;
			}
		}
	}


	@Override 
	public String toString() {
		return String.valueOf(this.ring);
	}
	
	
	@Override
	public boolean equals(Object x) {
		if (x == null ) {
			return false;
		}		
		if (x.getClass() != getClass()) {
			return false;
		}
			
		Letterwheel other = (Letterwheel) x;
		return Arrays.equals(this.ring, other.ring);
	}
		








}