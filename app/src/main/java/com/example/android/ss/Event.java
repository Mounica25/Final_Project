package com.example.android.ss;

public class Event {

    private String mEventDate;
    private String mEventDetails;

    public Event(String eventDate, String eventDetails) {
        mEventDate = eventDate;
        mEventDetails = eventDetails;
    }
    public String getmEventDate() {
        return mEventDate;
    }

    public void setmEventDate(String mEventDate) {
        this.mEventDate = mEventDate;
    }

    public String getmEventDetails() {
        return mEventDetails;
    }

    public void setmEventDetails(String mEventDetails) {
        this.mEventDetails = mEventDetails;
    }
}
