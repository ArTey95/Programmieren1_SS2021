/**
	battle class: main battle happens here.
*/
class Battle {
	
		
	public static void main(String[] args) {
		Hobbit hobbit1 = new Hobbit("Frodo");
		System.out.println(hobbit1.hobbitWeapon.getKind());
		if (hobbit1.hobbitWeapon.weaponKind.equals("Sword")) {
			System.out.println(hobbit1.hobbitWeapon.getName());
		}
		Hobbit hobbit2 = new Hobbit("Sam");
		System.out.println(hobbit2.hobbitWeapon.getKind());
		Hobbit hobbit3 = new Hobbit("Meri");
		System.out.println(hobbit3.hobbitWeapon.getKind());
		Hobbit hobbit4 = new Hobbit("Pipin");
		System.out.println(hobbit4.hobbitWeapon.getKind());
		for (int i = 1; i < 11; i++) {
			System.out.println("An ork emerges, ready for battle!");

			Ork ork = new Ork();
			while (ork.isAlive() || (hobbit1.isAlive() && hobbit2.isAlive() &&	hobbit3.isAlive() &&	hobbit4.isAlive())) {
				hobbit1.attack(ork);
				if (hobbit1.hobbitWeapon.weaponKind.equals("Sword")) {
					System.out.println("Frodo [" + hobbit1.hobbitWeapon.getKind() 
						+ "(" + hobbit1.hobbitWeapon.getName() + ")] dealt" 
						+ hobbit1.hobbitWeapon.dealDamage() + "damage.");
				} else { 
					System.out.println("Frodo [" + hobbit1.hobbitWeapon.getKind() + "] dealt" + hobbit1.hobbitWeapon.dealDamage() + "damage.");
				}
				ork.attack(hobbit1);
				System.out.println("Orc [" + ork.orkWeapon.getKind() + "] dealt" + ork.orkWeapon.dealDamage() + "damage.");

				hobbit2.attack(ork);
				System.out.println("Sam [" + hobbit2.hobbitWeapon.getKind() + "] dealt" + hobbit2.hobbitWeapon.dealDamage() + "damage.");
				
				
				ork.attack(hobbit2);
				System.out.println("Orc [" + ork.orkWeapon.getKind() + "] dealt" + ork.orkWeapon.dealDamage() + "damage.");
				
				
				hobbit3.attack(ork);
				System.out.println("Meri [" + hobbit3.hobbitWeapon.getKind() + "] dealt" + hobbit3.hobbitWeapon.dealDamage() + "damage.");
				
				
				ork.attack(hobbit3);
				System.out.println("Orc [" + ork.orkWeapon.getKind() + "] dealt" + ork.orkWeapon.dealDamage() + "damage.");
				
				
				
				hobbit4.attack(ork);
				System.out.println("Pipin [" + hobbit4.hobbitWeapon.getKind() + "] dealt" + hobbit4.hobbitWeapon.dealDamage() + "damage.");
				
				
			
				ork.attack(hobbit4);
				System.out.println("Orc [" + ork.orkWeapon.getKind() + "] dealt" + ork.orkWeapon.dealDamage() + "damage.");
				
				int heal = (int) (Math.random() * (16 - 0));
				System.out.println("The Aura healed everybody by" + heal + ".");
				if (hobbit1.isAlive()) {
					hobbit1.healed(heal);
				}
				if (hobbit2.isAlive()) {
					hobbit1.healed(heal);
				}
				if (hobbit3.isAlive()) {
					hobbit1.healed(heal);
				}
				if (hobbit4.isAlive()) {
					hobbit1.healed(heal);
				}
					
				
			
				
			}
			if (ork.isAlive()) {
				System.out.println("Hobbits Died");
				break;
			} else {
				System.out.println("Ork Died");
			}
			
			int heal = (int) (Math.random() * (16 - 0));
			System.out.println("The Aura healed everybody by" + heal + ".");
			if (hobbit1.isAlive()) {
				hobbit1.healed(heal);
			}
			if (hobbit2.isAlive()) {
				hobbit1.healed(heal);
			}
			if (hobbit3.isAlive()) {
				hobbit1.healed(heal);
			}
			if (hobbit4.isAlive()) {
				hobbit1.healed(heal);
			}
				
			
	
		}
		
		System.out.println("All Orks died!");	
	}		
			

}