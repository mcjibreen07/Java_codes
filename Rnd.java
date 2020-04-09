
import java.util.Random;


/**
 *
 * @author Devs_Account
 */
public class Rnd {

    /**
     * @param args the command line arguments
     */
    
    //We are to generate Random array of size 10 and print them
    public static void main(String[] args) {
        //calling them in a main method 
        int size = 10;
        int  t[] =randomarr(size);
        printq(t);
    }
    
    // method of random arr 
    static int [] randomarr(int size){
    Random rnd = new Random();
    int[] k = new int[size];
            for(int i = 0 ; i<k.length-1; i++){
              k[i] = rnd.nextInt(20);
            }
        return k;
    
    }
    
    
    //array printing method 
    
   static void printq(int [] a){
   for(int i = 0 ; i<a.length; i++){
       System.out.print(a[i]+",");
   }//it keep changing the more we keep running it 
   }
}
