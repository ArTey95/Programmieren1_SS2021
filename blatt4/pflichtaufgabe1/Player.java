/**
* Represents a player 
*/
public interface Player {
	
	/**
     * takes item from the map
     *
     */
	void takeItem();
	
	/**
     * puts the item on the map.
     *@param name name of the desired object
     */
	void putItemDown(String name);
	
	/**
     * prints the inventory
     *
     */
	void printInventory();
	
	/**
     * Returns the x coordinate of the player.
     *
     * @return player's x
     */
	int getPlayerX();
	
	/**
    * Returns the y coordinate of the player.
     *@return player's y
    
     */
	int getPlayerY();

	/**
     * changes the x coordinate of the player.
     *
     * @param x desired parameter.
     */
	void setPlayerX(int x);
	
	/**
     * changes the y coordinate of the player.
     *
     * @param y desired parameter.
     */
	void setPlayerY(int y);
	
	
	
}