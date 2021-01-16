package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature{

   private final List<String> composer;
   private final int length;
   private final List<String> performers;
   private final String title;

    public int getLength() {
        return length;
    }

    public AudioFeatures(String title, int length, List<String> composer, List<String> performers) {

        if (title.equals("")) {
            throw new IllegalArgumentException();
        }

        if (length<0) {
            throw new IllegalArgumentException();
        }

        if (composer.size()<1) {
            throw new IllegalArgumentException();
        }

        this.composer = composer;
        this.length = length;
        this.performers = performers;
        this.title = title;
    }

    public AudioFeatures(String title, int length, List<String> composer) {

        if (title.equals("")) {
            throw new IllegalArgumentException();
        }

        if (length<0) {
            throw new IllegalArgumentException();
        }

        if (composer.size()<1) {
            throw new IllegalArgumentException();
        }

        this.composer = composer;
        this.length = length;
        this.performers = null;
        this.title = title;
    }

    @Override
    public List<String> getContributors() {

        List<String> result = new ArrayList<>();

        if (this.performers.size()>0) {

            for (int i = 0; i < this.performers.size(); i++) {
                result.add(this.performers.get(i).toString());
            }
        }

        for (int j = 0; j < this.composer.size(); j++) {
            result.add(this.composer.get(j).toString());
        }

        return result;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
