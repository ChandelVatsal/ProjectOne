import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;  
import java.io.FileNotFoundException;


public class Game {
    public static void main (String [] args) throws FileNotFoundException {


        System.out.println("Hello there! Welcome to the menu game");
        System.out.println("Please enter the number which corelates to the list below");
        System.out.println("Type 1 to get a random quote");
        System.out.println("Type 2 to play the Random Number Game");
        System.out.println("Type 3 to get the Calculator");

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.close();

        if(a ==1){
            System.out.println("You have chose option number 1");
                Quote();
        }
        if(a ==2){
            System.out.println("You have chose option number 2"); 
                Rando();
        }
        if(a ==3){
            System.out.println("You have chose option number 3");
                Calc();
        }
    }

    public static void Quote() throws FileNotFoundException {

        ArrayList<String> QuoteLibrary = new ArrayList<String>();
        QuoteLibrary = loadQuoteLibraryFromFile("D:\\_Src\\ProjectOne\\Quote.txt");
        int QuoteIndex = (int) (Math.random() * QuoteLibrary.size());
        String Quote = QuoteLibrary.get(QuoteIndex);
        System.out.println(Quote);

       }
       private static ArrayList<String> loadQuoteLibraryFromFile(String fileName) {
       
        ArrayList<String> QuoteLibrary = new ArrayList<String>();
        try
        {
        Scanner input = new Scanner(new File(fileName));
        while (input.hasNext()) {
            QuoteLibrary.add(input.next().toLowerCase());
            }
        }
        catch (Exception e)
        {
            System.out.println("Game did not load poperly");
        }
        return QuoteLibrary;
    }
       
    public static void Rando(){
        System.out.println("Hello 2");

    }
    public static void Calc(){
        System.out.println("Hello 3");

    }
   
    
}