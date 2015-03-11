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
	private JTextField txtLotNumber;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtPrice;
	private JTextField txtSquareFt;
	private JTextField txtNoOfBedRooms;

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
			}
		});
		btnReset.setBounds(25, 274, 180, 47);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(25, 322, 180, 49);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(25, 372, 180, 47);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNext.setBounds(215, 274, 180, 47);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(215, 323, 180, 47);
		
		JButton btnFind = new JButton("Find");
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
	}
}
