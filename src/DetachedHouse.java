public class DetachedHouse extends House{
    private int numberWindows;
    private boolean neighboursVigilant;

    public DetachedHouse(String ownerName, double size, Address address, boolean garden, boolean alarm, int numberWindows, boolean neighboursVigilant) {
        super(ownerName, size, address, garden, alarm);
        this.numberWindows = numberWindows;
        this.neighboursVigilant = neighboursVigilant;
    }

    public int getNumberWindows() {
        return numberWindows;
    }

    public void setNumberWindows(int numberWindows) {
        this.numberWindows = numberWindows;
    }

    public boolean isNeighboursVigilant() {
        return neighboursVigilant;
    }

    public void setNeighboursVigilant(boolean neighboursVigilant) {
        this.neighboursVigilant = neighboursVigilant;
    }

    @Override
    public String toString() {
        return "DetachedHouse{" +
                "neighboursVigilant=" + neighboursVigilant +
                ", ownerName='" + ownerName + '\'' +
                ", size=" + size +
                ", address=" + address +
                ", garden=" + garden +
                ", alarm=" + alarm +
                '}';
    }
}
