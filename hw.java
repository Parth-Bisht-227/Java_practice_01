import java.util.*;
import java.lang.Math;
public class hwbit {
    public static void main(String args[]){



    //Q1
         Scanner sc = new Scanner(System.in);
         System.out.println("enter no. , prog tells if no. is power of 2 or not ...");
         int n = sc.nextInt();
         if( isPowerOfTwo(n)){
             System.out.println("Yes ");

         }
         else{
             System.out.println("Not power of 2");
         }
         sc.close();


     }

     public static boolean isPowerOfTwo(int n){
         return  (int)(Math.ceil((Math.log(n))/ Math.log(2))) == (int)(Math.floor(((Math.log(n)/ Math.log(2)))));


     }
