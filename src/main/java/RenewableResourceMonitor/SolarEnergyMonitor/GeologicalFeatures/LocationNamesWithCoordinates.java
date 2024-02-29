package RenewableResourceMonitor.SolarEnergyMonitor.GeologicalFeatures;

public class LocationNamesWithCoordinates {


    private final long id;
    private final double lat;
    private final  double lon;
    private final String locationName;


    public LocationNamesWithCoordinates(long id, double lat, double lon, String name) {
        this.id = id;
        this.lat = lat;
        this.lon = lon;
        this.locationName = name;
    }

    public long getId() {
        return id;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public String getLocationName() {
        return locationName;
    }


    @Override
    public String toString() {
        return "LocationNamesWithCoordinates{" +
                "id=" + id +
                ", lat=" + lat +
                ", lon=" + lon +
                ", name='" + locationName + '\'' +
                '}';
    }
}
