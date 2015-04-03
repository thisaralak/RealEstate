import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class HouseFile {
	
	private static BufferedReader inFile;
	private static PrintWriter outFile;
	private static boolean inFileOpen=false;
	private static boolean outFileOpen=false;
	private static String inString="";
	
	public static void reset() throws IOException {
		if(inFileOpen){
			inFile.close();
		}
		
		if(outFileOpen){
			outFile.close();
		}
		
		inFile = new BufferedReader(new FileReader("house.dat"));
		inFileOpen=true;
		inString=inFile.readLine();
	}
	
	public static void write() throws IOException {
		if(inFileOpen){
			inFile.close();
		}
		
		if(outFileOpen){
			outFile.close();
		}
		
		outFile = new PrintWriter(new FileWriter("house.dat"));
		outFileOpen=true;
	}
	
	//get information from House File
	public static ListHouse getNextHouse() throws IOException{
		int lotNumber=0;	
		String firstName="unknown";
		String lastName="unknown";
		int price=0;
		int squareFeet=0;
		int bedRooms=0;
		
		lotNumber=Integer.parseInt(inFile.readLine());
		firstName=inFile.readLine();
		lastName=inString;
		price=Integer.parseInt(inFile.readLine());
		squareFeet=Integer.parseInt(inFile.readLine());
		bedRooms=Integer.parseInt(inFile.readLine());
		inString=inFile.readLine();
		
		ListHouse objListHouse =  new ListHouse(lastName, firstName, lotNumber, price,squareFeet, bedRooms);
		return objListHouse;
	}
	
	//set information to House File
	public static void setNewHouse(ListHouse objListHouse) {
		outFile.println(objListHouse.getLotNumber());
		outFile.println(objListHouse.getFirstName());
		outFile.println(objListHouse.getLastName());
		outFile.println(objListHouse.getPrice());
		outFile.println(objListHouse.getSquareFeet());
		outFile.println(objListHouse.getBedRooms());
	}
	
	//method to close House File
	public static void close() throws IOException {
		if(inFileOpen){
			inFile.close();
		}
		
		if(outFileOpen){
			outFile.close();
		}
		
		inFileOpen=false;
		outFileOpen=false;
	}
}
