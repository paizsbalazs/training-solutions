package catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogItem {

    private List<Feature> features = new ArrayList<>();
    private final int price;
    private final String registrationNumber;

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public CatalogItem(String registrationNumber, int price, List<Feature> features) {
        this.features = features;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public CatalogItem(String registrationNumber, int price, Feature ... f) {
        this.price = price;
        this.registrationNumber = registrationNumber;

        for (int i = 0; i<f.length; i++) {
            this.features.add(f[i]);
        }

    }

    public int numberOfPagesAtOneItem() {
        int result = 0;

        for (int i = 0; i<features.size(); i++) {
            if ( features.get(i) instanceof PrintedFeatures) {
                result = result + ((PrintedFeatures) features.get(i)).getNumberOfPages();
            }
        }

        return result;
    }

    public int fullLengthAtOneItem() {
        int result = 0;

        for (int i = 0; i<features.size(); i++) {
            if ( features.get(i) instanceof AudioFeatures) {
                result = result + ((AudioFeatures) features.get(i)).getLength();
            }
        }

        return result;
    }

    public List<String> getContributors() {
       List<String> result = new ArrayList<>();

       for (int i = 0; i<features.size(); i++) {
           for (int j = 0; j<features.get(i).getContributors().size(); j++) {
                result.add(features.get(i).getContributors().get(j).toString());
           }

       }

       return result;
    }

    public List<String> getTitles() {
        List<String> result = new ArrayList<>();

        for (int i = 0; i<features.size(); i++) {
            result.add(features.get(i).getTitle());
        }

        return result;
    }

    public boolean hasAudioFeature() {

        for (int i = 0; i<features.size(); i++) {
            if (features.get(i) instanceof AudioFeatures) {
                return true;
            }
        }

        return false;
    }

    public boolean hasPrintedFeature() {

        for (int i = 0; i<features.size(); i++) {
            if (features.get(i) instanceof PrintedFeatures) {
                return true;
            }
        }

        return false;
    }
}
