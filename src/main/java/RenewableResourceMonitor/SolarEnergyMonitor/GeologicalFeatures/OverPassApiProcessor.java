package RenewableResourceMonitor.SolarEnergyMonitor.GeologicalFeatures;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@Component
public class OverPassApiProcessor {


    private HttpResponse<String> returnApiData() {

        OverpassApi overpassApi = new OverpassApi();

        URI uri =  overpassApi.overPassUrlBuilder("Lääne maakond");

        return overpassApi.getData(uri);

    }


    private List<Location> mapJsonToLocation(){

        HttpResponse<String> jsonString = returnApiData();

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);

        try {
            return  mapper.readValue(jsonString.body(), OverPassApiResponseWrapper.class).getElements();
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }

    public List<Location> publishLocations(){
       return mapJsonToLocation();
    }




}
