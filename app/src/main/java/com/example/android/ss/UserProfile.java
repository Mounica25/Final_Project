package com.example.android.ss;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class UserProfile {

    public String userName;
    public String userEmail;
    public String userAge;

    /* Default Constructor*/

    public UserProfile(){

    }


    public UserProfile(String userName, String userAge, String userEmail) {
        this.userName = userName;
        this.userAge = userAge;
        this.userEmail = userEmail;

    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }
}
