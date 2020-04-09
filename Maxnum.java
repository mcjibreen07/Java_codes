/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devs_Account
 */
public class Maxnum {

   //creating an arrays of int and finding the MAX value 
    public static void main(String[] args) {
     int a[] = {23,34,22,4,36656,1,32,4,245,3252};
    int max = a[0];
     for (int i = 0 ; i<a.length; i++){
          if(a[i]>max){
          max = a[i];
          }
     }
     System.out.println(max  +"  Is the max number in an array list given");
    }
    
}
