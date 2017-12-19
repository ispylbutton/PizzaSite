
public class SimpleFormatter implements CartFormatter{
   public String formatHeader(){
      return "     I N V O I C E\n\n\n";
   }

   public String formatFood(Food item){
      total += item.getCost();
      return item.toString();
   }

   public String formatFooter(){
      return (String.format("\n\nTAX: $%.2f\n"
      		+ "\n\nTOTAL DUE: $%.2f\n", total*0.04225, total*1.04225));
   }

   private double total = 0;
}
