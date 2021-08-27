//Rachel Merendino section 12, HW 8, Problem 1

public class MonetaryCoin extends Coin {    
   private int value;
   
   public MonetaryCoin(){
      this.value=value;
   }
   
   public void setValue(int value) {
      this.value=value;
   }

   public int getValue() {
      return this.value;
   }  
   
   public String toString()   { 
   return "The value of the coin is: " + value;     }   
   

} 