/**
*handles receiving and creating the code
 */
class Code {
	private int digit;
	private Code subcode;
	private int condition;
/**
*constructor. receives the input.
*@param input ddesired code.
 */
	public Code(int input) {
		
		if (input < 10) {
			digit = input;
			condition = 1;
		} else {
			digit = input % 10;
			subcode = new Code(input / 10);
		}		
		
	}
	@Override
	public String toString() {
		if (this.condition == 1) {
			return String.valueOf(this.digit);
		}

		return "" + this.subcode.toString() + String.valueOf(this.digit);

	}
}
