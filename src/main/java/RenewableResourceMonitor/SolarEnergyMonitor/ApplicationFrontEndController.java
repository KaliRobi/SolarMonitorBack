package RenewableResourceMonitor.SolarEnergyMonitor;

import RenewableResourceMonitor.SolarEnergyMonitor.GeologicalFeatures.OverpassApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.http.HttpResponse;

@RestController
public class ApplicationFrontEndController {

    private final OverpassApi overpassApi;

    public ApplicationFrontEndController(OverpassApi overpassApi) {
        this.overpassApi = overpassApi;
    }

    @GetMapping(path = "/")
    public ResponseEntity<String> testController(){

       URI uri =  overpassApi.overPassUrlBuilder("Lääne maakond");

       HttpResponse<String> returnData = overpassApi.getData(uri);

       return new ResponseEntity<>(returnData.body(), HttpStatus.OK);
    }





}
