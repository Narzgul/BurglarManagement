public class ApartmentHouse extends House{
    private int numberApartments;

    public ApartmentHouse(String ownerName, double size, Address address, boolean garden, boolean alarm, int numberApartments) {
        super(ownerName, size, address, garden, alarm);
        this.numberApartments = numberApartments;
    }

    public int getNumberApartments() {
        return numberApartments;
    }

    public void setNumberApartments(int numberApartments) {
        this.numberApartments = numberApartments;
    }

    @Override
    public String toString() {
        return "ApartmentHouse{" +
                "numberApartments=" + numberApartments +
                ", ownerName='" + ownerName + '\'' +
                ", size=" + size +
                ", address=" + address +
                ", garden=" + garden +
                ", alarm=" + alarm +
                '}';
    }
}
