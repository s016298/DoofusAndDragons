import java.io.Serializable;

//Justin Cannan
//Item
//March 30th, 2017
/*Codes for inventory items*/
public class Item implements Serializable {
//Instance Variables
	private boolean expendable;
	private boolean isWeapon;
	private int uses;
	private int damage;
	private int armor;
	private String itemName;
	
	
	public Item(String itemName, boolean expendable, boolean isWeapon, int uses,  int damage, int armor){
		this.itemName = itemName;
		this.expendable = expendable;
		
		if (!expendable){
			this.isWeapon = isWeapon;
				if(isWeapon)this.damage = damage;
				else this.armor = armor;
		}
		else this.uses = uses;
		
	}
	//Accessory
	
	public boolean getExpendableStatus(){
		return expendable;
	}
	public boolean getisWeaponStatus(){
		return isWeapon;
	}
	public double getUses(){
//		if (expendable)return uses;
//		else return Double.POSITIVE_INFINITY;
		return expendable? uses : Double.POSITIVE_INFINITY;
	}
	public int getDamage(){
//		if (isWeapon)return damage;
//		else return 0;
		return isWeapon? damage : 0; 
	}
	public int getArmor(){
//		if(!isWeapon)return armor;
//		else return 0;
		return isWeapon? 0 : armor;

	}
	
	public String toString(){
		return itemName;
	
	}	
}

	
		
	