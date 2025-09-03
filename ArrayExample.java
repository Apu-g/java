import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for array size
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        // Create array
        int[] numbers = new int[size];

        // Input elements
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Display elements
        System.out.println("You entered:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
