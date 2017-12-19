import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class MenuPanel extends JPanel {

	/**
	 * Create the panel.
	 */

	public MenuPanel() {
		setLayout(null);
		
		ImageIcon logoImage =new ImageIcon(getClass().getResource("logo.png"));
		JLabel logoLabel=new JLabel(new ImageIcon(MenuPanel.class.getResource("logo.png")));
		logoLabel.setLocation(0, 0);
		logoLabel.setSize(890, 170);
		add(logoLabel);
		
		JButton appButton = new JButton("Appetizers");
		formatButton(appButton);
		appButton.setBounds(5, 172, 175, 41);
		add(appButton);
		appButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				PizzaStoreGUI.contentPane.add(PizzaStoreGUI.appsPanel);
				PizzaStoreGUI.contentPane.remove(PizzaStoreGUI.sidesPanel);
				PizzaStoreGUI.contentPane.remove(PizzaStoreGUI.pizzaPanel);
				PizzaStoreGUI.contentPane.remove(PizzaStoreGUI.dessertPanel);
				PizzaStoreGUI.contentPane.remove(PizzaStoreGUI.drinksPanel);
			}
		});
		

		JButton sidesButton = new JButton("Soups and Salads");
		formatButton(sidesButton);
		sidesButton.setBounds(180, 172, 175, 41);
		add(sidesButton);
		sidesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				PizzaStoreGUI.contentPane.add(PizzaStoreGUI.sidesPanel);
				PizzaStoreGUI.contentPane.remove(PizzaStoreGUI.appsPanel);
				PizzaStoreGUI.contentPane.remove(PizzaStoreGUI.pizzaPanel);
				PizzaStoreGUI.contentPane.remove(PizzaStoreGUI.dessertPanel);
				PizzaStoreGUI.contentPane.remove(PizzaStoreGUI.drinksPanel);
			}
		});		
		
		JButton pizzaButton = new JButton("Pizza");
		formatButton(pizzaButton);
		pizzaButton.setBounds(355, 172, 175, 41);
		
		add(pizzaButton);
		pizzaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				PizzaStoreGUI.contentPane.add(PizzaStoreGUI.pizzaPanel);
				PizzaStoreGUI.contentPane.remove(PizzaStoreGUI.appsPanel);
				PizzaStoreGUI.contentPane.remove(PizzaStoreGUI.sidesPanel);
				PizzaStoreGUI.contentPane.remove(PizzaStoreGUI.dessertPanel);
				PizzaStoreGUI.contentPane.remove(PizzaStoreGUI.drinksPanel);
			}
		});
		
		JButton dessertButton = new JButton("Desserts");
		formatButton(dessertButton);
		dessertButton.setBounds(530, 172, 175, 41);
		add(dessertButton);
		dessertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				PizzaStoreGUI.contentPane.add(PizzaStoreGUI.dessertPanel);
				PizzaStoreGUI.contentPane.remove(PizzaStoreGUI.appsPanel);
				PizzaStoreGUI.contentPane.remove(PizzaStoreGUI.sidesPanel);
				PizzaStoreGUI.contentPane.remove(PizzaStoreGUI.pizzaPanel);
				PizzaStoreGUI.contentPane.remove(PizzaStoreGUI.drinksPanel);
			}
		});
		
		JButton drinkButton = new JButton("Drinks");
		formatButton(drinkButton);
		drinkButton.setBounds(705, 172, 175, 41);
		add(drinkButton);
		drinkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				PizzaStoreGUI.contentPane.add(PizzaStoreGUI.drinksPanel);
				PizzaStoreGUI.contentPane.remove(PizzaStoreGUI.appsPanel);
				PizzaStoreGUI.contentPane.remove(PizzaStoreGUI.sidesPanel);
				PizzaStoreGUI.contentPane.remove(PizzaStoreGUI.pizzaPanel);
				PizzaStoreGUI.contentPane.remove(PizzaStoreGUI.dessertPanel);
				

			}
		});
		

	}
	public void formatButton(JButton button)
	{
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(0, 0, 255));
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setVerticalAlignment(SwingConstants.CENTER);
	}
}
