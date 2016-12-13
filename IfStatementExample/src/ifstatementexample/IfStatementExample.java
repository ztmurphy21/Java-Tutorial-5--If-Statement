
package ifstatementexample;

//import for scanner object use for user input
import java.util.Scanner;

/**
 *
 * @author Zach Murphy
 */
public class IfStatementExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner object
        Scanner input = new Scanner(System.in);
        
        //getting first score from user
        System.out.println("Please enter the first score.");
        double scoreOne = input.nextDouble();
        
        //get second score from user
        System.out.println("Please enter the second score.");
        double scoreTwo= input.nextDouble();
        
        //get third score from user
        System.out.println("Please enter the second score.");
        double scoreThree = input.nextDouble();
        
        //calc average
        double avg = (scoreOne + scoreTwo + scoreThree) / 3;
        
        //test average
        //System.out.println(avg);
        
        //if statement for if user passed :)
        if(avg>=70){
            System.out.println("You score a " + avg + " %, you passed.");
        }else{ //if user did not pass :(
            System.out.println("Sorry your score is a " + avg + " %, you failed. Please try again.");
        }
    }
    
}
