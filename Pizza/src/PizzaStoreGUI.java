import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PizzaStoreGUI extends JFrame {

	protected static JPanel contentPane;
	private CheckoutPanel checkoutPanel;
	protected static MenuPanel menuPanel;
	protected static MenuSectionPanel dessertPanel;
	protected static MenuSectionPanel pizzaPanel;
	protected static MenuSectionPanel sidesPanel;
	protected static MenuSectionPanel appsPanel;
	protected static MenuSectionPanel drinksPanel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PizzaStoreGUI frame = new PizzaStoreGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PizzaStoreGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1170, 770);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		//create panels
		buildCheckoutPanel();
		buildMenuPanel();
		buildPizzaPanel();
		buildDessertPanel();
		buildSidesPanel();
		buildAppsPanel();
		buildDrinksPanel();
		contentPane.setLayout(null);
		
		//add panels
		getContentPane().add(menuPanel);
		getContentPane().add(checkoutPanel);
		contentPane.add(pizzaPanel);
		
		
	}
	
	//panel build methods
	
	public void buildCheckoutPanel() {
		checkoutPanel= new CheckoutPanel();
		checkoutPanel.setBounds(872, 11, 284, 713);
		
	}
	
	public void buildMenuPanel() {
		menuPanel= new MenuPanel();
		menuPanel.setBounds(5, 5, 880, 219);
	}
	
	public void buildPizzaPanel() {
		String icheese="cheese.png";
		String cheese="Cheese Pizza";
		String ipepperoni="pepperoni.png";
		String pepperoni="Pepperoni Pizza";
		String imeatlover="meatlover.png";
		String meatlover="Meatlover's";
		String ichicken="chicken.png";
		String chicken="BBQ Chicken Pizza";
		String isupreme="supreme.png";
		String supreme="Supreme Pizza";
		String iveggie="veggie.png";
		String veggie="Veggie Pizza";
		pizzaPanel= new MenuSectionPanel(icheese, cheese, ipepperoni, pepperoni, imeatlover, 
				meatlover, ichicken, chicken, iveggie, veggie, isupreme, supreme);
		pizzaPanel.setBounds(37, 225, 821, 508);
		
	}
	
	public void buildDessertPanel() {
		String ipie="applepie.png";
		String pie="Apple Pie";
		String ibrownie="brownie.png";
		String brownie="Brownie";
		String icinnamon="cinnamonstick.png";
		String cinnamon="Cin. Sticks";
		String icupcake="cupcake.png";
		String cupcake="Cupcake";
		String iicecream="icecream.png";
		String icecream="Ice Cream";
		String icookie="cookie.png";
		String cookie="Ch.Chip Cookie";
		dessertPanel= new MenuSectionPanel(ipie, pie, ibrownie, brownie, icinnamon, cinnamon, 
				icupcake, cupcake, iicecream, icecream, icookie, cookie);
		dessertPanel.setBounds(37, 225, 821, 508);
		
	}
	
	public void buildSidesPanel() {
		String icaesar="caesarsalad.png";
		String caesar="Caesar Salad";
		String isouthwest="southwestsalad.png";
		String southwest="Southwest Salad";
		String ichop="chopsalad.png";
		String chop="Chop Salad";
		String icheesesoup="cheesesoup.png";
		String cheesesoup="Broccoli Cheddar Soup";
		String itomatosoup="tomatosoup.png";
		String tomatosoup="Tomato Soup";
		String itortillasoup="tortillasoup.png";
		String tortillasoup="Tortilla Soup";
		sidesPanel= new MenuSectionPanel(icaesar, caesar, ichop, chop, isouthwest, southwest, 
				itomatosoup, tomatosoup, icheesesoup, cheesesoup, itortillasoup, tortillasoup);
		sidesPanel.setBounds(37, 225, 821, 508);
		
	}
	
	public void buildAppsPanel() {
		String iboneless="bonelesswings.png";
		String boneless="Boneless Wings";
		String iwings="wings.png";
		String wings="Hot Wings";
		String ifries="fries.png";
		String fries="French Fries";
		String igarlicknots="garlicknots.png";
		String garlicknots="Garlic Knots";
		String ibreadsticks="breadsticks.png";
		String breadsticks="Breadsticks";
		String icheesesticks="cheesesticks.png";
		String cheesesticks="Cheesesticks";
		appsPanel= new MenuSectionPanel(ibreadsticks, breadsticks, icheesesticks, cheesesticks, 
				igarlicknots, garlicknots, iwings, wings, iboneless, boneless, ifries, fries);
		appsPanel.setBounds(37, 225, 821, 508);
		
	}
	
	public void buildDrinksPanel() {
		String ispriteoz="spriteoz.png";
		String spriteoz="Sprite - 20oz";
		String ispriteliter="spriteliter.png";
		String spriteliter="Sprite - 2L";
		String icokeoz="cokeoz.png";
		String cokeoz="Cola - 20oz";
		String icokeliter="cokeliter.png";
		String cokeliter="Cola - 2L";
		String imdoz="mdoz.png";
		String mdoz="Mtn Dew - 20oz";
		String imdliter="mdliter.png";
		String mdliter="Mtn Dew - 2L";
		drinksPanel= new MenuSectionPanel(ispriteliter, spriteliter, icokeliter, 
				cokeliter, imdliter, mdliter, ispriteoz, spriteoz, icokeoz, cokeoz, imdoz, mdoz);
		drinksPanel.setBounds(37, 225, 821, 508);
		
	}
	
}
