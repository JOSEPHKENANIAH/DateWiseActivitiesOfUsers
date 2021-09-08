package codewithcal.au.calendarappexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class HourAdapter extends ArrayAdapter<HourEvent>
{
    public HourAdapter(@NonNull Context context, List<HourEvent> hourEvents)
    {
        super(context, 0, hourEvents);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        HourEvent event = getItem(position);

        if (convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.hour_cell, parent, false);

        setHour(convertView, event.time);
        setEvents(convertView, event.events);

        return convertView;
    }

<<<<<<< HEAD:DateWiseActivities/src/main/java/codewithcal/au/calendarappexample/HourAdapter.java


    private void setHour(View convertView, LocalTime time) {
=======
    private void setHour(View convertView, LocalTime time)
    {
>>>>>>> 38e3634 (Daily Calendar):app/src/main/java/codewithcal/au/calendarappexample/HourAdapter.java
        TextView timeTV = convertView.findViewById(R.id.timeTV);
        timeTV.setText(CalendarUtils.formattedShortTime(time));
    }

<<<<<<< HEAD:DateWiseActivities/src/main/java/codewithcal/au/calendarappexample/HourAdapter.java
    private void setEvents(View convertView, ArrayList<Event> events) {
=======
    private void setEvents(View convertView, ArrayList<Event> events)
    {
>>>>>>> 38e3634 (Daily Calendar):app/src/main/java/codewithcal/au/calendarappexample/HourAdapter.java
        TextView event1 = convertView.findViewById(R.id.event1);
        TextView event2 = convertView.findViewById(R.id.event2);
        TextView event3 = convertView.findViewById(R.id.event3);

<<<<<<< HEAD:DateWiseActivities/src/main/java/codewithcal/au/calendarappexample/HourAdapter.java
        if(events.size() == 0){
            hideEvents(event1);
            hideEvents(event2);
            hideEvents(event3);
        }
        else if(events.size() == 1){
            setEvent(event1, events.get(0));
            hideEvents(event2);
            hideEvents(event3);
        }
        else if(events.size() == 2){
            setEvent(event1, events.get(0));
            setEvent(event2, events.get(1));
            hideEvents(event3);
        }
        else if(events.size() == 3){
=======
        if(events.size() == 0)
        {
            hideEvent(event1);
            hideEvent(event2);
            hideEvent(event3);
        }
        else if(events.size() == 1)
        {
            setEvent(event1, events.get(0));
            hideEvent(event2);
            hideEvent(event3);
        }
        else if(events.size() == 2)
        {
            setEvent(event1, events.get(0));
            setEvent(event2, events.get(1));
            hideEvent(event3);
        }
        else if(events.size() == 3)
        {
>>>>>>> 38e3634 (Daily Calendar):app/src/main/java/codewithcal/au/calendarappexample/HourAdapter.java
            setEvent(event1, events.get(0));
            setEvent(event2, events.get(1));
            setEvent(event3, events.get(2));
        }
        else
<<<<<<< HEAD:DateWiseActivities/src/main/java/codewithcal/au/calendarappexample/HourAdapter.java
            {
            setEvent(event1, events.get(0));
            setEvent(event2, events.get(1));
            event3.setVisibility(View.VISIBLE);
            String eventsNotShown = String.valueOf(events.size() -2);
            eventsNotShown += "More Events";
=======
        {
            setEvent(event1, events.get(0));
            setEvent(event2, events.get(1));
            event3.setVisibility(View.VISIBLE);
            String eventsNotShown = String.valueOf(events.size() - 2);
            eventsNotShown += " More Events";
>>>>>>> 38e3634 (Daily Calendar):app/src/main/java/codewithcal/au/calendarappexample/HourAdapter.java
            event3.setText(eventsNotShown);
        }
    }

<<<<<<< HEAD:DateWiseActivities/src/main/java/codewithcal/au/calendarappexample/HourAdapter.java
    private void setEvent(TextView textView, Event event) {
=======
    private void setEvent(TextView textView, Event event)
    {
>>>>>>> 38e3634 (Daily Calendar):app/src/main/java/codewithcal/au/calendarappexample/HourAdapter.java
        textView.setText(event.getName());
        textView.setVisibility(View.VISIBLE);
    }

<<<<<<< HEAD:DateWiseActivities/src/main/java/codewithcal/au/calendarappexample/HourAdapter.java
    private void hideEvents(TextView tv) {
        tv.setVisibility(View.INVISIBLE);

    }
}
=======
    private void hideEvent(TextView tv)
    {
        tv.setVisibility(View.INVISIBLE);
    }

}













>>>>>>> 38e3634 (Daily Calendar):app/src/main/java/codewithcal/au/calendarappexample/HourAdapter.java
