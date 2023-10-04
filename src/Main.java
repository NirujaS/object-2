import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of the 'Area' class
        Area rectangle = new Area();

        // Obtain the length and breadth from the user
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Set the dimensions of the rectangle
        rectangle.setDim(length, breadth);

        // Calculate and print the area of the rectangle
        double area = rectangle.getArea();
        System.out.println("Area of the rectangle with length " + length + " and breadth " + breadth + " is: " + area);

        // Close the scanner
        scanner.close();
    }
}