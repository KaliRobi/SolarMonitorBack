package RenewableResourceMonitor.SolarEnergyMonitor.GeologicalFeatures;

public class Location {


    private final String name;
    private final double latitude;
    private final double longitude;
    private final String County;
    private final String Country;

    public Location(String name, double latitude, double longitude, String county, String country) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        County = county;
        Country = country;
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

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", County='" + County + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }
}
