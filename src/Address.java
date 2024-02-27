public class Address {
    private String houseNumber;
    private String street;
    private String apartmentNumber;
    private String city;
    private String state;
    private int zipcode;

    public Address(int number1, String streetStreet, int number2, String cityCity, String stateState, int zip) {
        String house = Integer.toString(number1);
        String apartment = Integer.toString(number2);
        houseNumber = house;
        street = streetStreet;
        apartmentNumber = apartment;
        city = cityCity;
        state = stateState;
        zipcode = zip;
    }
    public Address(int number1, String streetStreet, String cityCity, String stateState, int zip) {
        String house = Integer.toString(number1);
        houseNumber = house;
        street = streetStreet;
        city = cityCity;
        state = stateState;
        zipcode = zip;
    }
    public Address(String number1, String streetStreet, String number2, String cityCity, String stateState, int zip) {
        houseNumber = number1;
        street = streetStreet;
        city = cityCity;
        apartmentNumber = number2;
        state = stateState;
        zipcode = zip;
    }
    public Address(String number1, String streetStreet, String cityCity, String stateState, int zip) {
        houseNumber = number1;
        street = streetStreet;
        city = cityCity;
        state = stateState;
        zipcode = zip;
    }

    public Address(Address addressIGuess) {
        houseNumber = addressIGuess.houseNumber;
        street = addressIGuess.street;
        apartmentNumber = addressIGuess.apartmentNumber;
        city = addressIGuess.city;
        state = addressIGuess.state;
        zipcode = addressIGuess.zipcode;
    }

    public Address(String fullAddress) {
        houseNumber = fullAddress.substring(0, fullAddress.indexOf(" "));
        fullAddress = fullAddress.substring(fullAddress.indexOf(" " + 1));
        if (fullAddress.contains("Apt")) {
            street = fullAddress.substring(0, fullAddress.indexOf("Apt"));
            fullAddress = fullAddress.substring(fullAddress.indexOf("Apt") + 4);
            apartmentNumber = fullAddress.substring(0, fullAddress.indexOf(","));
            fullAddress = fullAddress.substring(fullAddress.indexOf(","), + 2);
        }
        else {
            street = fullAddress.substring(0, fullAddress.indexOf(","));
            fullAddress = fullAddress.substring(fullAddress.indexOf(","), + 2);
        }
        city = fullAddress.substring(0, fullAddress.indexOf(","));
        fullAddress = fullAddress.substring(fullAddress.indexOf(",") + 2);
        state = fullAddress.substring(0, fullAddress.indexOf(" "));
        String zipcodeForNow = fullAddress.substring(fullAddress.length() - 1);
        zipcode = Integer.parseInt(zipcodeForNow);
    }
}
