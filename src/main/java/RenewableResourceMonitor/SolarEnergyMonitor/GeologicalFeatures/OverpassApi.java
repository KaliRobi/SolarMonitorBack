package RenewableResourceMonitor.SolarEnergyMonitor.GeologicalFeatures;

import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

@Service
public class OverpassApi extends AbstractAPIDataRetriever{


    public OverpassApi() {

    }

    @Override
    public HttpResponse<String> getData(URI targetUti) {
        return super.getData(targetUti);
    }

    public URI overPassUrlBuilder(String location)  {

        StringBuilder stringBuilder = new StringBuilder("[out:json];area[name=\"");
        stringBuilder.append(location).append("\"]->.searchArea;node(area.searchArea)[place];out;");

        StringBuilder uriBase = new StringBuilder("https://overpass-api.de/api/interpreter?data=");

        String urlString = null;
        try {
            System.out.println(stringBuilder.toString());
            urlString = URLEncoder.encode(stringBuilder.toString(), StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

        System.out.println(URI.create(uriBase.append(urlString).toString()));

        return URI.create(uriBase.append(urlString).toString());

    }

}

