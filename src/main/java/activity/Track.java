package activity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    public double getFullElevation() {
        double result = 0.0;

        for (int t = 0; t<this.trackPoints.size()-1; t++) {

            if (this.trackPoints.get(t+1).getElevation()>1) {
                result = result + (this.trackPoints.get(t+1).getElevation()-this.trackPoints.get(t).getElevation());
            }
        }

        return result;
    }

    public double getFullDecrease() {
        double result = 0.0;

        for (int t = 0; t<this.trackPoints.size()-1; t++) {

            if (this.trackPoints.get(t+1).getElevation()<this.trackPoints.get(t).getElevation()) {
                result = result + (this.trackPoints.get(t).getElevation()-this.trackPoints.get(t+1).getElevation());
            }
        }

        return result;
    }

    public double getDistance() {
        double result = 0.0;

        for (int t = 0; t<this.trackPoints.size()-1; t++) {
            result = result + this.trackPoints.get(t+1).getDistanceFrom(this.trackPoints.get(t));
        }

        return result;
    }

    public Coordinate findMinimumCoordinate() {
        double latitude = 0.0;
        double longitude =0.0;

        for (int t = 0; t < this.trackPoints.size(); t++) {

            if (latitude>this.trackPoints.get(t).getCoordinate().getLatitude()) {
                latitude = this.trackPoints.get(t).getCoordinate().getLatitude();
            }

            if (longitude>this.trackPoints.get(t).getCoordinate().getLongitude()) {
                longitude = this.trackPoints.get(t).getCoordinate().getLongitude();
            }

        }

        return new Coordinate(latitude,longitude);
    }

    public Coordinate findMaximumCoordinate() {
        double latitude = 0.0;
        double longitude =0.0;

        for (int t = 0; t < this.trackPoints.size(); t++) {

            if (latitude<this.trackPoints.get(t).getCoordinate().getLatitude()) {
                latitude = this.trackPoints.get(t).getCoordinate().getLatitude();
            }

            if (longitude<this.trackPoints.get(t).getCoordinate().getLongitude()) {
                longitude = this.trackPoints.get(t).getCoordinate().getLongitude();
            }

        }

        return new Coordinate(latitude,longitude);
    }

    public double getRectangleArea() {
        double result=0.0;

        Track track = new Track();

        for (TrackPoint t: this.trackPoints) {
            track.addTrackPoint(t);
        }

        double maxLatitude = track.findMaximumCoordinate().getLatitude();
        double maxlongtitude = track.findMaximumCoordinate().getLongitude();
        double minLatitude = track.findMinimumCoordinate().getLatitude();
        double minlongtitude = track.findMinimumCoordinate().getLongitude();

        result = (Math.abs(maxLatitude)+Math.abs(minLatitude))*(Math.abs(maxlongtitude)+Math.abs(minlongtitude));

        return result;
    }

}
