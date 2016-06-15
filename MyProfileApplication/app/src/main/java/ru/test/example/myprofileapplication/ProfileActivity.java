package ru.test.example.myprofileapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import ru.test.example.myprofileapplication.fragment.ProfileFragment;

public class ProfileActivity extends AppCompatActivity implements ProfileFragment.ProfileInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Toolbar toolbar = (Toolbar) findViewById(R.id.profile_toolbar);
        toolbar.setTitle("");
        toolbar.setNavigationIcon(R.drawable.ic_menu_white_18dp);
        setSupportActionBar(toolbar);
    }

    @Override
    public void addingAddressAction() {
        startActivity(new Intent(this, AddNewAddressActivity.class));
    }

    @Override
    public void editProfileAction() {
        startActivity(new Intent(this, EditProfileActivity.class));
    }
}
