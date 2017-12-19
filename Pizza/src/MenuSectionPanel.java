import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JSpinner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.SpinnerNumberModel;


public class MenuSectionPanel extends JPanel {

	/**
	 * Create the panel.
	 */

	String check="\u2713";

	public MenuSectionPanel(String imageA, String productA, String imageB, String productB, 
							String imageC, String productC, String imageD, String productD, 
							String imageE, String productE, String imageF, String productF) 
	{
		
		this.imageA = imageA;
		this.imageB = imageB;
		this.imageC = imageC;
		this.imageD = imageD;
		this.imageE = imageE;
		this.imageF = imageF;
		this.productA = productA;
		this.productB = productB;
		this.productC = productC;
		this.productD = productD;
		this.productE = productE;
		this.productF = productF;
		
		
		Panel panel = new Panel();
		panel.setBounds(18, 10, 803, 509);
		this.add(panel);
		setLayout(null);
		panel.setLayout(null);
		
		JSpinner spinnerA = new JSpinner();
		spinnerA.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), new Integer(15), new Integer(1)));
		spinnerA.setBounds(220, 195, 30, 20);
		panel.add(spinnerA);
		
		JSpinner spinnerB = new JSpinner();
		spinnerB.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), new Integer(15), new Integer(1)));
		spinnerB.setBounds(490, 195, 30, 20);
		panel.add(spinnerB);
		
		
		JSpinner spinnerC = new JSpinner();
		spinnerC.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), new Integer(15), new Integer(1)));
		spinnerC.setBounds(760, 195, 30, 20);
		panel.add(spinnerC);
		
		
		JSpinner spinnerD = new JSpinner();
		spinnerD.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), new Integer(15), new Integer(1)));
		spinnerD.setBounds(220, 450, 30, 20);
		panel.add(spinnerD);
		
		
		JSpinner spinnerE = new JSpinner();
		spinnerE.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), new Integer(15), new Integer(1)));
		spinnerE.setBounds(490, 450, 30, 20);
		panel.add(spinnerE);
		
		
		JSpinner spinnerF = new JSpinner();
		spinnerF.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), new Integer(15), new Integer(1)));
		spinnerF.setBounds(760, 450, 30, 20);
		panel.add(spinnerF);
		
		
		
		JButton buttonA = new JButton(check);
		buttonA.setForeground(new Color(255, 255, 255));
		buttonA.setBackground(new Color(0, 128, 0));
		buttonA.setBounds(170, 195, 50, 20);
		panel.add(buttonA);
		buttonA.addActionListener(new ActionListener() {
	           public void actionPerformed(ActionEvent event) {
	        	   addProduct(buttonA, spinnerA, productA);
	          }
	       });
		
		
		JButton buttonB = new JButton(check);
		buttonB.setForeground(new Color(255, 255, 255));
		buttonB.setBackground(new Color(0, 128, 0));
		buttonB.setBounds(440, 195, 50, 20);
		panel.add(buttonB);
		buttonB.addActionListener(new ActionListener() {
	           public void actionPerformed(ActionEvent event) {
	        	   addProduct(buttonB, spinnerB, productB);
	          }
	       });
		
		JButton buttonC = new JButton(check);
		buttonC.setForeground(new Color(255, 255, 255));
		buttonC.setBackground(new Color(0, 128, 0));
		buttonC.setBounds(705, 195, 50, 20);
		panel.add(buttonC);
		buttonC.addActionListener(new ActionListener() {
	           public void actionPerformed(ActionEvent event) {
	        	   addProduct(buttonC, spinnerC, productC);
	          }
	       });

		
		JButton buttonD = new JButton(check);
		buttonD.setForeground(new Color(255, 255, 255));
		buttonD.setBackground(new Color(0, 128, 0));
		buttonD.setBounds(170, 450, 50, 20);
		panel.add(buttonD);
		buttonD.addActionListener(new ActionListener() {
	           public void actionPerformed(ActionEvent event) {
	        	   addProduct(buttonD, spinnerD, productD);
	          }
	       });

		
		JButton buttonE = new JButton(check);
		buttonE.setForeground(new Color(255, 255, 255));
		buttonE.setBackground(new Color(0, 128, 0));
		buttonE.setBounds(440, 450, 50, 20);
		panel.add(buttonE);
		buttonE.addActionListener(new ActionListener() {
	           public void actionPerformed(ActionEvent event) {
	        	   addProduct(buttonE, spinnerE, productE);
	          }
	       });
		
		JButton buttonF = new JButton(check);
		buttonF.setForeground(new Color(255, 255, 255));
		buttonF.setBackground(new Color(0, 128, 0));
		buttonF.setBounds(705, 450, 50, 20 );
		panel.add(buttonF);
		buttonF.addActionListener(new ActionListener() {
	           public void actionPerformed(ActionEvent event) {
	        	   addProduct(buttonF, spinnerF, productF);
	          }
	       });
		
		JLabel aLabel=new JLabel(new ImageIcon(MenuPanel.class.getResource(imageA)));
				aLabel.setLocation(0, 0);
				aLabel.setSize(262, 170);
				panel.add(aLabel);
		JLabel bLabel=new JLabel(new ImageIcon(MenuPanel.class.getResource(imageB)));
		
		bLabel.setLocation(272, 0);
		bLabel.setSize(262, 170);
		panel.add(bLabel);
		JLabel cLabel=new JLabel(new ImageIcon(MenuPanel.class.getResource(imageC)));
		
		cLabel.setLocation(537, 0);
		cLabel.setSize(262, 170);
		panel.add(cLabel);
		JLabel dLabel=new JLabel(new ImageIcon(MenuPanel.class.getResource(imageD)));
		
		dLabel.setLocation(0, 254);
		dLabel.setSize(262, 170);
		panel.add(dLabel);
		JLabel eLabel=new JLabel(new ImageIcon(MenuPanel.class.getResource(imageE)));
		
		eLabel.setLocation(272, 254);
		eLabel.setSize(262, 170);
		panel.add(eLabel);
		JLabel fLabel=new JLabel(new ImageIcon(MenuPanel.class.getResource(imageF)));
		
		fLabel.setLocation(537, 254);
		fLabel.setSize(262, 170);
		panel.add(fLabel);
		
		JLabel nameA = new JLabel(productA);
		formatLabel(nameA);
		nameA.setBounds(36, 186, 101, 34);
		panel.add(nameA);
		
		JLabel nameB = new JLabel(productB);
		formatLabel(nameB);
		nameB.setBounds(310, 186, 101, 34);
		panel.add(nameB);
		
		JLabel nameC = new JLabel(productC);
		formatLabel(nameC);
		nameC.setBounds(582, 186, 101, 34);
		panel.add(nameC);
		
		JLabel nameD = new JLabel(productD);
		formatLabel(nameD);
		nameD.setBounds(36, 441, 101, 34);
		panel.add(nameD);
		
		JLabel nameE = new JLabel(productE);
		formatLabel(nameE);
		nameE.setBounds(310, 441, 101, 34);
		panel.add(nameE);
		
		JLabel nameF = new JLabel(productF);
		formatLabel(nameF);
		nameF.setBounds(582, 441, 101, 34);
		panel.add(nameF);
	}
	

	public void addProduct(JButton button, JSpinner spinner, String name)
	{
		int value = (Integer) spinner.getValue();
		    for (int i = 0; i< value; i++){
		    CheckoutPanel.myCart.addToCart(FoodFactory.getItem(name)); 
	    }
	    CheckoutPanel.checkout.setText(CheckoutPanel.myCart.format(new SimpleFormatter()));
	         
	}
	public void formatLabel(JLabel label) {
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
	}
	
	
	private String imageA;
	private String productA;
	private String imageB;
	private String productB; 
	private String imageC; 
	private String productC; 
	private String imageD;
	private String productD; 
	private String imageE; 
	private String productE; 
	private String imageF; 
	private String productF;
}








