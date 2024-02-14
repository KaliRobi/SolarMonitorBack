package RenewableResourceMonitor.SolarEnergyMonitor.GeologicalFeatures;

import org.springframework.stereotype.Service;

import java.net.http.HttpResponse;

@Service
public class OverpassApi extends AbstractAPIDataRetriever{


    public OverpassApi() {

    }

    @Override
    public HttpResponse<String> getData(String urlString) {
        return super.getData(urlString);
    }

    //this will be url builder instead
    public String prepareOverPassQuery(String location){

        StringBuilder stringBuilder = new StringBuilder("overpass-api.de/api/interpreter?data=[out:json];area[name=\"");
        stringBuilder.append(location).append("\"]->.searchArea;node(area.searchArea)[place];out;");

        return stringBuilder.toString();

    }

}

