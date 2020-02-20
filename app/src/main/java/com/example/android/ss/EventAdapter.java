package com.example.android.ss;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class EventAdapter extends ArrayAdapter<Event> {

    private static final String LOG_TAG = EventAdapter.class.getSimpleName();

    public EventAdapter(Activity context, ArrayList<Event> events){
        super(context,0,events);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.eventlist_item,parent,false);

        }
        Event currentEvent = getItem(position);

        TextView date_TextView = listItemView.findViewById(R.id.date);
        date_TextView.setText(currentEvent.getmEventDate());

        TextView event_TextView = listItemView.findViewById(R.id.eventName);
        event_TextView.setText(currentEvent.getmEventDetails());

        return listItemView;
    }
}
