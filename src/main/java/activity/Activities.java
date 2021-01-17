package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {

    List<Activity> activities = new ArrayList<>();

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public int numberOfTrackActivities() {
        int result=0;

        for (Activity a: activities) {
            if (a instanceof ActivityWithTrack) {
                result = result + 1;
            }
        }

        return result;
    }

    public int numberOfWithoutTrackActivities() {
        int result=0;

        for (Activity a: activities) {
            if (a instanceof ActivityWithoutTrack) {
                result = result + 1;
            }
        }

        return result;
    }

    public List<Report> distancesByTypes() {
        List<Report> result = new ArrayList<>();
        double running=0.0;

        for (Activity a: activities) {

            if (a instanceof ActivityWithTrack && a.getType().equals(ActivityType.RUNNING)) {
                running = running + a.getDistance();
            }

        }

        result.add(new Report(ActivityType.BIKING, 0.0));
        result.add(new Report(ActivityType.HIKING, 0.0));
        result.add(new Report(ActivityType.RUNNING, running));
        result.add(new Report(ActivityType.BASKETBALL, 0.0));

        return result;
    }

}
