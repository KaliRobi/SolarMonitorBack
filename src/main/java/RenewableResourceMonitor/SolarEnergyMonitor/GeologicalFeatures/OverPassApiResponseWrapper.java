package RenewableResourceMonitor.SolarEnergyMonitor.GeologicalFeatures;

import org.springframework.stereotype.Component;

import java.util.List;

public class OverPassApiResponseWrapper {

    private String header;
    private List<Location> elements;


    public OverPassApiResponseWrapper() {
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public List<Location> getElements() {
        return elements;
    }

    public void setElements(List<Location> elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return "LocationWrapper{" +
                "header='" + header + '\'' +
                ", elements=" + elements +
                '}';
    }
}
