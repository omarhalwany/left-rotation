
package shift;

import java.util.Scanner;

public class Shift {

    public static void main(String[] args) {
        int y=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("HOW MANY NUMBERS YOU WANNA ADD");
        int length=sc.nextInt();
        int []array=new int [length];
           int []array2=new int [length];
           System.out.println("WHAT IS YOUR SHIFT");
          int shift =sc.nextInt();
        for (int x=0;x<length;x++){
        System.out.println("FILL THE ARRAY");
       array[x]=sc.nextInt();
        
       

        }
        
         for (int x=0;x<length;x++){
             
             if(x-shift<0){
 y=x-shift+length ;
             }else {
             
             y=x-shift;
             
             }
             
array2[x]=array[y];             
               }
        
          for (int x=0;x<length;x++){

       System.out.print(array2[x]);
        
               }
        
 
        
        
        
    }
    
}
