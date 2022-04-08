/**
* This class makes a wizard which implements player interface.
 */
class Wizard implements Player {
	private  MapObject[] inventory; 
	private  int playerX = 0;
	private  int playerY = 0;
	
		/**
     * takes item from map and puts it in inventory.
     * 
     * 
     */
	public  void takeItem() {
		for (int i = 0; i < this.inventory.length; i++) {
			Map.map[playerY][playerX].setSymbol(GameMaster.common);
			if (this.inventory[i].getSymbol() == '-' && Map.map[playerY][playerX].getSymbol() != '-' && Map.map[playerY][playerX].isLootable() ) {
				this.inventory[i] = Map.retrieveItem(playerX, playerY);
				System.out.println("Item placed in inventory place number " + (i + 1) + ".");
				GameMaster.common = '-';
				break;
			} else if (this.inventory[i].getSymbol() != '-') {
				System.out.println("Inventory place number " + (i + 1) + " full.");
				
			} else if (!Map.map[playerY][playerX].isLootable()) {
				System.out.println("not lootable");
				break;
			} else {
				System.out.println("no item avalable");
				break;
			}
		}
	}
		/**
     * takes item from inventory and puts it in map.
     * @param name item's name
     * 
     */
	public  void putItemDown(String name) {
		if (Map.map[this.playerY][this.playerX].getName().equals("Blank")) {
			for (int i = 0; i < this.inventory.length; i++) {
				if (this.inventory[i].getName().equals(name)) {
					GameMaster.common = this.inventory[i].getSymbol();
					Map.map[this.playerY][this.playerX] = this.inventory[i];
					

					this.inventory[i] = new Item("--", '-');
					System.out.println("You droped your " + name);
					break;
				} 
				System.out.println("You don't have any " + name + " in your inventory.");
			}
		} else {
			System.out.println("There is no free space on the map ");
		}
	}
	
	/**
     * prints the inventory on the screen
     * 
     * 
     */
	public  void printInventory() {
		for (int i = 0; i < this.inventory.length; i++) {
			System.out.print(" " + this.inventory[i].getName() + "\n");
		}
	}
	
	public  int getPlayerX() {
		return this.playerX;
	}
	
	public  int getPlayerY() {
		return this.playerY;
	}
	
	


	
	public  void setPlayerX(int x) {
		this.playerX = x;
	}
	
	
	public  void setPlayerY(int y) {
		this.playerY = y;
	}
	/**
     * creates a wizard object
	 @param inventoryCapacity is the capacity of the inventory.
     * 
     * 
     */
	Wizard(int inventoryCapacity) {
		inventory = new MapObject[inventoryCapacity];
		for (int i = 0; i < inventory.length; i++ ) {
			inventory[i] = new Item("--", '-');
		}
	}
}