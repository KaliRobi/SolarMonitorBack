package RenewableResourceMonitor.SolarEnergyMonitor.GeologicalFeatures;

import org.springframework.stereotype.Component;


public class Location {


    private  long id;
    private  String name;
    private  double latitude;
    private  double longitude;
    private  String County;
    private  String Country;

    public Location(long id, String name, double latitude, double longitude, String county, String country) {
        this.id = id;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        County = county;
        Country = country;
    }

    public Location() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getCounty() {
        return County;
    }

    public String getCountry() {
        return Country;
    }


    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setCounty(String county) {
        County = county;
    }

    public void setCountry(String country) {
        Country = country;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", County='" + County + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }
}
