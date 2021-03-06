/*
||*****************************************************************************||
||                                                                             ||
||                   NIT2112 Object Oriented Programming                       ||
||                William Oung(s4578850) & Minh Mai(s4554511)                  ||
||                           Unique Six Assignment                             ||
||                                11-May-2018                                  ||
||                                                                             ||
||            This Die class creates a dice for UniqueSix game.                ||
||                                                                             ||
||*****************************************************************************||
*/


import java.util.Random;

public class Die {
   private static final int MAX = 6;
   private static final int MIN = 1;

   //default constructor
   public Die() {};

  //to randomize the number from 1 to 6
   public static int possibleResult() {
      Random random = new Random();
      return random.nextInt(MAX) + MIN;
      
   }//end main
}//end class