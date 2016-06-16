package ru.test.example.myprofileapplication.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ru.test.example.myprofileapplication.R;
import ru.test.example.myprofileapplication.model.ProfileViewModel;

/**
 * Created by ev.grigoreva on 04.06.16.
 */
public class ProfileInfoFragment extends Fragment {
    private ProfileViewModel profileViewModel = generateProfileData();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mainView = inflater.inflate(R.layout.fragment_profile_info, container, false);

        TextView profileName = (TextView) mainView.findViewById(R.id.name);
        TextView profilePhome = (TextView) mainView.findViewById(R.id.phone);

        profileName.setText(profileViewModel.getProfileName());
        profilePhome.setText(profileViewModel.getPhone());

        return mainView;
    }

    private ProfileViewModel generateProfileData(){
        return new ProfileViewModel("Николай Афанасьев", "+7 (915) 134-51-19");
    }
}
