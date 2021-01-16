package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    private List<CatalogItem> catalogItems;

    public List<CatalogItem> getCatalogItems() {
        return catalogItems;
    }

    public Catalog() {
        this.catalogItems = new ArrayList<>();
    }

    public void addItem(CatalogItem catalogItem) {
        catalogItems.add(catalogItem);
    }

    public void deleteItemByRegistrationNumber(String s) {
        for (int c = 0; c<catalogItems.size(); c++) {
            if (catalogItems.get(c).getRegistrationNumber().equals(s)) {
                catalogItems.remove(c);
            }
        }
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();

        for (CatalogItem c: catalogItems) {
            if (c.hasAudioFeature()) {
                result.add(c);
            }
        }

        return result;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();

        for (CatalogItem c: catalogItems) {
            if (c.hasPrintedFeature()) {
                result.add(c);
            }
        }

        return result;
    }

    public int getAllPageNumber() {
        int result = 0;

        for (CatalogItem c: catalogItems) {
            if (c.hasPrintedFeature()) {
            result = result + c.numberOfPagesAtOneItem();
            }
        }

        return result;
    }

    public int getFullLength() {
        int result = 0;

        for (CatalogItem c: catalogItems) {
            if (c.hasAudioFeature()) {
                result = result + c.fullLengthAtOneItem();
            }
        }

        return result;
    }

    public double averagePageNumberOver(int min) {
        int div = 0;
        double result = 0.0;

        if (min<=0) {
            throw new IllegalArgumentException("Page number must be positive");
        }

        for (CatalogItem c: catalogItems) {
            if (c.hasPrintedFeature() && c.numberOfPagesAtOneItem()>min) {
                div += 1;
                result = result + c.numberOfPagesAtOneItem();
            }
        }

        return result/div;
    }
}
