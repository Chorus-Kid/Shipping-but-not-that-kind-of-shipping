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

        }
    }
}