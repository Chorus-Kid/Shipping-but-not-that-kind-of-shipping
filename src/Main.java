import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("USPS Simulator (Yahoo)");
        int actualChoice = 0;
        while (actualChoice != 1 && actualChoice != 2 && actualChoice != 3 && actualChoice != 4) {
            System.out.println("So what brings you in today?");
            System.out.println("1. Calculate the cost of shipping on package\n2. Simulate packages being shipped\n3. See how shipping costs are calculated\n4. Leave");
            String choice = s.nextLine();
            actualChoice = Integer.parseInt(choice);
        }
        if (actualChoice == 1) {
            int zipcode1 = 0;
            int zipcode2 = 0;
            double weight = 0;
            double length = 0;
            double height = 0;
            double width = 0;
            System.out.print("Enter sending zipcode: ");
            String zippy = s.nextLine();
            if (zippy.length() == 5) {
                zipcode1 = Integer.parseInt(zippy);
            }
            else {
                System.out.println("Zipcode must be exactly 5 numbers long");
                System.out.print("Enter sending zipcode: ");
                String zip = s.nextLine();
                zipcode1 = Integer.parseInt(zip);
            }
            System.out.print("Enter receiving zipcode: ");
            String zipster = s.nextLine();
            if (zipster.length() == 5) {
                zipcode2 = Integer.parseInt(zipster);
            }
            else {
                System.out.println("Zipcode must be exactly 5 numbers long");
                System.out.print("Enter receiving zipcode: ");
                String zip = s.nextLine();
                zipcode2 = Integer.parseInt(zip);
            }
            System.out.print("Enter weight of package: ");
            String weightMaybe = s.nextLine();
            double weightPerhaps = Double.parseDouble(weightMaybe);
            if (weightPerhaps >= 0.1) {
                weight = weightPerhaps;
            }
            else {
                System.out.println("Weight must be at least 0.1 pounds");
                System.out.print("Enter weight of package: ");
                String lbs = s.nextLine();
                weight = Double.parseDouble(lbs);
            }
            System.out.print("Enter length of package: ");
            String lengthMaybe = s.nextLine();
            double lengthPerhaps = Double.parseDouble(lengthMaybe);
            if (lengthPerhaps >= 2) {
                length = lengthPerhaps;
            }
            else {
                System.out.println("Length must be at least 2 inches");
                System.out.print("Enter length of package: ");
                String in = s.nextLine();
                length = Double.parseDouble(in);
            }
            System.out.print("Enter height of package: ");
            String heightMaybe = s.nextLine();
            double heightPerhaps = Double.parseDouble(heightMaybe);
            if (heightPerhaps >= 2) {
                height = heightPerhaps;
            }
            else {
                System.out.println("Height must be at least 2 inches");
                System.out.print("Enter height of package: ");
                String in = s.nextLine();
                height = Double.parseDouble(in);
            }
            System.out.print("Enter width of package: ");
            String widthMaybe = s.nextLine();
            double widthPerhaps = Double.parseDouble(widthMaybe);
            if (widthPerhaps >= 2) {
                width = widthPerhaps;
            }
            else {
                System.out.println("Width must be at least 2 inches");
                System.out.print("Enter width of package: ");
                String in = s.nextLine();
                width = Double.parseDouble(in);
            }
            PostageCalculator cost = new PostageCalculator();
            double totalCost = cost.shippingCost(zipcode1, zipcode2, weight, height, length, width);
            System.out.println("Total cost: " + totalCost);
        }
    }
}