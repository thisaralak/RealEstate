import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class RealEstate {

	private JFrame frame;
	private static JTextField txtLotNumber;
	private static JTextField txtFirstName;
	private static JTextField txtLastName;
	private static JTextField txtPrice;
	private static JTextField txtSquareFt;
	private static JTextField txtNoOfBedRooms;
	private static JLabel lblStatus; 
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RealEstate window = new RealEstate();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RealEstate() {
		initialize();
	}

	ListHouse house;
	private static SortedList list = new SortedList();
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 439, 484);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				list.reset();
				if (list.lengthIs() == 0)
				clearHouse();
				else
				{
				house = (ListHouse)list.getNextItem();
				showHouse(house);
				}
				lblStatus.setText("List reset"); 
			}
		});
		btnReset.setBounds(25, 274, 180, 47);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					house = getHouse();
					if (list.isThere(house))
						lblStatus.setText("Lot number already in use");
					else
					{
						list.insert(house);
						lblStatus.setText("House added to list");
					}
				}
				catch (NumberFormatException e)
				{				
					lblStatus.setText("Number? " + e.getMessage());
				} 
			}
		});
		btnAdd.setBounds(25, 322, 180, 49);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clearHouse();
				lblStatus.setText("Successfully cleared");
			}
		});
		btnClear.setBounds(25, 372, 180, 47);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (list.lengthIs() == 0)
					lblStatus.setText("list is empty!");
				else
				{
					house = (ListHouse)list.getNextItem();
					showHouse(house);
					lblStatus.setText("Next house displayed");
				}
			}
		});
		btnNext.setBounds(215, 274, 180, 47);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					house = getHouse();
					if (list.isThere(house))
					{
						list.delete(house);
						lblStatus.setText("House deleted");
					}
					else
						lblStatus.setText("Lot number not on list");
					}
				catch (NumberFormatException e)
				{				
					lblStatus.setText("Number? " + e.getMessage());
				} 
			}
		});
		btnDelete.setBounds(215, 323, 180, 47);
		
		JButton btnFind = new JButton("Find");
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int lotNumber;
				try
				{
					lotNumber = Integer.parseInt(txtLotNumber.getText());
					house = new ListHouse("", "", lotNumber, 0, 0, 0);
					if (list.isThere(house))
					{
						house = (ListHouse)list.retrieve(house);
						showHouse(house);
						lblStatus.setText("House available");
					}
					else
						lblStatus.setText("House not available");
				}
				catch (NumberFormatException e)
				{
					lblStatus.setText("Number? " + e.getMessage());
				}			
			}
		});
		
		btnFind.setBounds(215, 372, 180, 47);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnReset);
		frame.getContentPane().add(btnAdd);
		frame.getContentPane().add(btnClear);
		frame.getContentPane().add(btnNext);
		frame.getContentPane().add(btnDelete);
		frame.getContentPane().add(btnFind);
		
		txtLotNumber = new JTextField();
		txtLotNumber.setBounds(215, 27, 180, 39);
		frame.getContentPane().add(txtLotNumber);
		txtLotNumber.setColumns(10);
		
		txtFirstName = new JTextField();
		txtFirstName.setColumns(10);
		txtFirstName.setBounds(215, 69, 180, 39);
		frame.getContentPane().add(txtFirstName);
		
		txtLastName = new JTextField();
		txtLastName.setColumns(10);
		txtLastName.setBounds(215, 111, 180, 39);
		frame.getContentPane().add(txtLastName);
		
		txtPrice = new JTextField();
		txtPrice.setColumns(10);
		txtPrice.setBounds(215, 153, 180, 39);
		frame.getContentPane().add(txtPrice);
		
		txtSquareFt = new JTextField();
		txtSquareFt.setColumns(10);
		txtSquareFt.setBounds(215, 194, 180, 39);
		frame.getContentPane().add(txtSquareFt);
		
		txtNoOfBedRooms = new JTextField();
		txtNoOfBedRooms.setColumns(10);
		txtNoOfBedRooms.setBounds(215, 234, 180, 39);
		frame.getContentPane().add(txtNoOfBedRooms);
		
		JLabel lblLotNumber = new JLabel("Lot Number:");
		lblLotNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLotNumber.setBounds(9, 27, 200, 39);
		frame.getContentPane().add(lblLotNumber);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFirstName.setBounds(9, 69, 200, 39);
		frame.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName.setBounds(9, 111, 200, 39);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrice.setBounds(9, 153, 200, 39);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblSquareFeet = new JLabel("Square Feet:");
		lblSquareFeet.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSquareFeet.setBounds(9, 194, 200, 39);
		frame.getContentPane().add(lblSquareFeet);
		
		JLabel lblNumberOfBedrooms = new JLabel("Number Of Bedrooms:");
		lblNumberOfBedrooms.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumberOfBedrooms.setBounds(9, 234, 200, 39);
		frame.getContentPane().add(lblNumberOfBedrooms);
		
		JLabel lblStatus = new JLabel("StatusLabel");
		lblStatus.setBounds(9, 11, 46, 14);
		frame.getContentPane().add(lblStatus);		
	}
	
	private static void showHouse(ListHouse house)
	{
		txtLotNumber.setText(Integer.toString(house.getLotNumber()));
		txtFirstName.setText(house.getFirstName());
		txtLastName.setText(house.getLastName());
		txtPrice.setText(Integer.toString(house.getPrice()));
		txtSquareFt.setText(Integer.toString(house.getSquareFeet()));
		txtNoOfBedRooms.setText(Integer.toString(house.getBedRooms()));
	}
	
	private static ListHouse getHouse()
	{
		String lastName;
		String firstName;
		int lotNumber;
		int price;
		int squareFeet;
		int bedRooms;
		lotNumber = Integer.parseInt(txtLotNumber.getText());
		firstName = txtFirstName.getText();
		lastName = txtLastName.getText();
		price = Integer.parseInt(txtPrice.getText());
		squareFeet = Integer.parseInt(txtSquareFt.getText());
		bedRooms = Integer.parseInt(txtNoOfBedRooms.getText());
		ListHouse house = new ListHouse(lastName, firstName, lotNumber, price,
		squareFeet, bedRooms);
		return house;
	}
	
	private static void clearHouse()
	{
		txtLotNumber.setText("");
		txtFirstName.setText("");
		txtLastName.setText("");
		txtPrice.setText("");
		txtSquareFt.setText("");
		txtNoOfBedRooms.setText("");
	}
}
