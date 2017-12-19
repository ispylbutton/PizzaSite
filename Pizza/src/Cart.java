import java.util.*;


public class Cart {

   public Cart(){
      items = new ArrayList<Food>();
   }

   public void addToCart(Food item){
      items.add(item);
   }

   public void removeFromCart(Food itemName){
      iter = items.iterator();
      while (iter.hasNext()){
    	  Food item = iter.next();
    	  if(item.getName().equals(itemName.getName())){
    		  iter.remove();
    	  }
      }
   }
   
   public void clearCart() {
	   iter = items.iterator();
	   while (iter.hasNext()){
		   Food item = iter.next();
	       iter.remove();
	   }
   }
	   

   public String format(CartFormatter formatter){
      String r = formatter.formatHeader();
      iter = items.iterator();
      while (iter.hasNext())
         r += formatter.formatFood(iter.next());
      return r + formatter.formatFooter();
   }

   private ArrayList<Food> items;
   private Iterator<Food> iter;
}
