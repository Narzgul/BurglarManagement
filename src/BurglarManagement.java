import java.util.ArrayList;

public class BurglarManagement {
    private House[] houses;

    public BurglarManagement() {
        houses = new House[400];
    }

    public void addHouse(House house) {
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) houses[i] = house;
        }
    }

    public void removeFirstApartmentHouse() {
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] instanceof ApartmentHouse) {
                houses[i] = null;
                return;
            }
        }
    }

    public void removeDetachedHousesByName(String name) {
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] instanceof DetachedHouse && houses[i].getOwnerName().equals(name)) houses[i] = null;
        }
    }

    public House getFirstHouseWithGarden() {
        for (House house : houses) {
            if (house.hasGarden()) return house;
        }
        return null;
    }

    public ApartmentHouse getFirstApartmentHouse() {
        for (House house : houses) {
            if (house instanceof ApartmentHouse) return (ApartmentHouse) house;
        }
        return null;
    }

    public House[] getHousesInCity(String city) {
        ArrayList<House> housesInCity = new ArrayList<>();
        for (House house : houses) {
            if (house != null && house.getAddress().getCity().equals(city)) housesInCity.add(house);
        }

        // Cast ArrayList to Array of correct Type
        House[] temp = new House[housesInCity.size()];
        temp = housesInCity.toArray(temp);
        return temp;
    }

    public DetachedHouse getFirstDetachedHouseWithMoreWindowsThan(int windows) {
        for (House house : houses) {
            if (house instanceof DetachedHouse && ((DetachedHouse) house).getNumberWindows() > windows)
                return (DetachedHouse) house;
        }
        return null;
    }

    public House[] getHousesInCityWithoutAlarmSystem(String city) {
        ArrayList<House> housesWithout = new ArrayList<>();
        for (House house : getHousesInCity(city)) {
            if (!house.hasAlarm()) housesWithout.add(house);
        }

        // Cast ArrayList to Array of correct Type
        House[] temp = new House[housesWithout.size()];
        temp = housesWithout.toArray(temp);
        return temp;
    }

    public DetachedHouse[] getDetachedHousesInStreetAndCityWithGarden(String street, String city) {
        ArrayList<DetachedHouse> housesMatching = new ArrayList<>();
        for (House house : getHousesInCity(city)) {
            if (house instanceof DetachedHouse && house.getAddress().getStreetName().equals(street) && house.hasGarden())
                housesMatching.add((DetachedHouse) house);
        }

        // Cast ArrayList to Array of correct Type
        DetachedHouse[] temp = new DetachedHouse[housesMatching.size()];
        temp = housesMatching.toArray(temp);
        return temp;
    }

    public House[] getEasyBreakableHouses() {
        ArrayList<House> breakableHouses = new ArrayList<>();
        for (House house : houses) {
            if (house == null) continue;
            if (house instanceof ApartmentHouse && ((ApartmentHouse) house).getNumberApartments() < 6)
                breakableHouses.add(house);
            if (house instanceof DetachedHouse detachedHouse) {
                if (detachedHouse.getNumberWindows() > 8 && detachedHouse.hasGarden() &&
                        !detachedHouse.isNeighboursVigilant() && !detachedHouse.hasAlarm())
                    breakableHouses.add(house);
            }
        }

        // Cast ArrayList to Array of correct Type
        House[] temp = new House[breakableHouses.size()];
        temp = breakableHouses.toArray(temp);
        return temp;
    }

    public static void main(String[] args) {
        new BurglarManagement();
    }
}
