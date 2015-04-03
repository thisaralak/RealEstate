


public class ListHouse implements Listable{
	
	//list ADT
	
	private int lotNumber;	
	private String firstName;
	private String lastName;
	private int price;
	private int squareFeet;
	private int bedRooms;
	
	//constructor
	
	public ListHouse(String lastName, String firstName, int lotNumber,int price, int squareFeet, int bedRooms )
	{
		this.lastName = lastName;
		this.firstName = firstName;
		this.lotNumber = lotNumber;
		this.price = price;
		this.squareFeet = squareFeet;
		this.bedRooms = bedRooms;
	}
	
	public Listable copy(){
		ListHouse objListHouse = new ListHouse(lastName, firstName, lotNumber, price,squareFeet, bedRooms);
		return objListHouse;
	}
	
	public int compareTo(Listable tempListHouse){
		ListHouse objListHouse = (ListHouse)tempListHouse;
		return (this.lotNumber-objListHouse.lotNumber);
	}
	//getters and setters
	
	public int getLotNumber() {
		return lotNumber;
	}
	public void setLotNumber(int lotNumber) {
		this.lotNumber = lotNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSquareFeet() {
		return squareFeet;
	}
	public void setSquareFeet(int squareFeet) {
		this.squareFeet = squareFeet;
	}
	public int getBedRooms() {
		return bedRooms;
	}
	public void setBedRooms(int bedRooms) {
		this.bedRooms = bedRooms;
	}
	
	
}
