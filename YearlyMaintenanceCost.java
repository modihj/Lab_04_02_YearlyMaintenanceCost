import java.util.Scanner;

public class YearlyMaintenanceCost {

    public static void main(String[] args) {

        // Create Object of Scanner class
        Scanner userInput = new Scanner(System.in);

        // user inputs
        System.out.print("Enter maintenance cost of season 1: ");
        double season1 = userInput.nextDouble();

        System.out.print("Enter maintenance cost of season 2: ");
        double season2 = userInput.nextDouble();

        System.out.print("Enter maintenance cost of season 3: ");
        double season3 = userInput.nextDouble();

        System.out.print("Enter maintenance cost of season 4: ");
        double season4 = userInput.nextDouble();

        // display details
        System.out.println("\nMaintenance details");
        System.out.printf("Season 1: $%.2f\n", season1);
        System.out.printf("Season 2: $%.2f\n", season2);
        System.out.printf("Season 3: $%.2f\n", season3);
        System.out.printf("Season 4: $%.2f\n", season4);

        double totalCost = season1 + season2 + season3 + season4;

        System.out.printf("Total yearly maintenance costs: $%.2f\n", totalCost);

        }

    }
