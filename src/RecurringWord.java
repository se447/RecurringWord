
import java.util.ArrayList;
import java.util.Scanner;

/*
Create a program that asks the user to input words until the user gives the same word twice. 
Use an ArrayList structure in your program. 
*/

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();
        
        String input = "adfrrwefjsjalfja"; //placeholder value
        
        while (true) {
            System.out.println("Type a word: ");
            input = reader.nextLine();
            
            if (words.contains(input)) {
                break;
            }
            else {
                words.add(input);
            }
        }
        
        System.out.println("You gave the word " + input + " twice");
    }
}
