//Justin Cannan
//Some random time
//DandDMain
/*Some code meant to simplify the playing of Doofus and Dragons for the DM. I made much of this Freshman year of highschool, but now,
 a few months later, I'm looking to improve some of the code and to finish the project.*/
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
public class DandDMain{

	public static Person[] team = new Person[4];
	
	public static Turns turns;
	//codes for when an event happens
	public static int turnsLeft;
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	int[] select = new int[20];
	int[] statChange = new int[100];
	Scanner s = new Scanner(System.in);
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
		/** create a file input steam for every Person */	
		//creates file input stream and takes data
		FileInputStream fis = new FileInputStream("Y'lu.txt");
				ObjectInputStream in = new ObjectInputStream(fis);
				team [0] = (Person)in.readObject();
				
				in.close();
				FileInputStream fis1 = new FileInputStream("Corvus.txt");
				ObjectInputStream in1 = new ObjectInputStream(fis1);
				team [1] = (Person)in1.readObject();
				in1.close();
				FileInputStream fis2 = new FileInputStream("SirRandy.txt");
				ObjectInputStream in2 = new ObjectInputStream(fis2);
				team [2] = (Person)in2.readObject();
				in2.close();
				FileInputStream fis3 = new FileInputStream("DatBoi.txt");
				ObjectInputStream in3 = new ObjectInputStream(fis3);
				team [3] = (Person)in3.readObject();
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
				
	/**create a file output steam for every Person*/
				FileOutputStream fos = new FileOutputStream("Y'lu.txt");
				ObjectOutputStream out = new ObjectOutputStream(fos);
				out.writeObject(team [0]);
				FileOutputStream fos1 = new FileOutputStream("Corvus.txt");
				ObjectOutputStream out1 = new ObjectOutputStream(fos1);
				out1.writeObject(team [1]);
				FileOutputStream fos2 = new FileOutputStream("SirRandy.txt");
				ObjectOutputStream out2 = new ObjectOutputStream(fos2);
				out2.writeObject(team [2]);
				FileOutputStream fos3 = new FileOutputStream("DatBoi.txt");
				ObjectOutputStream out3 = new ObjectOutputStream(fos3);
				out3.writeObject(team [3]);
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
		
		team [0] = new WereBear(new Person("Y'lu (Bearform)", true, 13, 14,  10, 7, 10, 79), "Y'lu", true, 12, 13, 10, 11, 10, 79);
		team [1] = new Person("Corvus", false,  9, 11, 10, 14, 10, 63);
		team [2] = new Person("SirRandy", false, 9, 12, 10, 11, 12, 69);
		team [3] = new Person("DatBoi", false, 11, 12, 10, 9, 14, 67);
		
		
			
System.out.println("Created new file save.");
			//Person c;
	
			FileOutputStream fos = new FileOutputStream("Y'lu.txt");
			ObjectOutputStream out = new ObjectOutputStream(fos);
			
			out.writeObject(team [0]);
			FileOutputStream fos1 = new FileOutputStream("Corvus.txt");
			ObjectOutputStream out1 = new ObjectOutputStream(fos1);
		    
			out1.writeObject(team [1]);
			FileOutputStream fos2 = new FileOutputStream("SirRandy.txt");
			ObjectOutputStream out2 = new ObjectOutputStream(fos2);
			
			out2.writeObject(team [2]);
			FileOutputStream fos3 = new FileOutputStream("DatBoi.txt");
			ObjectOutputStream out3 = new ObjectOutputStream(fos3);
			out3.writeObject(team [3]);
			
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
	int select2 = -1;
	while (true) {
	while (selection<1||selection>7){
	//stuff
		//print out data for each Person
	System.out.println(team [0]);
	System.out.println(team [1]);
	System.out.println(team [2]);
	System.out.println(team [3]);
	System.out.println();
	System.out.println("Enter what you would like to do:");
	System.out.println("1. Change Health");
	System.out.println("2. Change Stats");
	System.out.println("3. Add Item To Inventory");
	System.out.println("4. Roll Die");
	System.out.println("5. End turn");
	System.out.println("6. Save");
	System.out.println("7. Save & Quit");
	selection = s.nextInt();
	}
	//Health modification
	
							if (selection == 1){
								
									while (select2 != 0 &&  select2 != 1 && select2 != 2 && select2 != 3 ){
										System.out.println("Enter the ID of the character you would like to change the health of .");
										System.out.println("0. Y'lu");
										System.out.println("1. Corvus");
										System.out.println("2. Sir Randy");
										System.out.println("3. Dat Boi");
										select2 = s.nextInt();
										if (select2==0){
											
										System.out.println("Current health is: "+team [0].getCurrentHealth()+" and Total Health is " + team[0].getHealth());
										select[0]=0;
										while (select[0]<1||select[0]>4){
											System.out.println("How do you want to affect the HEALTH stat?");
											System.out.println("1. Change total health stat to a value");
											System.out.println("2. Change total health stat based on stat upgrades");
											System.out.println("3. Lose health");
											System.out.println("4. Gain health");
											
											select[0]=s.nextInt();
												if(select[0]==1){
													System.out.println("Enter the new value of the health stat");
													int newHealth = -1;
													while (newHealth < 1){
													newHealth = s.nextInt();}
													team[0].changeHealthValue(newHealth);
												}
												if(select[0]==3){
													System.out.println("Enter a POSITIVE value for the amount of health you would like to lose.");
												statChange[0] = 0;
													while (statChange[0]<1){
														statChange[0] = s.nextInt();
													}
													team[0].loseHealth(statChange[0]);
												}
												if (select[0]==4){
													System.out.println("Enter the POSITIVE value for the amount of health you would like to gain.");
													statChange[0] = 0;
													while (statChange[0]<1){
														statChange[0]=s.nextInt();
													}
													team[0].gainHealth(statChange[0]);
												}
												if (select[0]==2){
													team[0].changeHealth();
												}
									
										}
										}
											
										}
										if (select2==1){
											
										System.out.println("Current health is: "+team [1].getCurrentHealth()+" and Total Health is " + team[1].getHealth());
										select[1]=1;
										while (select[1]<1||select[1]>4){
											System.out.println("How do you want to affect the HEALTH stat?");
											System.out.println("1. Change total health stat to a value");
											System.out.println("2. Change total health stat based on stat upgrades");
											System.out.println("3. Lose health");
											System.out.println("4. Gain health");
											
											select[1]=s.nextInt();
												if(select[1]==1){
													System.out.println("Enter the new value of the health stat");
													int newHealth = -1;
													while (newHealth < 1){
													newHealth = s.nextInt();}
													team[1].changeHealthValue(newHealth);
												}
												if(select[1]==3){
													System.out.println("Enter a POSITIVE value for the amount of health you would like to lose.");
												statChange[1] = 0;
													while (statChange[1]<1){
														statChange[1] = s.nextInt();
													}
													team[1].loseHealth(statChange[1]);
												}
												if (select[1]==4){
													System.out.println("Enter the POSITIVE value for the amount of health you would like to gain.");
													statChange[1] = 0;
													while (statChange[1]<1){
														statChange[1]=s.nextInt();
													}
													team[1].gainHealth(statChange[1]);
												}
												if (select[1]==2){
													team[1].changeHealth();
												}
									
										}
										}
										if (select2==2){
											
										System.out.println("Current health is: "+team [2].getCurrentHealth()+" and Total Health is " + team[2].getHealth());
										select[2]=0;
										while (select[2]<1||select[2]>4){
											System.out.println("How do you want to affect the HEALTH stat?");
											System.out.println("1. Change total health stat to a value");
											System.out.println("2. Change total health stat based on stat upgrades");
											System.out.println("3. Lose health");
											System.out.println("4. Gain health");
											
											select[2]=s.nextInt();
												if(select[2]==1){
													System.out.println("Enter the new value of the health stat");
													int newHealth = -1;
													while (newHealth < 1){
													newHealth = s.nextInt();}
													team[2].changeHealthValue(newHealth);
												}
												if(select[2]==3){
													System.out.println("Enter a POSITIVE value for the amount of health you would like to lose.");
												statChange[2] = 0;
													while (statChange[2]<1){
														statChange[2] = s.nextInt();
													}
													team[2].loseHealth(statChange[2]);
												}
												if (select[2]==4){
													System.out.println("Enter the POSITIVE value for the amount of health you would like to gain.");
													statChange[2] = 0;
													while (statChange[2]<1){
														statChange[2]=s.nextInt();
													}
													team[2].gainHealth(statChange[2]);
												}
												if (select[2]==2){
													team[2].changeHealth();
												}
									
										}
										}
										if (select2==3){
											
										System.out.println("Current health is: "+team [3].getHealth()+" and Total Health is " + team[3].getHealth());
										select[3]=0;
										while (select[3]<1||select[3]>4){
											System.out.println("How do you want to affect the HEALTH stat?");
											System.out.println("1. Change total health stat to a value");
											System.out.println("2. Change total health stat based on stat upgrades");
											System.out.println("3. Lose health");
											System.out.println("4. Gain health");
											
											select[3]=s.nextInt();
												if(select[3]==1){
													System.out.println("Enter the new value of the health stat");
													int newHealth = -1;
													while (newHealth < 1){
													newHealth = s.nextInt();}
													team[3].changeHealthValue(newHealth);
												}
												if(select[3]==3){
													System.out.println("Enter a POSITIVE value for the amount of health you would like to lose.");
												statChange[3] = 0;
													while (statChange[3]<1){
														statChange[3] = s.nextInt();
													}
													team[3].loseHealth(statChange[3]);
												}
												if (select[3]==4){
													System.out.println("Enter the POSITIVE value for the amount of health you would like to gain.");
													statChange[3] = 0;
													while (statChange[3]<1){
														statChange[3]=s.nextInt();
													}
													team[3].gainHealth(statChange[3]);
												}
												if (select[3]==2){
													team[3].changeHealth();
												}
												
												
				
				//Change Stats
													if (selection == 2){
														
														
														//First menu: ask what stat the player wants to modify
														int select3 = 0;
														while (select3 <1 || select3 > 5){
															System.out.println("What stat would you like to modify?");
															System.out.println("1. Strength");
															System.out.println("2. Toughness");
															System.out.println("3. Speed");
															System.out.println("4. Intelligence");
															System.out.println("5. Randomness");
															
														}
																	//Strength
																	
																		//What player do you want to modify said stat of	
																					//What does the player want to modify the stat to?
																										
																									//Enter value of what you want the stat's value to become
																	
																	//Speed
																	
																	//What player do you want to modify said stat of	
																	//What does the player want to modify the stat to?
																						
																					//Enter value of what you want the stat's value to become
																			
																	
																	//Intelligence
																	
																	//What player do you want to modify said stat of	
																	//What does the player want to modify the stat to?
																						
																					//Enter value of what you want the stat's value to become
																	
																	//Randomness
																	
																	//What player do you want to modify said stat of	
																	//What does the player want to modify the stat to?
																						
																					//Enter value of what you want the stat's value to become
														
														
													}
												
			
				}
				}

		}
			continue;
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
		turnsLeft = (int) Math.floor((20-((team[0].getRan()+team[1].getRan()+team[2].getRan()+team[3].getRan())/4))/2);
	}
	public static void turnDone(){
		turnsLeft--;
	}
	public static boolean isRandomEvent(){
		return turnsLeft == 0? true : false;
	}

	
	
}