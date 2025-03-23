import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\nScientific Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Sine");
            System.out.println("8. Cosine");
            System.out.println("9. Tangent");
            System.out.println("10. Exit");
            System.out.print("Choose an option: ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // Addition
                    System.out.print("Enter two numbers: ");
                    double add1 = scanner.nextDouble();
                    double add2 = scanner.nextDouble();
                    System.out.println("Result: " + (add1 + add2));
                    break;

                case 2: // Subtraction
                    System.out.print("Enter two numbers: ");
                    double sub1 = scanner.nextDouble();
                    double sub2 = scanner.nextDouble();
                    System.out.println("Result: " + (sub1 - sub2));
                    break;

                case 3: // Multiplication
                    System.out.print("Enter two numbers: ");
                    double mul1 = scanner.nextDouble();
                    double mul2 = scanner.nextDouble();
                    System.out.println("Result: " + (mul1 * mul2));
                    break;

                case 4: // Division
                    System.out.print("Enter two numbers: ");
                    double div1 = scanner.nextDouble();
                    double div2 = scanner.nextDouble();
                    if (div2 != 0)
                        System.out.println("Result: " + (div1 / div2));
                    else
                        System.out.println("Error: Cannot divide by zero.");
                    break;

                case 5: // Square Root
                    System.out.print("Enter a number: ");
                    double num = scanner.nextDouble();
                    if (num >= 0)
                        System.out.println("Result: " + Math.sqrt(num));
                    else
                        System.out.println("Error: Cannot find square root of a negative number.");
                    break;

                case 6: // Power
                    System.out.print("Enter base and exponent: ");
                    double base = scanner.nextDouble();
                    double exponent = scanner.nextDouble();
                    System.out.println("Result: " + Math.pow(base, exponent));
                    break;

                case 7: // Sine
                    System.out.print("Enter angle in degrees: ");
                    double angleSin = scanner.nextDouble();
                    System.out.println("Result: " + Math.sin(Math.toRadians(angleSin)));
                    break;

                case 8: // Cosine
                    System.out.print("Enter angle in degrees: ");
                    double angleCos = scanner.nextDouble();
                    System.out.println("Result: " + Math.cos(Math.toRadians(angleCos)));
                    break;

                case 9: // Tangent
                    System.out.print("Enter angle in degrees: ");
                    double angleTan = scanner.nextDouble();
                    System.out.println("Result: " + Math.tan(Math.toRadians(angleTan)));
                    break;

                case 10: // Exit
                    System.out.println("Exiting calculator...");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 10);

        scanner.close();
    }
}

