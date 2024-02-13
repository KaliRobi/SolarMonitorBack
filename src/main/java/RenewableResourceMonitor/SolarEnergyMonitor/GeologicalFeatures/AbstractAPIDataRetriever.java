package RenewableResourceMonitor.SolarEnergyMonitor.GeologicalFeatures;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.ExecutionException;
import java.net.http.HttpResponse.BodyHandlers;
abstract class AbstractAPIDataRetriever {

public void getData(String urlString){

    try {
        URI targetUri = new URI(urlString);
        HttpClient httpClient  = HttpClient.newHttpClient();
        HttpRequest newRequest = HttpRequest.newBuilder(targetUri).build();
        HttpResponse<String> response = httpClient.sendAsync(newRequest, BodyHandlers.ofString()).get();

        System.out.println(response.body());

    } catch (URISyntaxException | InterruptedException | ExecutionException e) {
        throw new RuntimeException(e);
    }

}

    public void postData(String urlString, String payload){

        try {
            URI targetUri = new URI(urlString);
            HttpClient httpClient  = HttpClient.newHttpClient();
            HttpRequest newRequest = HttpRequest.newBuilder()
                    .uri(targetUri)
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(payload))
                    .build();

            HttpResponse<String> response = httpClient.send(newRequest, BodyHandlers.ofString());

            System.out.println(response.statusCode());
            System.out.println(response.body());
        } catch (URISyntaxException | InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }

    }



}



