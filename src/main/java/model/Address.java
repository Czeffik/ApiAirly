package model;


import org.json.JSONObject;

public class Address {
    private String streetNumber;
    private String route;
    private String locality;
    private String country;

    public Address(JSONObject jsonObject) {
        this.streetNumber = (String) jsonObject.get("streetNumber");
        this.route = (String) jsonObject.get("route");
        this.locality = (String) jsonObject.get("locality");
        this.country = (String) jsonObject.get("country");
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetNumber=" + streetNumber +
                ", route='" + route + '\'' +
                ", locality='" + locality + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
