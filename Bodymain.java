 
package org.jb;

/**
 *
 * @author Devs_Account
 */
public class Bodymain {

    /**
     * @param args the command line arguments
     */
    
    //  DECISION MAKING
    /*
    Grants Access to all girls whose age is grether than 18
    and has an amount greaterthan or equals $20 
    //use arrays to store their names ,ages and money
    */
    public static void main(String[] args) {
        int age [] = {21,33,4,55,2,33,33,56};
        Double amount [] = {22.5,11.4,22.3,55.3,00.0,21.3,11.2,34.1};
        String girlsname [] = {"fatee","sarah","ummi","toly","rufus","binta","asiya","mommey",};
           
        for(int i = 0 ; i<= girlsname.length-1; i++){
         for(int j = 0 ; j<= amount.length-1; j++){
           for(int k = 0 ; k<= age.length-1; k++){
   
     //all the output have met the need  thats >=19$ and>= 18
               //thaanks
               
      
           }  
 }
         
         if(age[i]>=18 && amount[i]>=19){
      System.out.print(girlsname[i].toString()+" ");
      System.out.print(amount[i]+"$ "); 
      System.out.println(age[i]+" Old");
         
         }
}}}