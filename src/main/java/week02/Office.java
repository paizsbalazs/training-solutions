package week02;

import java.util.ArrayList;
import java.util.List;

public class Office {

    private List<MeetingRoom> meetingRooms = new ArrayList();

    public void addMeetingRoom(MeetingRoom meetingRoom) {

        this.meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println(meetingRoom.getName());
        }
    }

    public void printNamesReverse() {
        for (int i = meetingRooms.size(); i > 0; i--) {
            System.out.println(meetingRooms.get(i-1).getName());
        }
    }

    public void printEventNames() {
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRooms.indexOf(meetingRoom) % 2 == 0) {
            } else { System.out.println(meetingRoom.getName());}
        }
    }

    public void getAreas() {
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println(meetingRoom.getName() + " : " + meetingRoom.getWidth() + " " + meetingRoom.getLength()+ " " +meetingRoom.getarea());
        }
    }

    public void printMeetingRoomsWithName(String name) {
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().equals(name)) {
                System.out.println(meetingRoom.getName() + " : " + meetingRoom.getLength() + " / " + meetingRoom.getWidth() + " / " + meetingRoom.getarea()  );
            }
        }
    }

    public void printMeetingRoomsContains(String name) {
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().contains(name)) {
                System.out.println(meetingRoom.getName() + " : " + meetingRoom.getLength() + " / " + meetingRoom.getWidth() + " / " + meetingRoom.getarea()  );           }
        }
    }

    public void getAreaLargerThen(int size) {
        for (MeetingRoom meetingRoom : meetingRooms) {
            if ( meetingRoom.getarea() >= size ) {
                System.out.println(meetingRoom.getName() + " : " + meetingRoom.getLength() + " / " + meetingRoom.getWidth() + " / " + meetingRoom.getarea()  );
            }
        }
    }

}
