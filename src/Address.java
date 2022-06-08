public class Address {
    private String streetName;
    private int number;
    private int zipCode;
    private String city;
    
    public Address(String streetName, int number, int zipCode, String city) {
        this.streetName = streetName;
        this.number = number;
        this.zipCode = zipCode;
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", number=" + number +
                ", zipCode=" + zipCode +
                ", city='" + city + '\'' +
                '}';
    }
}
