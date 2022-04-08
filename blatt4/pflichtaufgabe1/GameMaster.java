import java.util.Scanner;
/**
    Runs the game : moves the player and interacts
	with the map.
 */
class GameMaster {
	static char common;
	static int counter;
	

	
	
	public static void main(String[] args) {
		Wizard wizard = new Wizard(3);
		System.out.println("Welcome to Middle-earth.\n");
		
		
		Map.row = Integer.parseInt(args[0]);
		Map.colomn = Integer.parseInt(args[1]);
		System.out.println("You have chosen a " + args[0] + " x " + args[1] + " map.\n");
		System.out.println("Study the map and choose your path wisely.\n");
		System.out.println("Your current position is top left corner.\n");
		
		Map.map = new MapObject[Map.row][Map.colomn];
		Item blank = new Item("Blank", '-');
		Item ring = new Item("Ring");
		Map.placeMapItem(ring);
		
		Item sword = new Item("Sword");
		Map.placeMapItem(sword);
		
		Item healingPotion = new Item("HealingPotion");
		Map.placeMapItem(healingPotion);
		
		Obstacle rocks = new Obstacle("Rocks", '*');
		Map.placeMapItem(rocks);

		Obstacle fire = new Obstacle("Fire", '*');
		Map.placeMapItem(fire);
		
		Obstacle spiderNest = new Obstacle("Spider Nest", '*');
		Map.placeMapItem(spiderNest);
		
		Obstacle swamp = new Obstacle("Swamp", '*');
		Map.placeMapItem(swamp);
		
		Obstacle orcs = new Obstacle("Orcs", '*');
		Map.placeMapItem(orcs);
		for (int i = 0; i < Map.map.length; i++) {
			for (int j = 0; j < Map.map[i].length; j++) {
				if (Map.map[i][j] == (null)) {
					Map.map[i][j] = new Item("Blank", '-');	
				} 
			}	
		}
		
		Map.printMap();
		common = Map.map[0][0].getSymbol();
		do {
			
			counter = 0;
			Map.map[wizard.getPlayerY()][wizard.getPlayerX()].setSymbol('P');
			System.out.println("What do you want to do.\n");
			Scanner scanner = new Scanner(System.in);
			String inputString = scanner.nextLine();
			System.out.println(inputString);
 
			if (inputString.equals("inv")) {
				wizard.printInventory();
			} else if (inputString.equals("map")) {
				Map.printMap();
			} else if (inputString.equals("take")) {
				wizard.takeItem();
			} else {
				String[] parts = inputString.split(" ");
				String part1 = parts[0]; 
				String part2 = parts[1];
				if (part1.equals("drop")) {
					wizard.putItemDown(part2);
				} else if (part1.equals("walk")) {
					
					if (part2.equals("N")) {
						goNorth(wizard);
					} else if (part2.equals("S")) {
						goSouth(wizard);
					
					} else if (part2.equals("W")) {
						goWest(wizard);				
					} else if (part2.equals("E")) {
						goEast(wizard);
					}
				}
			}
			
			for (int i = 0; i < Map.map.length; i++) {
				for (int j = 0; j < Map.map[i].length; j++) {
					if (Map.map[i][j] == (null)) {
						Map.map[i][j] = new Item("Blank", '-');	
					} 
				}			
			}
			
			for (int i = 0; i < Map.map.length; i++) {
				for (int j = 0; j < Map.map[i].length; j++) {
					if (Map.map[i][j].equals(ring)) {
						counter = 1;	
					}
				}	
			}
		} while ( counter == 1);
		System.out.println("You took the ring, your next quest will be to bring it to Mount Doom!");
		
	}
	
	/**
     * Moves the player to south.
     * checks for obstacles and map borders
     * @param wizard player
     */
	public static void goNorth(Wizard wizard) {
		if (Map.checkCoordinates(wizard.getPlayerX(), wizard.getPlayerY() - 1)) {
			if (!Map.map[wizard.getPlayerY() - 1][wizard.getPlayerX()].getCollision()) {
				Map.map[wizard.getPlayerY()][wizard.getPlayerX()].setSymbol(common);
				wizard.setPlayerY(wizard.getPlayerY() - 1); 
				common = Map.map[wizard.getPlayerY()][wizard.getPlayerX()].getSymbol();
				Map.map[wizard.getPlayerY()][wizard.getPlayerX()].setSymbol('P');
			} else {
				System.out.println("You can't move there : obstacle.");
			}	
		} else {
			System.out.println("You can't move there: out of bounds");
		} 
	}
	
	/**
     * Moves the player to south.
     * checks for obstacles and map borders
     * @param wizard player
     */
	
	public static void goSouth(Wizard wizard) {
		if (Map.checkCoordinates(wizard.getPlayerX(), wizard.getPlayerY() + 1)) {
			if (!Map.map[wizard.getPlayerY() + 1][wizard.getPlayerX()].getCollision()) {
				Map.map[wizard.getPlayerY()][wizard.getPlayerX()].setSymbol(common);
				wizard.setPlayerY(wizard.getPlayerY() + 1); 
				common = Map.map[wizard.getPlayerY()][wizard.getPlayerX()].getSymbol();
				Map.map[wizard.getPlayerY()][wizard.getPlayerX()].setSymbol('P');
			} else {
				System.out.println("You can't move there : obstacle.");
			}	
		} else {
			System.out.println("You can't move there: out of bounds");
		} 
	}
	
	/**
     * Moves the player to south.
     * checks for obstacles and map borders
     * @param wizard player
     */
	public static void goWest(Wizard wizard) {
		if (Map.checkCoordinates(wizard.getPlayerX()  - 1, wizard.getPlayerY())) {
			if (!Map.map[wizard.getPlayerY()][wizard.getPlayerX() - 1].getCollision()) {
				Map.map[wizard.getPlayerY()][wizard.getPlayerX()].setSymbol(common);
				wizard.setPlayerX(wizard.getPlayerX() - 1); 
				common = Map.map[wizard.getPlayerY()][wizard.getPlayerX()].getSymbol();
				Map.map[wizard.getPlayerY()][wizard.getPlayerX()].setSymbol('P');
			} else {
				System.out.println("You can't move there : obstacle.");
			}	
		} else {
			System.out.println("You can't move there: out of bounds");
		}
	}
	
	
	/**
     * Moves the player to south.
     * checks for obstacles and map borders
     * @param wizard player
     */
	public static void goEast(Wizard wizard) {
		if (Map.checkCoordinates(wizard.getPlayerX()  + 1, wizard.getPlayerY())) {
			if (!Map.map[wizard.getPlayerY()][wizard.getPlayerX() + 1].getCollision()) {
				Map.map[wizard.getPlayerY()][wizard.getPlayerX()].setSymbol(common);
				wizard.setPlayerX(wizard.getPlayerX() + 1); 
				common = Map.map[wizard.getPlayerY()][wizard.getPlayerX()].getSymbol();
				Map.map[wizard.getPlayerY()][wizard.getPlayerX()].setSymbol('P');
			} else {
				System.out.println("You can't move there : obstacle.");
			}	
		} else {
			System.out.println("You can't move there: out of bounds");
		} 
	}
	
	
	
	
	
	
	
	
	
	
}