/**
	this class makes two different staffs and compares them 
*/
class Main {
	private int strength1;
	private int strength2;
	private String color1;
	private String color2;
	
	
	public static void main(String[] args) {
		MagicWand wand1 = new MagicWand("red", 10);
		int strength1 = wand1.getStrength();
		String color1 = wand1.getColor();

		System.out.println(strength1);
		MagicWand wand2 = new MagicWand("blue", 6);
		int strength2 = wand2.getStrength();
		String color2 = wand2.getColor();

		String compare;

		if (strength1 > strength2) {
			compare = "stronger than";
		} else if (strength1 == strength2) { 
			compare = "equals with"; 
		} else {
			compare = "weaker than"; 
		}
		System.out.println(color1 + " staff with strength " + strength1 + " is " + compare + color2 + " staff with strength " + strength2 + ".");
		System.out.println("The staffs are the same: " + wand1.equals(wand2));
		
	
		
		
		
	}
}
	
		
