package model;


import org.json.JSONObject;

public class Sensor {
    private int id;
    private String name;
    private String vendor;
    private Location location;
    private int pollutionLevel;
    private Address address;

    public Sensor() {
    }

    public Sensor(JSONObject jsonObject) {
        this.id = (int) jsonObject.get("id");
        this.name = (String) jsonObject.get("name");
        this.vendor = (String) jsonObject.get("vendor");
        this.pollutionLevel = (int) jsonObject.get("pollutionLevel");
        this.location = new Location(jsonObject.getJSONObject("location"));
//        this.address = new Address(jsonObject.getJSONObject("address"));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getPollutionLevel() {
        return pollutionLevel;
    }

    public void setPollutionLevel(int pollutionLevel) {
        this.pollutionLevel = pollutionLevel;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", vendor='" + vendor + '\'' +
                ", location=" + location +
                ", pollutionLevel=" + pollutionLevel +
                ", address=" + address +
                '}';
    }
}
