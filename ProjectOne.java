/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author Vatsal
 */
public class ProjectOne {
    public static void main (String [] args){
        
        System.out.println("Please enter a String");
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        
        NametoAscii(a);
    }

    public static void NametoAscii(String name){
        int value = 0;
        
        for(int i = 0; i<name.length(); i++){
            System.out.println("Ascii Value of "+name.charAt(i)+" is " +(int)name.charAt(i));
           
            value += (int)name.charAt(i);
            
        }
         System.out.println("The total Ascii Value of String is: "+value);
         
         
         int answer = ProjectOne.ShrinkNumber(value);

         while(CountDigit(answer)>1)
         {
            System.out.println("Vale of asnwer is "+answer);
            answer = ProjectOne.ShrinkNumber(answer);
         }
         
         
           
        System.out.println(">>>" + answer);
         
        return; 
        
       
      
        
    }
    public static int CountDigit(int answer){

        String str = Integer.toString(answer);
        return str.length();
    }
   
    static int ShrinkNumber(int input)
    {
        System.out.println("called...");
        int sum =0;
        int m =input;
            while(m>0){
                int n = m % 10;
                sum = sum + n;
                m = m/10;
            }
            return sum;
    }
}
