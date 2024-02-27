public class Package {
    private Address from;
    private Address to;
    private double weight;
    private double length;
    private double height;
    private double width;

    public Package(Address one, Address two, double lbs, double inches, double cm, double metersIThink) {
        from = one;
        to = two;
        weight = lbs;
        length = inches;
        height = cm;
        width = metersIThink;
    }

    public Address getFrom() {
        return from;
    }

    public void setFrom(Address from) {
        this.from = from;
    }

    public Address getTo() {
        return to;
    }

    public void setTo(Address to) {
        this.to = to;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
