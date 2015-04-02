import java.awt.List;


public class ListHouse implements Listable{
	
	//list ADT
	
	private int lotNumber;	
	private String firstName;
	private String lastName;
	private double price;
	private int squareFeet;
	private int bedRooms;
	
	//constructor
	
	public ListHouse(int lotNumber, String firstName, String lastName,
			double price, int squareFeet, int bedRooms) {
		super();
		this.lotNumber = lotNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.price = price;
		this.squareFeet = squareFeet;
		this.bedRooms = bedRooms;
	}
	
	public Listable copy(){
		ListHouse objListHouse = new ListHouse(lotNumber,firstName,lastName,price,squareFeet,bedRooms);
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
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
