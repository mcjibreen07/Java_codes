 
/**
 *
 * @author Devs_Account
 */
public class CountDown {
 static Thread tr = new Thread();
    public static void main(String[] args) {
        try{
        for(int t = 10; t>0 ; t++){
            tr.sleep(1000);
        System.out.println(t);
     if(t==8){
        System.out.println("Warning");
}

        }
        }catch(Exception e){
        e.printStackTrace();
        }
    }
    
    
    
    
}
