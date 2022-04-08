/**
 * this class creates Items for the player	
 */
class Item implements MapObject {
	private String name;
	private char symbol;
	private static boolean receivable = true;
	private int itemX;
	private int itemY;
	/**
	* creats an item
	*@param givenName desired name of the object
	*/
	Item(String givenName) {
		this.name = givenName;
		char[] character =  this.name.toCharArray();
		this.symbol = character[0];
		itemX = (int) (Math.random() * Map.colomn);
		itemY = (int) (Math.random() * Map.row);
	}
	/**
	* creats an item
	*@param givenName desired name of the object
	*@param givenSymbol desired symbol of the object
	*/
	Item(String givenName, char givenSymbol) {
		this.name = givenName;
		this.symbol = givenSymbol;
		itemX = (int) (Math.random() * Map.colomn);
		itemY = (int) (Math.random() * Map.row);
	}
		
	public String getName() {
		return this.name;
	}
	
	public char getSymbol() {
		return this.symbol;
	}
	
	public void setSymbol(char newSymbol) {
		this.symbol = newSymbol;
	}
	
	public boolean isLootable() {
		return true;
	}
	
	public boolean getCollision() {
		return false;
	}
	

	@Override
	public boolean equals(Object x) {
		if (x == null ) {
			return false;
		}		
		if (x.getClass() != getClass()) {
			return false;
		}
			
		MapObject other = (MapObject) x;
		return this.getName() == other.getName();
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}