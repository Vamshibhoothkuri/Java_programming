package Patterns;
import java.util.Scanner;

public class InterestCalculator {
    public double calculateInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public double calculateInterest(double principal, double rate, double time, int compoundingFrequency) {
        return principal * Math.pow((1 + rate / (100 * compoundingFrequency)), compoundingFrequency * time) - principal;
    }

    public double calculateInterest(double principal, double time) {
        double seniorCitizenRate = 0.5;
        return (principal * seniorCitizenRate * time) / 100;
    }

    public static void main(String[] args) {
        InterestCalculator calculator = new InterestCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the type of interest to calculate:");
        System.out.println("1. Simple Interest");
        System.out.println("2. Compound Interest");
        System.out.println("3. Senior Citizen Interest");
        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        double principal, rate, time;
        switch (choice) {
            case 1:
                System.out.print("Enter Principal: ");
                principal = scanner.nextDouble();
                System.out.print("Enter Rate of Interest: ");
                rate = scanner.nextDouble();
                System.out.print("Enter Time (in years): ");
                time = scanner.nextDouble();
                double simpleInterest = calculator.calculateInterest(principal, rate, time);
                System.out.println("Simple Interest: " + simpleInterest);
                break;

            case 2:
                System.out.print("Enter Principal: ");
                principal = scanner.nextDouble();
                System.out.print("Enter Rate of Interest: ");
                rate = scanner.nextDouble();
                System.out.print("Enter Time (in years): ");
                time = scanner.nextDouble();
                System.out.print("Enter Compounding Frequency (e.g., 4 for quarterly): ");
                int compoundingFrequency = scanner.nextInt();
                double compoundInterest = calculator.calculateInterest(principal, rate, time, compoundingFrequency);
                System.out.println("Compound Interest: " + compoundInterest);
                break;

            case 3:
                System.out.print("Enter Principal: ");
                principal = scanner.nextDouble();
                System.out.print("Enter Time (in years): ");
                time = scanner.nextDouble();
                double seniorCitizenInterest = calculator.calculateInterest(principal, time);
                System.out.println("Senior Citizen Interest: " + seniorCitizenInterest);
                break;

            default:
                System.out.println("Invalid choice! Please select 1, 2, or 3.");
        }
        
        scanner.close();
    }
}
