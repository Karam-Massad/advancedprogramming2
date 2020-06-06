package facade;

public class Account {
	int number;
	String Name;
	int buildingNumber;
	
	public Account(int number, String Name,int buildingNumber) {
		this.number = number;
		this.Name = Name;
		this.buildingNumber = buildingNumber;
		
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getBuildingNumber() {
		return buildingNumber;
	}
	public void setBuildingNumber(int buildingNumber) {
		this.buildingNumber = buildingNumber;
	}
}
