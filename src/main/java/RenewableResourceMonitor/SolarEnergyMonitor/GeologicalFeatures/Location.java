package RenewableResourceMonitor.SolarEnergyMonitor.GeologicalFeatures;


import java.util.Map;

public class Location {


    private  long id;
    private  String name;
    private  double lat;
    private  double lon;

    private Map<String, String> tags;
    private  String county;
    private  String country;

    public Location(long id, String name, double lat, double lon, String county, String country, Map<String, String> tags ) {
        this.id = id;
        this.name = name;
        this.lat = lat;
        this.lon = lon;
        this.county = county;
        this.country = country;
        this.tags = tags;
    }

    public Location() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", latitude=" + lat +
                ", longitude=" + lon +
                ", tags=" + tags +
                ", county='" + county + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
