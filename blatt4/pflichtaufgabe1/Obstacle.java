/**
 * this class creates Obstacles for the player	
 */
class Obstacle implements MapObject {	
	private String name;
	private char symbol;
	private static boolean receivable = false;
/**
 * this classd creats an Obstacle 
 * @param givenName name of the obstacle
 */
	Obstacle(String givenName) {
		this.name = givenName;
		char[] character =  this.name.toCharArray();
		this.symbol = character[0];
	}
/**
 * this classd creats an Obstacle 
 * @param givenName name of the obstacle
 * @param givenSymbol symbol of the obstacle
 */
	Obstacle(String givenName, char givenSymbol) {
		this.name = givenName;
		this.symbol = givenSymbol;
	}
		
	public String getName() {
		return this.name;
	}
	
	public char getSymbol() {
		return this.symbol;
	}
	
	public boolean isLootable() {
		return false;
	}
	
	public boolean getCollision() {
		return true;
	}
	public void setSymbol(char newSymbol) {
		this.symbol = newSymbol;
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