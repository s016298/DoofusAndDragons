
public class WereBear {
	private Character humanForm;
	private Character bearForm;
	private Character curForm;
	private String name;
	
	//constructor
	public WereBear(String name, Character humanForm, Character bearForm){
		this.humanForm  = humanForm;
		this.bearForm = bearForm;
		curForm = humanForm;
		this.name = name;
	}
	
	//getter
	public Character getHuman(){
		return humanForm;
	}
	public Character getBear(){
		return bearForm;
	}
	public Character getCurrent(){
		return curForm;
	}
	//setter
	public void setBearForm(){
		curForm = bearForm;	
	}
	public void setHumanForm(){
		curForm = humanForm;
	}
	public String toString(){
		return "Werebear " + bearForm.toString() + "during bear form and " + humanForm.toString();
	}
	
}
