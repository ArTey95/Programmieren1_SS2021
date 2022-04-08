import java.util.Random;
/**
*this class defines the hobbits
*/
class Hobbit {
	private String name;
	private int lp;
	Weapon hobbitWeapon;
	
	
	/**
*generates weapons
*{@return hobbit weapons}
*/
	public Weapon weaponGenerator() {
		Random random = new Random();
		int number = random.nextInt(2);
		if (number == 1) {
			hobbitWeapon = new Weapon(number);
		} else {
			if (this.name.equals("Frodo")) {	 
				hobbitWeapon = new Weapon("Sting", number);
			} else {
				hobbitWeapon = new Weapon(number);
			}
				
		}
		return hobbitWeapon;
			
	}

/**
*hobit constructor
*@param		hobbitName	name
*/
	Hobbit(String hobbitName) {
		name = hobbitName;
		hobbitWeapon = weaponGenerator();
		lp = 100;
	}
	
/**
*damage received
*@param		damage	damage from weapons
*/
	public void recvDamage(int damage) {
		this.lp = this.lp - damage;
	}
/**
*attack method
*@param		ork	the enemy
*/
	public void attack(Ork ork) {
		ork.recvDamage(this.hobbitWeapon.dealDamage());
	}
	
	public boolean isAlive() {
		return this.lp > 0;
		
	}
	
	public String getHobbitName() {
		return this.name;
	}
/**
*healing method
*@param		healing 	amount of heal

*/
	public void healed(int healing) {
		this.lp += healing;
	}
}