/**
 * this classd is specially for making and interacting with map.	
 */
class Map {
	
	static int row;
	static int colomn;
	public static MapObject[][] map;
	private static int x;
	private static int y;
	
	/**
     * places object on the map 	
     * @param object object 
     * 
     */
	public static void placeMapItem(MapObject object) {
		do {
			x = (int) (Math.random() * Map.colomn);
			y = (int) (Math.random() * Map.row);
		} while (map[y][x] != null );
		map[y][x] = object;
	}
	
	
	/**
     * places receives object from  the map 	
     * @param x number of colomn 	 
     * @param y number of row 
	 * @return the object
     */
	public static MapObject retrieveItem(int x, int y) {
		MapObject result = Map.map[y][x];
		Map.map[y][x] = null; 
		return result;
				
	}
	
	/**
     * checks if player is in the map 	
     * @param x x coordinate 	 
     * @param y y coordinate
	 * @return if player in the declared coordinates will be on the map
     */
	public static boolean checkCoordinates(int x, int y) {
		if (x < colomn && x >= 0 && y >= 0 && y  < row) {
			return true;
		} else { 
			return false;
		}
	}
	
	
	/**
     * prints the map on the screen	
     */
	public static void printMap() { 
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] != null) {
					System.out.print(map[i][j].getSymbol() + "\t" );	
				} 
			}
			System.out.println("\n\n");
				
		}

	}
	
	
	

	
	
}