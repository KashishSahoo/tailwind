import java.util.Arrays;
import java.util.Scanner;

public class difference {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        String number = scanner.next();  // Read the input as a String

        // Convert the string into a character array of digits
        char[] digits = number.toCharArray();

        // Sort digits in ascending order to get the smallest number
        Arrays.sort(digits);
        String smallestString = new String(digits);
        int smallest = Integer.parseInt(smallestString);  // Convert to integer

        // Manually form the largest number by reversing the sorted array
        // Convert the sorted digits to the largest number in reverse order
        char[] largestDigits = new char[digits.length];
        for (int i = 0; i < digits.length; i++) {
            largestDigits[i] = digits[digits.length - 1 - i];  // Reverse the array
        }
        String largestString = new String(largestDigits);
        int largest = Integer.parseInt(largestString);  // Convert to integer

        // Calculate the difference
        int difference = largest - smallest;

        // Display the result
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
        System.out.println("Difference: " + difference);

        // Close the scanner
        scanner.close();
    }
}
