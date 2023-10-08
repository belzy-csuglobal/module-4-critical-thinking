import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int i = 0;
    float total = 0.0f;
    float average = 0.0f;
    float max = 0.0f;
    float min = 0.0f;
    float interest = 0.0f;
    final float INTEREST_RATE = 0.20f;

    // Prompt the user to input 5 floating point values.
    System.out.println("Enter five floating point values: ");

    // Iterate through the input values.
    while (i < 5) {
      // Get user input
      float input = (float)scanner.nextDouble();

      // Calculate values
      total += input;
      max = input > max ? input : max;
      min = input < min ? input : min;

      // Increment to prevent endless loop
      i++;
    } 

    // Calculate values.
    average = total / 5;
    interest = total * INTEREST_RATE;

    // Print the values to the screen.
    System.out.println("Total: " + total);
    System.out.println("Average: " + average);
    System.out.println("Maximum: " + max);
    System.out.println("Minimum: " + min);
    System.out.printf("Interest: %.2f", interest);
  }
}