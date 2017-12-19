import java.awt.Font;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

import java.awt.Dimension;

public class CheckoutPanel extends JPanel {

	//print cart object to checkout panel
	/**
	 * Create the panel.
	 */
	protected static Cart myCart = new Cart();
	protected static JTextArea checkout = new JTextArea();
	public CheckoutPanel() {
		Panel panel = new Panel();
		panel.setBounds(731, 0, 274, 700);
		this.add(panel);
		panel.setLayout(null);
		
		JLabel lblCheckout = new JLabel("Checkout");
		lblCheckout.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCheckout.setBounds(114, 5, 69, 23);
		panel.add(lblCheckout);
		
		
		checkout.setMinimumSize(new Dimension(254, 22));
		checkout.setMaximumSize(new Dimension(254, 2147483647));
		checkout.setEditable(false);
		checkout.setBounds(10, 34, 254, 500);

		panel.add(checkout);
		
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setForeground(new Color(255, 255, 255));
		cancelButton.setBackground(new Color(255, 0, 0));
		cancelButton.setBounds(30, 600, 89, 23);
		panel.add(cancelButton);
		cancelButton.addActionListener(new ActionListener() {
	           public void actionPerformed(ActionEvent event) {
		           cancelOrder();
	          }
	       });
		
		JButton submitButton = new JButton("Submit");
		submitButton.setForeground(new Color(255, 255, 255));
		submitButton.setBackground(new Color(0, 128, 0));
		submitButton.setBounds(164, 600, 89, 23);
		panel.add(submitButton);
		submitButton.addActionListener(new ActionListener() {
	           public void actionPerformed(ActionEvent event) {
	        	   submitOrder();
		       }
	       });
	}

	public void cancelOrder()
	{
		CheckoutPanel.myCart.clearCart();
		checkout.setText(CheckoutPanel.myCart.format(new SimpleFormatter()));
	}
	public void submitOrder()
	{
		String CART = checkout.getText();
	    String customerInfo = "";
        JTextField Name = new JTextField();
        JTextField Address = new JTextField();
        JTextField CardNum = new JTextField();
        JPanel panel = new JPanel(new GridLayout(0, 1));
 
        panel.add(new JLabel("Name:"));
        panel.add(Name);
        panel.add(new JLabel("Address:"));
        panel.add(Address);
        panel.add(new JLabel("Credit Card #:"));
        panel.add(CardNum);
        
        int result = JOptionPane.showConfirmDialog(null, panel, "Test",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        
        if (result == JOptionPane.OK_OPTION) {
        	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        	Date date = new Date();
            customerInfo = dateFormat.format(date) +'\n' +
            			   Name.getText() + '\n' +
            		   	   Address.getText() + '\n' +
            		   	   CardNum.getText() + '\n' +
            		   	   CART + "\n\n\n\n\n";
           // out.close();
        } else {
        	System.out.println("Cancelled");
        }
        
        File log = new File("log.txt");
	    try{
	    if(log.exists()==false){
	            System.out.println("We had to make a new file.");
	            log.createNewFile();
	    }
	    PrintWriter out = new PrintWriter(new FileWriter(log, true));
	    out.append(customerInfo + "\n");
	    out.close();
	    }catch(IOException e){
	        System.out.println("COULD NOT LOG!!");
	    }
	    
	    cancelOrder();
	    
	    JOptionPane.showMessageDialog(null, "Your order has been logged.");
	    
	}
	public void deleteItem()
	{
		
	}
}
