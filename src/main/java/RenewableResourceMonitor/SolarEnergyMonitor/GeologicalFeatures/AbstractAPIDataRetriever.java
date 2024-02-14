package RenewableResourceMonitor.SolarEnergyMonitor.GeologicalFeatures;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutionException;
import java.net.http.HttpResponse.BodyHandlers;
abstract class AbstractAPIDataRetriever {

public HttpResponse<String> getData(String urlString){

    try {

        URI targetUri = URI.create(URLEncoder.encode(urlString, StandardCharsets.UTF_8.toString()));
        System.out.println(targetUri);
        HttpClient httpClient  = HttpClient.newHttpClient();

        HttpRequest newRequest = HttpRequest.newBuilder(targetUri).build();
        return httpClient.sendAsync(newRequest, BodyHandlers.ofString()).get();

    } catch (InterruptedException | ExecutionException | UnsupportedEncodingException e) {
        throw new RuntimeException(e);
    }


}

    public HttpResponse<String> postData(String urlString, String payload){

        try {
            URI targetUri = new URI(urlString);
            HttpClient httpClient  = HttpClient.newHttpClient();
            HttpRequest newRequest = HttpRequest.newBuilder()
                    .uri(targetUri)
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(payload))
                    .build();

            return httpClient.send(newRequest, BodyHandlers.ofString());

        } catch (URISyntaxException | InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }

    }



}



