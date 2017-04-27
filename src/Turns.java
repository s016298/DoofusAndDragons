import java.io.Serializable;

public class Turns implements Serializable {
private int turnNum;

public  Turns(int turnNum){
	this.turnNum = turnNum;
}

public int getTurns(){
	return turnNum;
}
public void nextTurn(){
	turnNum++;
}
public String toString(){
	return "The turn number is " + turnNum;
}
	
}
