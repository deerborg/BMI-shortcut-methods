
package BasicMethodForBodyİndex;

import java.util.Scanner;

/**
 *
 * @author Furkan Aydemir, deerborg
 * @since 2024
 */

/*
    We saved time by defining the formulas within the method 
    without having to write them under any circumstances.

    **Review line 22**
*/

public class Main {
    // Reference formula kg/m2.
    public static double bodyIndex(double weight, double length){
        return weight / (length * length);
    }

    public static void main(String[] args) {
        // Weight and height values ​​received from the user.
        Scanner userWeight = new Scanner(System.in);
        System.out.println("Enter your weight in kilogram (Kg): ");
        double userWeightValue = userWeight.nextDouble();
        Scanner userLenght = new Scanner(System.in);
        System.out.println("Enter your height in meters (m): ");
        double userLenghtValue = userLenght.nextDouble();
        
        if(bodyIndex(userWeightValue, userLenghtValue) < 18.5){
            System.out.println("Underwight! your index " + bodyIndex(userWeightValue, userLenghtValue));
        }
        else if(bodyIndex(userWeightValue, userLenghtValue) >= 18.5 && bodyIndex(userWeightValue, userLenghtValue) < 24.9){
            System.out.println("Normal your index " + bodyIndex(userWeightValue, userLenghtValue));
        }
        else if(bodyIndex(userWeightValue, userLenghtValue) > 30){
            System.out.println("Obese, your index " + bodyIndex(userWeightValue, userLenghtValue));
        }
    }
    
}
