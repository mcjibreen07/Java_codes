 
package selectimplementation;

import java.util.Scanner;

/**
 *
 * @author Devs_Account
 */
public class SelectImplementation {

    //Implementing Selection in java
    //  1 Using select case
    //  2 Using nestest if
    public static void main(String[] args) {
        //let us look for string using scanner class 
        Scanner sn = new Scanner(System.in);
        p("Enter somethig");
        String k = sn.next();
        
        //using method  1
        /*
        switch (k){
            case "name":
                p("My name");
                break;
            case "okay":
                p("You type okay");
                break;
            case "Proo":
                p("programmer");
                break;
            default:
                p("No matchning selection found");
                
    
    */
        
        //using method 2
        
        if(k .equals("jv")){
        p("You type jb");
        }else if(k .equals("nk")){
        p("You type jk");
        
        }else{
        p("No data found ");
        }
         
    }  // this is printing method which take an object as an argument an print 
    //its contents 
    static void p(Object p){
    System.out.println(p);
    
    }
}
