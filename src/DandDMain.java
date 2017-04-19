
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
public class DandDMain{

	public static Character c;
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	boolean doesItExist = Files.exists(Paths.get("dAndD.txt"));
	//below is reference for boolean statements in text, use for Item toString
	//System.out.println(1+2==2?"yes":"no");
	
	
	if (doesItExist){
				FileInputStream fis = new FileInputStream("dAndD.txt");
				ObjectInputStream in = new ObjectInputStream(fis);
				c = (Character)in.readObject();
				//c = new Character("Justin", 10, 10, 10, 10, 10,65);
			in.close();
			FileOutputStream fos = new FileOutputStream("dAndD.txt");
			ObjectOutputStream out = new ObjectOutputStream(fos);
			System.out.println("Prints current configs");
			System.out.println(c);
			c.addItem(0, new Item("Cool Sword", false, true, 0, 100000, 0));
	System.out.println("Prints inventory now that Cool Sword has been added");
			System.out.println(c.getInventory());
		c.deleteItem(0);
	System.out.println("Deletes Cool Sword, and then Prints inventory");
		System.out.println(c.getInventory());
		c.addItem(0, new Item("Retyrbed Cool Sword", false, true, 0, 100000, 0));
		System.out.println(c);
		System.out.println("Prints uses of Item Retyrbed Cool Sword");
		System.out.println(c.getItem(0).getUses());
		System.out.println(rollDice());
		out.writeObject(c);
		out.close();

	}else{
	Scanner s = new Scanner(System.in);
	c = new Character("Justin", 10, 10, 10, 10, 10,65);
	FileOutputStream fos = new FileOutputStream("dAndD.txt");
	ObjectOutputStream out = new ObjectOutputStream(fos);
//Character c;
	
	out.writeObject(c);
	out.close();

//System.out.println(c);
	
	}



	

	}
	//methods
		//stupid events
	/*Need to add getters for every stat for this to work*/	
	
	public static int turnsToStupidEvent(){
		return (20-c.getRan())/2;
	}
	//random events
	public static int strEvent(){

		return c.getStr() + (int) Math.floor(Math.random()*c.getRan())+1;
	}
	public static int touEvent(){

		return c.getTou() + (int) Math.floor(Math.random()*c.getRan())+1;
	}
	public static int spdEvent(){
		Scanner s = new Scanner(System.in);

		return c.getSpd() + (int) Math.floor(Math.random()*c.getRan())+1;
	}
	public static int intelEvent(){
		Scanner s = new Scanner(System.in);

		return c.getIntel() + (int) Math.floor(Math.random()*c.getRan())+1;
	}
	public static int rollDice(){
		return (int) Math.floor(Math.random()*20+1);
	}
	
	
}