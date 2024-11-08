package Patterns;
import java.util.Scanner;
public class shapesareas {
    

    // Method for area and perimeter of a square
    public static void square() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();

        double area = side * side;
        double perimeter = 4 * side;

        System.out.println("Square Area: " + area);
        System.out.println("Square Perimeter: " + perimeter);
    }

    // Method for area and perimeter of a rectangle
    public static void rectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Rectangle Area: " + area);
        System.out.println("Rectangle Perimeter: " + perimeter);
    }

    // Method for area and perimeter of a circle
    public static void circle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        System.out.println("Circle Area: " + area);
        System.out.println("Circle Perimeter: " + perimeter);
    }

    // Method for area and perimeter of a triangle
    public static void triangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        System.out.print("Enter the other two sides of the triangle (side1 and side2): ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();

        double area = 0.5 * base * height;
        double perimeter = base + side1 + side2;

        System.out.println("Triangle Area: " + area);
        System.out.println("Triangle Perimeter: " + perimeter);
    }

    // Method for area and perimeter of a parallelogram
    public static void parallelogram() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the parallelogram: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the parallelogram: ");
        double height = scanner.nextDouble();
        System.out.print("Enter the side length of the parallelogram: ");
        double side = scanner.nextDouble();

        double area = base * height;
        double perimeter = 2 * (base + side);

        System.out.println("Parallelogram Area: " + area);
        System.out.println("Parallelogram Perimeter: " + perimeter);
    }

    // Method for area of a trapezium
    public static void trapezium() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the first base: ");
        double base1 = scanner.nextDouble();
        System.out.print("Enter the length of the second base: ");
        double base2 = scanner.nextDouble();
        System.out.print("Enter the height of the trapezium: ");
        double height = scanner.nextDouble();
        System.out.print("Enter the lengths of the other two sides of the trapezium (side1 and side2): ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();

        double area = 0.5 * (base1 + base2) * height;
        double perimeter = base1 + base2 + side1 + side2;

        System.out.println("Trapezium Area: " + area);
        System.out.println("Trapezium Perimeter: " + perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.println("4. Triangle");
        System.out.println("5. Parallelogram");
        System.out.println("6. Trapezium");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                square();
                break;
            case 2:
                rectangle();
                break;
            case 3:
                circle();
                break;
            case 4:
                triangle();
                break;
            case 5:
                parallelogram();
                break;
            case 6:
                trapezium();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
