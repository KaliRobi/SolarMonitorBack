package RenewableResourceMonitor.SolarEnergyMonitor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class ApplicationFrontEndController {


    @GetMapping(path = "/")
    public ResponseEntity<List<String>> testController(){
        List<String> testBody = List.of("uks", "kaks", "kolm");
        return new ResponseEntity<>(testBody, HttpStatus.OK);
    }





}
