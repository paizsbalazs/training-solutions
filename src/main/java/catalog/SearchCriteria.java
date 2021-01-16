package catalog;

public class SearchCriteria {

    private static String contributor;
    private static String title;

    public static SearchCriteria createByTitle(String s) {

        if ( s == null) {
            throw new IllegalArgumentException();
        }

        title = s;
        contributor="";
        return null;
    }

    public static SearchCriteria createByBoth(String s, String d) {

        if ( s==null ) {
            throw new IllegalArgumentException();
        }

        if ( d == null) {
            throw new IllegalArgumentException();
        }

        contributor=d;
        title=s;
        return null;
    }

    public static SearchCriteria createByContributor(String s) {
        if ( s == null) {
            throw new IllegalArgumentException();
        }

        contributor=s;
        title="";
        return null;
    }

    public static String getContributor() {
        return contributor;
    }

    public static String getTitle() {
        return title;
    }

    public static boolean hasTitle() {
        if (title.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean hasContributor() {
        if (contributor.equals("")) {
            return false;
        } else {
            return true;
        }
    }
}
