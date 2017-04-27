
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
public class DandDMain{

	public static Character c, c2, d, e, f;
	public static Turns turns;
	//codes for when an event happens
	public static int turnsLeft;
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	Scanner s = new Scanner(System.in);
	while (true){
		boolean doesYluExist = Files.exists(Paths.get("Y'lu.txt"));
	boolean doesCorvusExist = Files.exists(Paths.get("Corvus.txt"));
	boolean doesRandyExist = Files.exists(Paths.get("SirRandy.txt"));
	boolean doesDatBoiExist = Files.exists(Paths.get("DatBoi.txt"));
	boolean doesTurnsExist = Files.exists(Paths.get("Turns.txt"));
	boolean doesYluBearExist = Files.exists(Paths.get("Y'luBear.txt"));
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
				
				in.close();
				FileInputStream fis1 = new FileInputStream("Corvus.txt");
				ObjectInputStream in1 = new ObjectInputStream(fis1);
				d = (Character)in1.readObject();
				in1.close();
				FileInputStream fis2 = new FileInputStream("SirRandy.txt");
				ObjectInputStream in2 = new ObjectInputStream(fis2);
				e = (Character)in2.readObject();
				in2.close();
				FileInputStream fis3 = new FileInputStream("DatBoi.txt");
				ObjectInputStream in3 = new ObjectInputStream(fis3);
				f = (Character)in3.readObject();
				in3.close();
				//file input stream for turns
				FileInputStream turnsInput = new FileInputStream("Turns.txt");
				ObjectInputStream objectIn = new ObjectInputStream(turnsInput);
				turns= (Turns)objectIn.readObject();

			
				
				
				objectIn.close();
				
////			f.addItem(0, new Item("Father's Pistols", false, true, 0, 1000 ,0));
////			f.addItem(1, new Item("Father's Rapier", false, true, 0, 1000 ,0));
//				System.out.println(f.getItem(2));
				

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
	}else{
			
System.out.println("s");
			//Character c;
			FileOutputStream fos = new FileOutputStream("Y'lu.txt");
			ObjectOutputStream out = new ObjectOutputStream(fos);
			c = new Character("Y'lu", 12, 13, 10, 11, 10, 79);
			out.writeObject(c);
			FileOutputStream fos12 = new FileOutputStream("Y'lu.txt");
			ObjectOutputStream out12 = new ObjectOutputStream(fos12);
			c = new Character("Y'lu of Bear", 12, 13, 10, 11, 10, 79);
			out12.writeObject(c2);
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
	}
	int selection=0;
	char select2 = 'a';
	while (true) {
	while (selection<1||selection>6){
	//stuff
		//print out data for each character
	System.out.println(c);
	System.out.println(c2);
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
	System.out.println();
	System.out.println("Enter what you would like to do:");
	System.out.println("1. Change Health");
	System.out.println("2. Change Stats");
	System.out.println("3. Roll Die");
	System.out.println("4. End turn");
	System.out.println("5. Save");
	System.out.println("6. Save & Quit");
	selection = s.nextInt();
	}
		if (selection == 1){
		
			while (select2 == 'c'||  select2 == 'd'|| select2 == 'e'|| select2 == 'f'){
				System.out.println("Enter the letter of the character you would like to change the health of .");
				System.out.println("c. Y'lu");
				System.out.println("d. Corvus");
				System.out.println("e. Sir Randy");
				System.out.println("f. Dat Boi");
				select2 = s.next().charAt(0);
				if (select2=='c'){
					
				System.out.println(c.getCurrentHealth());
					
				}
		}
		}
		
	}
	
	
	
	
	}

	

	}
	//methods
		//stupid events
	/*Need to add getters for every stat for this to work*/	
	

	public static int rollDice(){
		return (int) Math.floor(Math.random()*20+1);
	}
	public static void whenRandomEvent(){
		turnsLeft = (int) Math.floor((20-((c.getRan()+d.getRan()+e.getRan()+f.getRan())/4))/2);
	}
	public static void turnDone(){
		turnsLeft--;
	}
	public static boolean isRandomEvent(){
		return turnsLeft == 0? true : false;
	}

	
	
}