
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
public class DandDMain{

	public static Character c, c2, d, e, f;
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	while (true){
		boolean doesYluExist = Files.exists(Paths.get("Y'lu.txt"));
	boolean doesCorvusExist = Files.exists(Paths.get("Corvus.txt"));
	boolean doesRandyExist = Files.exists(Paths.get("SirRandy.txt"));
	boolean doesDatBoiExist = Files.exists(Paths.get("DatBoi.txt"));
	//below is reference for boolean statements in text, use for Item toString
	//System.out.println(1+2==2?"yes":"no");
	
	/*checks to see if the file save file exists. If it does, the data from that file is inputed 
	 * into the corresponding objects*/
	if (doesYluExist){
		/** create a file input steam for every character */	
		FileInputStream fis = new FileInputStream("Y'lu.txt");
				ObjectInputStream in = new ObjectInputStream(fis);
				c = (Character)in.readObject();
				
				in.close();
			
				System.out.println(c);
	/**create a file output steam for every character*/
//				FileOutputStream fos = new FileOutputStream("Y'lu.txt");
//				ObjectOutputStream out = new ObjectOutputStream(fos);
//				out.writeObject(c);
//				c = new Character("Corvus", 9, 11, 10, 14, 10, 63);
//				out.writeObject(d);
//				c = new Character("SirRandy", 9, 12, 10, 11, 12, 69);
//				out.writeObject(e);
//				c = new Character("DatBoi", 11, 12, 10, 9, 14, 67);
//				out.writeObject(f);
//				out.close();

	}else{
			Scanner s = new Scanner(System.in);
			FileOutputStream fos = new FileOutputStream("Y'lu.txt");
			FileOutputStream fos1 = new FileOutputStream("Corvus.txt");
			FileOutputStream fos2 = new FileOutputStream("SirRandy.txt");
			FileOutputStream fos3 = new FileOutputStream("DatBoi.txt");
			ObjectOutputStream out = new ObjectOutputStream(fos);
			//Character c;
			c = new Character("Y'lu", 12, 13, 10, 11, 10, 79);
			out.writeObject(c);
			c = new Character("Corvus", 9, 11, 10, 14, 10, 63);
			out.writeObject(d);
			c = new Character("SirRandy", 9, 12, 10, 11, 12, 69);
			out.writeObject(e);
			c = new Character("DatBoi", 11, 12, 10, 9, 14, 67);
			out.writeObject(f);
			out.close();

			System.out.println(c);
			System.out.println(d);
			System.out.println(e);
			System.out.println(f);
	
	}

	}

	

	}
	//methods
		//stupid events
	/*Need to add getters for every stat for this to work*/	
	

	public static int rollDice(){
		return (int) Math.floor(Math.random()*20+1);
	}
	
	
}