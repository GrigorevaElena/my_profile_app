package ru.test.example.myprofileapplication.model;

/**
 * Created by Лена on 16.06.2016.
 */
public class ProfileViewModel {
    private String mProfileName;
    private String mPhone;

    public ProfileViewModel(String profileName, String phone) {
        mProfileName = profileName;
        mPhone = phone;
    }

    public String getProfileName() {
        return mProfileName;
    }

    public String getPhone() {
        return mPhone;
    }
}
