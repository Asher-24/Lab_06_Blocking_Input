import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double height = 0;
        double width = 0;
        double perimeter = 0;
        double area = 0;
        double diagonal = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.println("Enter width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                done = true;
            } else {
                trash = in.next(); // use next() instead of nextLine()
                System.out.println("Invalid input " + trash + " is not a valid number");
                System.out.println("\ntry again.");
            }
        } while (!done);

        done = false;

        do {
            System.out.println("Enter height of the rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                done = true;
            } else {
                trash = in.next(); // use next() instead of nextLine()
                System.out.println("Invalid input " + trash + " is not a valid number");
                System.out.println("\ntry again.");
            }
        } while (!done);

        perimeter = (2 * (width + height));
        diagonal = Math.sqrt(Math.pow(width,2) + (Math.pow(height,2)));
        area = (width * height);
        System.out.println("The diagonal of the rectangle is " + diagonal);
        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);
    }
}
