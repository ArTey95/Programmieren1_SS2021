/**
*this class defines the weapons
*/
class Weapon {
	private String weaponName;
	String weaponKind;
	private int damage;
	
/**
*weapon constructor
*@param		name	damage of weapons
*@param		kind	kind of weapons
*/	
	Weapon(String name, int kind) {
		
		weaponName = name;
		weaponKind = "Sword";
		
	}		
/**
*ork constructor overloaded
*@param		kind	kind of weapons

*/
	Weapon(int kind) {
		if (kind == 1) {
			weaponKind = "Fists";
			damage = (int) ((Math.random() * (10 - 5)) + 5);
	    } else { 
			weaponKind = "Sword";
		}
	}

	public String getName() {
		return this.weaponName;
	}
	public String getKind() {
		return this.weaponKind;
	}
/**
*ork constructor overloaded
*{@return damage dealt}
*/	
	public int dealDamage() {
		int dDamage;
		if (this.weaponKind.equals("Fists")) {
			dDamage = this.damage;
		} else {  
			dDamage = (int) (Math.random() * (30 - 20)) + 20;
		}
		return dDamage;
	}

	
	
	
	










}