import java.util.Random;
/**
*this class defines the orks
*/
class Ork {
	private String name;
	private int lp;
	Weapon orkWeapon;

/**
*generates weapons
*{@return hobbit weapons}
*/
	public Weapon weaponGenerator() {
		Random random = new Random();
		int number = random.nextInt(2);
		orkWeapon = new Weapon(number);
		return orkWeapon;
			
	}
/**
*ork constructor
*/
	Ork() {
		orkWeapon = weaponGenerator();
		lp =  (int) (Math.random() * (151 - 80)) + 80;
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
*@param		hobbit	the enemy
*/	
	public void attack(Hobbit hobbit) {
		hobbit.recvDamage(this.orkWeapon.dealDamage());
	}
	public boolean isAlive() {
		return this.lp > 0;
		
	}
}