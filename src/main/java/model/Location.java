package model;


import org.json.JSONObject;

public class Location {
    private double latitude;
    private double longitude;

    public Location(JSONObject jsonObject) {
        this.latitude = (double) jsonObject.get("latitude");
        this.longitude = (double) jsonObject.get("longitude");
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Location{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
