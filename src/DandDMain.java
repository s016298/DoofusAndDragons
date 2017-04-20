
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
public class DandDMain{

	public static Character c, c2, d, e, f;
	public static Turns turns;
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	while (true){
		boolean doesYluExist = Files.exists(Paths.get("Y'lu.txt"));
	boolean doesCorvusExist = Files.exists(Paths.get("Corvus.txt"));
	boolean doesRandyExist = Files.exists(Paths.get("SirRandy.txt"));
	boolean doesDatBoiExist = Files.exists(Paths.get("DatBoi.txt"));
	boolean doesTurnsExist = Files.exists(Paths.get("Turns.txt"));
	//below is reference for boolean statements in text, use for Item toString
	//System.out.println(1+2==2?"yes":"no");
	
	/*checks to see if the file save file exists. If it does, the data from that file is inputed 
	 * into the corresponding objects*/
	if (doesYluExist&&doesCorvusExist&&doesRandyExist&&doesDatBoiExist&&doesTurnsExist){
		/** create a file input steam for every character */	
		//creates file input stream and takes data
		FileInputStream fis = new FileInputStream("Y'lu.txt");
				ObjectInputStream in = new ObjectInputStream(fis);
				c = (Character)in.readObject();
				FileInputStream fis1 = new FileInputStream("Corvus.txt");
				ObjectInputStream in1 = new ObjectInputStream(fis1);
				d = (Character)in1.readObject();
				FileInputStream fis2 = new FileInputStream("SirRandy.txt");
				ObjectInputStream in2 = new ObjectInputStream(fis2);
				e = (Character)in2.readObject();
				FileInputStream fis3 = new FileInputStream("DatBoi.txt");
				ObjectInputStream in3 = new ObjectInputStream(fis3);
				f = (Character)in3.readObject();
				//file input stream for turns
				FileInputStream turnsInput = new FileInputStream("Turns.txt");
				ObjectInputStream objectIn = new ObjectInputStream(turnsInput);
				turns= (Turns)objectIn.readObject();
				
				in.close();
				in1.close();
				in2.close();
				in3.close();
				objectIn.close();
				
////			f.addItem(0, new Item("Father's Pistols", false, true, 0, 1000 ,0));
////			f.addItem(1, new Item("Father's Rapier", false, true, 0, 1000 ,0));
//				System.out.println(f.getItem(2));
				
				System.out.println(c);
				System.out.println(d);
				System.out.println(e);
				System.out.println(f);
				System.out.println(turns);
				
	/**create a file output steam for every character*/
				FileOutputStream fos = new FileOutputStream("Y'lu.txt");
				ObjectOutputStream out = new ObjectOutputStream(fos);
				out.writeObject(c);
				FileOutputStream fos1 = new FileOutputStream("Corvus.txt");
				ObjectOutputStream out1 = new ObjectOutputStream(fos1);
				out1.writeObject(d);
				FileOutputStream fos2 = new FileOutputStream("SirRandy.txt");
				ObjectOutputStream out2 = new ObjectOutputStream(fos2);
				out2.writeObject(e);
				FileOutputStream fos3 = new FileOutputStream("DatBoi.txt");
				ObjectOutputStream out3 = new ObjectOutputStream(fos3);
				out3.writeObject(f);
				//creates stream for turns
				FileOutputStream turnsOutputStream = new FileOutputStream("Turns.txt");
				ObjectOutputStream  objectOut = new ObjectOutputStream(turnsOutputStream);
				objectOut.writeObject(turns);
				out.close();
				out1.close();
				out2.close();
				out3.close();
				objectOut.close();
				break;
	}else{
			Scanner s = new Scanner(System.in);

			//Character c;
			FileOutputStream fos = new FileOutputStream("Y'lu.txt");
			ObjectOutputStream out = new ObjectOutputStream(fos);
			c = new Character("Y'lu", 12, 13, 10, 11, 10, 79);
			out.writeObject(c);
			FileOutputStream fos1 = new FileOutputStream("Corvus.txt");
			ObjectOutputStream out1 = new ObjectOutputStream(fos1);
		    d = new Character("Corvus", 9, 11, 10, 14, 10, 63);
			out1.writeObject(d);
			FileOutputStream fos2 = new FileOutputStream("SirRandy.txt");
			ObjectOutputStream out2 = new ObjectOutputStream(fos2);
			e = new Character("SirRandy", 9, 12, 10, 11, 12, 69);
			out2.writeObject(e);
			FileOutputStream fos3 = new FileOutputStream("DatBoi.txt");
			ObjectOutputStream out3 = new ObjectOutputStream(fos3);
			f = new Character("DatBoi", 11, 12, 10, 9, 14, 67);
			out3.writeObject(f);
			FileOutputStream turnsOutputStream = new FileOutputStream("Turns.txt");
			ObjectOutputStream  objectOut = new ObjectOutputStream(turnsOutputStream);
			turns = new Turns(0);
			objectOut.writeObject(turns);
			out.close();
			out1.close();
			out2.close();
			out3.close();
			objectOut.close();

			System.out.println(c);
			System.out.println(d);
			System.out.println(e);
			System.out.println(f);
			break;
	
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