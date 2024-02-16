package RenewableResourceMonitor.SolarEnergyMonitor.GeologicalFeatures;

public class Location {


    private final long id;
    private final String name;
    private final double latitude;
    private final double longitude;
    private final String County;
    private final String Country;

    public Location(long id, String name, double latitude, double longitude, String county, String country) {
        this.id = id;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        County = county;
        Country = country;
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
