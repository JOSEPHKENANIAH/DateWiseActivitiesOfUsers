package codewithcal.au.calendarappexample;

import java.time.LocalTime;
import java.util.ArrayList;

<<<<<<< HEAD:DateWiseActivities/src/main/java/codewithcal/au/calendarappexample/HourEvent.java
public class HourEvent {
    LocalTime time;
    ArrayList<Event> events;

    public HourEvent(LocalTime time, ArrayList<Event> events) {
=======
class HourEvent
{
    LocalTime time;
    ArrayList<Event> events;

    public HourEvent(LocalTime time, ArrayList<Event> events)
    {
>>>>>>> 38e3634 (Daily Calendar):app/src/main/java/codewithcal/au/calendarappexample/HourEvent.java
        this.time = time;
        this.events = events;
    }

<<<<<<< HEAD:DateWiseActivities/src/main/java/codewithcal/au/calendarappexample/HourEvent.java
    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<Event> events) {
=======
    public LocalTime getTime()
    {
        return time;
    }

    public void setTime(LocalTime time)
    {
        this.time = time;
    }

    public ArrayList<Event> getEvents()
    {
        return events;
    }

    public void setEvents(ArrayList<Event> events)
    {
>>>>>>> 38e3634 (Daily Calendar):app/src/main/java/codewithcal/au/calendarappexample/HourEvent.java
        this.events = events;
    }
}
