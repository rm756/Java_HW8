//Rachel Merendino section 12, HW 8, Problem 2

import java.util.*;
public class MonetaryCoinDriver {   
   public static void main(String [] args){
   Random rand = new Random();
    MonetaryCoin[] coins = new MonetaryCoin[25];
    int i;
    for (i=0; i<coins.length; i++){
      coins[i]=new MonetaryCoin();
      int rand1 = rand.nextInt(4);
      if (rand1==0) {
            //penny
          coins[i].setValue(1);
         }
      else if (rand1==1){ 
          //nickel
          coins[i].setValue(5);
        }
      else if (rand1==2){
            //dime
          coins[i].setValue(10);
        }
      else{
            //quarter
          coins[i].setValue(25);
      }

    }
    int count=0;
    int total=0;
    for(i=0; i<coins.length; i++){
      coins[i].flip();
      
      if (coins[i].isHeads()){
         count++;
      }
      else{
         total += coins[i].getValue();
      }
      
      
    }
    
    for(i=0; i<coins.length;i++){
    System.out.println(coins[i] + " " + coins[i].getValue() + " ");
    }
    System.out.println("The total monetary value of the tails coins is: " + total);
       
   
   } 
} 