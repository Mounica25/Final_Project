package com.example.android.ss;

public class SubjectsData {

    public String userSubjects;

    /* Default COnstructor */

    public SubjectsData(){

    }


    public SubjectsData(String userSubjects) {

        this.userSubjects = userSubjects;

    }

    public String getUserSubjects() {
        return userSubjects;
    }

    public void setUserSubjects(String userSubjects) {
        this.userSubjects = userSubjects;
    }
}
