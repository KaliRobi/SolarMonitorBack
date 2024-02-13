package RenewableResourceMonitor.SolarEnergyMonitor.GeologicalFeatures;

public class OverpassApi extends AbstractAPIDataRetriever{

      @Override
    public void postData(String urlString, String payload) {
        super.postData(urlString, payload);
    }


}
//    https://overpass-api.de/api/interpreter?data=[out:json];area[name=%22L%C3%A4%C3%A4ne%20maakond%22]-%3E.searchArea;node(area.searchArea)[place];out;
