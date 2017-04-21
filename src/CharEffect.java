import java.util.Scanner;

public class CharEffect {
	private int lengthOfEffect;
	private int until;
	private String name;
	private Character c;
	private String affectedStat;

	public CharEffect(Character c){
		name = "none";
		this.c = c;
	}
	public void start(String newName, Turns turn, int lengthOfEffect){
		Scanner s = new Scanner(System.in);
		//checks if entered stat is real
		while (affectedStat!="TOU"&&affectedStat!="STR"&&affectedStat!="SPD"&&affectedStat!="Intel"&&affectedStat!="RAN"){
			System.out.println("Enter the affected stat");
			affectedStat = s.next();
			if (affectedStat!="TOU"&&affectedStat!="STR"&&affectedStat!="SPD"&&affectedStat!="Intel"&&affectedStat!="RAN"){
				System.err.println("Invalid Input");
			}
		}
		
		until = turn.getTurns() + lengthOfEffect;
		name = newName;
	}
	public void end(Turns turn){
		if (until == turn.getTurns()){
			name = "none";
		}
		else;
	}
//	public booleanTouAffect(){
		
	}
	
	

