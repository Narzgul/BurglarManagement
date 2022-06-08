public class House implements Comparable<House>{
    protected String ownerName;
    protected double size;
    protected Address address;
    protected boolean garden;
    protected boolean alarm;

    public House(String ownerName, double size, Address address, boolean garden, boolean alarm) {
        this.ownerName = ownerName;
        this.size = size;
        this.address = address;
        this.garden = garden;
        this.alarm = alarm;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean hasGarden() {
        return garden;
    }

    public void setGarden(boolean garden) {
        this.garden = garden;
    }

    public boolean hasAlarm() {
        return alarm;
    }

    public void setAlarm(boolean alarm) {
        this.alarm = alarm;
    }

    @Override
    public String toString() {
        return "House{" +
                "ownerName='" + ownerName + '\'' +
                ", size=" + size +
                ", address=" + address +
                ", garden=" + garden +
                ", alarm=" + alarm +
                '}';
    }

    @Override
    public int compareTo(House o) {
        if (o == null) return 1;
        if (ownerName.equals(o.getOwnerName()) && size == o.getSize()) return 0;
        return -1;
    }
}
