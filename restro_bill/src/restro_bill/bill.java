package restro_bill;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class bill {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bill window = new bill();
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
	public bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 128, 64));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Restro Bill");
		lblNewLabel.setForeground(new Color(128, 255, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 28));
		lblNewLabel.setBounds(171, 23, 138, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Menu");
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(28, 104, 92, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Qnty");
		lblNewLabel_2.setForeground(new Color(255, 255, 0));
		lblNewLabel_2.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(28, 196, 92, 31);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"select", "Chicken biryani-Rs.180", "Mutton biryani-Rs.200", "Paneer biryani-Rs.160"}));
		c1.setBounds(171, 89, 175, 40);
		frame.getContentPane().add(c1);
		
		JButton btnNewButton = new JButton("Order");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item=(String) c1.getSelectedItem();
				String qnty=t1.getText();
				int q=Integer.parseInt(qnty);
				int bill=0;
				if(item.equals("Chicken biryani-Rs.180"))
				{
					bill=q*180;
					JOptionPane.showMessageDialog(btnNewButton, "hello \n Selected item:"+item+"\n Qnty:"+q+" \n your bill:"+bill);
				}
				else if(item.equals("Mutton biryani-Rs.200"))
				{
					bill=q*200;
					JOptionPane.showMessageDialog(btnNewButton, "hello \n Selected item:"+item+"\n Qnty:"+q+" \n your bill:"+bill);
				}
				else if(item.equals("Paneer biryani-Rs160"))
				{
					bill=q*160;
					JOptionPane.showMessageDialog(btnNewButton, "hello \n Selected item:"+item+"\n Qnty:"+q+" \n your bill:"+bill);
				}
				}
		});
		btnNewButton.setBounds(107, 290, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		t1 = new JTextField();
		t1.setBounds(148, 200, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		frame.setBounds(100, 100, 498, 459);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
