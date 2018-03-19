package Lab7;

import java.util.Scanner;



/*Shane Fancler and Nathan Snyder
 * CSCI136 - Lab7
 * 3/9/18
 * 
 * 
 * Player class will instantiate the movement class and collison detector class and call functions of those
 * classes to perform actions like move, collect items and die. 
 * 
 */
public class Player {
	private String name;
	private int x, y;
	private Scanner playerScan;
	private int timeAlive;
	private int itemsCollected;
	private String imagePath;
	
	

//constructor will take name from JTextfield or file in the GamePanel and set it as an attribute of this instance of player
//so it can be used when the score is displayed
public Player(String name, int x, int y, String imagePath)
{
	this.name= name;
	this.x = x;
	this.y  = y;
	this.imagePath = imagePath;
}

public int getX() {
	return x;
}

public int getY() {
	return y;
}

public String getImagePath() {
	return imagePath;
}

public void setX(int x) {
	this.x = x;
}

public void setY(int y) {
	this.y = y;
}


}

