import java.util.ArrayList;
import java.lang.Math;
public class PackageSimulator {
    private ArrayList<Package> packages;

    public void generatePackages(int numberOfPackages) {
        PostageCalculator postage = new PostageCalculator();
        double totalCost = 0;
        for (int i = 0; i < numberOfPackages; i++) {
            System.out.println("Package " + (i + 1) + ":");
            int zip = 501 + (int)(Math.random() * 99950);
            String zipcodeOne = Integer.toString(zip);
            if (zipcodeOne.length() == 3) {
                zipcodeOne = "00" + zipcodeOne;
            }
            else if (zipcodeOne.length() == 4) {
                zipcodeOne = "0" + zipcodeOne;
            }
            int zipcode1 = Integer.parseInt(zipcodeOne);
            int code = 501 + (int)(Math.random() * 99950);
            String zipcodeTwo = Integer.toString(code);
            if (zipcodeTwo.length() == 3) {
                zipcodeTwo = "00" + zipcodeTwo;
            }
            else if (zipcodeTwo.length() == 4) {
                zipcodeTwo = "0" + zipcodeTwo;
            }
            int zipcode2 = Integer.parseInt(zipcodeTwo);
            System.out.println("Origin Address: 000 Street Street Apt 00, City, State " + zipcode1);
            System.out.println("Receiving Address: 000 Street Street Apt 00, City, State" + zipcode2);
            double weight = 0.1 + (Math.random() * 40);
            double length = 2 + (Math.random() * 36);
            double height = 2 + (Math.random() * 36);
            double width = 2 + (Math.random() * 36);
            System.out.println("Weight: " + weight);
            System.out.println("Length: " + length);
            System.out.println("Height: " + height);
            System.out.println("Width: " + width);
            double cost = postage.shippingCost(zipcode1, zipcode2, weight, length, height, width);
            System.out.println("Cost: " + cost);
            totalCost = totalCost + cost;
        }
        System.out.println("Total cost: " + totalCost);
    }
}
