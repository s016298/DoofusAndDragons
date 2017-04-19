import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
public class Character implements Serializable {

	private int str, tou, spd, intel, ran, health, curHealth;
	private String name;
	//private Item[] Inventory = new Item[100];
		private ArrayList<Item> Inventory = new ArrayList<Item>();
	public Character (String name ,int str, int tou, int spd, int intel, int ran, int health){
		this.name = name;
		this.str = str;
		this.tou = tou;
		this.spd = spd;
		this.intel = intel;
		this.ran = ran;
		this.health = health;
		curHealth = health;
	}
	//getters
	public int getCurrentHealth(){
		return curHealth;
	}
	public int getHealth(){
		return health;
	}
	public ArrayList<Item> getInventory(){
		return Inventory;
	}
	public Item getItem(int ItemId){
		return Inventory.get(ItemId);
	}
	public String getName(){
		return name;
	}
	public int getStr(){
		return str;
	}
	public int getTou(){
		return tou;
	}
	public int getSpd(){
		return spd;
	}
	public int getIntel(){
		return intel;
	}
	public int getRan(){
		return ran;
	}
	
	//setters
	
	public void addItem(int i, Item it){
		Inventory.add(i,it);
	}
	public void deleteItem(int i){
		Inventory.remove(i);
	}
	
	public void changeHealth(){
		health = tou*5+((int) Math.random()*ran);
	}
	public void loseHealth(int losehealth){
		curHealth -= losehealth;
	
	}
	public void gainHealth(int gainhealth){
		curHealth += gainhealth;
	}
	public void strUpgrade(){
		str++;
	}
	public void touUpgrade(){
		tou++;
		changeHealth();
	}
	public void spdUpgrade(){
		spd++;
	}
	public void intelUpgrade(){
		intel++;
	}
	public void ranUpgrade(){
		ran++;
		changeHealth();
	}
	public void resetHealth(){
		curHealth = health;
	}
	public String toString(){
		return "Name is "+name+ " strength is "+str+" toughness is "+ tou+" Speed is "+ spd+" intelelligence is "+intel+" randomness is "+ran +" Total health is "+health+" but current health is "+curHealth+ " Items are "+ Inventory.toString();
	}
	
	
	
}
