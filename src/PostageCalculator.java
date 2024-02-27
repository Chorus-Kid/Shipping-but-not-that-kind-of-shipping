public class PostageCalculator {
    static double shippingCost(int zipcode1, int zipcode2, double lbs, double inches, double cm, double metersIThink) {
        double cost = 3.75;
        if (lbs >= 40) {
            cost = cost + 20;
            double lbslbs = lbs - 40;
            cost = cost + (lbslbs * 10 * 0.1);
        } else {
            cost = cost + (lbs * 10 * 0.05);
        }
        if (inches + cm + metersIThink >= 36) {
            double length = (inches + cm + metersIThink) - 36;
            cost = cost + (length * 0.1);
        }
        String zip1 = Integer.toString(zipcode1);
        String zip2 = Integer.toString(zipcode2);
        zip1 = zip1.substring(0, 4);
        zip2 = zip2.substring(0, 4);
        int actualZip1 = Integer.parseInt(zip1);
        int actualZip2 = Integer.parseInt(zip2);
        if (actualZip1 > actualZip2) {
            double difference = (double) (actualZip1 - actualZip2) / 100;
            cost = cost + difference;
        } else if (actualZip1 < actualZip2) {
            double difference = (double) (actualZip2 - actualZip1) / 100;
            cost = cost + difference;
        }
        return cost;
    }
    static double shippingCost(Address one, Address two, double lbs, double inches, double cm, double metersIThink) {
        double cost = 3.75;
        if (lbs >= 40) {
            cost = cost + 20;
            double lbslbs = lbs - 40;
            cost = cost + (lbslbs * 10 * 0.1);
        } else {
            cost = cost + (lbs * 10 * 0.05);
        }
        if (inches + cm + metersIThink >= 36) {
            double length = (inches + cm + metersIThink) - 36;
            cost = cost + (length * 0.1);
        }
        int zipcode1 = one.getZipcode();
        int zipcode2 = two.getZipcode();
        String zip1 = Integer.toString(zipcode1);
        String zip2 = Integer.toString(zipcode2);
        zip1 = zip1.substring(0, 4);
        zip2 = zip2.substring(0, 4);
        int actualZip1 = Integer.parseInt(zip1);
        int actualZip2 = Integer.parseInt(zip2);
        if (actualZip1 > actualZip2) {
            double difference = (double) (actualZip1 - actualZip2) / 100;
            cost = cost + difference;
        } else if (actualZip1 < actualZip2) {
            double difference = (double) (actualZip2 - actualZip1) / 100;
            cost = cost + difference;
        }
        return cost;
    }
    static double shippingCost(Package oooh) {
        double cost = 3.75;
        double lbs = oooh.getWeight();
        double inches = oooh.getLength();
        double cm = oooh.getHeight();
        double metersIThink = oooh.getWidth();
        if (lbs >= 40) {
            cost = cost + 20;
            double lbslbs = lbs - 40;
            cost = cost + (lbslbs * 10 * 0.1);
        } else {
            cost = cost + (lbs * 10 * 0.05);
        }
        if (inches + cm + metersIThink >= 36) {
            double length = (inches + cm + metersIThink) - 36;
            cost = cost + (length * 0.1);
        }
        int zipcode1 = oooh.getFrom().getZipcode();
        int zipcode2 = oooh.getTo().getZipcode();
        String zip1 = Integer.toString(zipcode1);
        String zip2 = Integer.toString(zipcode2);
        zip1 = zip1.substring(0, 4);
        zip2 = zip2.substring(0, 4);
        int actualZip1 = Integer.parseInt(zip1);
        int actualZip2 = Integer.parseInt(zip2);
        if (actualZip1 > actualZip2) {
            double difference = (double) (actualZip1 - actualZip2) / 100;
            cost = cost + difference;
        } else if (actualZip1 < actualZip2) {
            double difference = (double) (actualZip2 - actualZip1) / 100;
            cost = cost + difference;
        }
        return cost;
    }
}
