 /*
        -For Loop   Syntax 
        for(Initialialization ; Condition ; Incre/Decre){
        Code to execute
        }
        
        -While loop   Syntax
        while(Condition){
        Code to execute
        }
        
        -do while loop
        do{
        Code to execute     -----This type of loop run at lest once 
        }while(Condition)
        */
        
/**
 *
 * @author Devs_Account
 */
public class Loop_control {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Printing   1 to 15 with Different type of loop
           //for loop 
        System.out.println( "for loop");
         for (int i = 1; i<=15; i++){
          System.out.print(i+",");
        }
        //while loop
         int k = 1;
         System.out.println();
         System.out.println( "while loop");
         while(k<15){
          System.out.print(k+",");
         k++;
         }
        //do while 
         int r = 1;
         System.out.println();
         System.out.println( "do loop");
         do{
         System.out.print(r+",");
         
         r++;
         }while(r<=15);
         //lets run all at once 
         
    }
    
}
