/**
	this defines the strength and color of the magicwand
*/
class MagicWand {
	private  String color;
	private  int strength;
/**
*magic wand constructor
*@param		farbe	color
*@param		kraft	strength
*/
	MagicWand(String farbe, int kraft) {
		color = farbe;
		strength = kraft;
	}
/**
*set strength method
*{@return the stthrength from private}
*@param		x	strength
*/
	public int setStrength(int x) {
		this.strength = x;
		return this.strength;
	}
	public  int getStrength() {
		return this.strength;
	}
	
/**
*set color method
*{@return the color from private}
*@param		colour	color
*/
	public String setcolor(String colour) {
		this.color = colour;
		return this.color;
	}
	public  String getColor() {
		return this.color;
	}
	
	@Override
	public boolean equals(Object x) {
		if (x == null ) {
			return false;
		}		
		if (x.getClass() != getClass()) {
			return false;
		}
			
		MagicWand other = (MagicWand) x;
		return this.strength == other.strength && this.color.equals(other.color);
	}			
}
	

	
