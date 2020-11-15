package attributes.person;

public class Address {

    private String country;
    private String city;
    private String streetAdnNumber;
    private String zipCode;

    public Address(String country, String city, String streetAdnNumber, String zipCode) {
        this.country = country;
        this.city = city;
        this.streetAdnNumber = streetAdnNumber;
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreetAdnNumber() {
        return streetAdnNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String addressToString() {
    return this.country + " " + this.city + " " + this.streetAdnNumber + " " + this.zipCode;
    }

    public void correctData(String country, String city, String streetAndNumber, String zipcode) {

        this.country = country;
        this.city = city;
        this.streetAdnNumber = streetAndNumber;
        this.zipCode = zipcode;

    }
}
