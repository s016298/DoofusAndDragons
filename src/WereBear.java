import java.io.Serializable;
public class WereBear extends Person {

	
	private Person bearForm;
	private Person curForm;
	private Person humanForm;
	
	//constructor
	public WereBear(Person bearForm, String name, boolean isWereBear, int str, int tou, int spd, int intel, int ran, int health){
		super(name, isWereBear, str, tou,  spd, intel, ran, health);
		this.bearForm = bearForm;
		curForm = new Person(name, isWereBear, str, tou, spd, intel, ran, health);
		humanForm = new Person(name, isWereBear, str, tou, spd, intel, ran, health);
	}

	
	//getter

	public Person getBear(){
		return bearForm;
	}
	public Person getCurrent(){
		return curForm;
	}
	public Person getHuman(){
		return humanForm;
	}
	//setter
	public void setBearForm(){
		curForm = bearForm;	
	}
	public void setHumanForm(){
		curForm = humanForm;	
	}

	
	
	

	public String toString(){
		return "Werebear " + bearForm.toString() + "  during bear form, and " + humanForm.toString()+" during human form.";
	}
	
}
