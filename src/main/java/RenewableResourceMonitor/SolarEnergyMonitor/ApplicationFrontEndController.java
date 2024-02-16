package RenewableResourceMonitor.SolarEnergyMonitor;

import RenewableResourceMonitor.SolarEnergyMonitor.GeologicalFeatures.OverPassApiProcessor;
import RenewableResourceMonitor.SolarEnergyMonitor.GeologicalFeatures.OverpassApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationFrontEndController {

    private final OverPassApiProcessor overPassApiProcessor;

    public ApplicationFrontEndController(OverPassApiProcessor overPassApiProcessor) {
        this.overPassApiProcessor = overPassApiProcessor;
    }

    @GetMapping(path = "/")
    public ResponseEntity<String> testController(){
    return new ResponseEntity<>(overPassApiProcessor.publishLocations().toString(), HttpStatus.OK);
    }





}
