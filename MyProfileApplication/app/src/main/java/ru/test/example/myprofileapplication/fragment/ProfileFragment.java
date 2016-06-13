package ru.test.example.myprofileapplication.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.design.widget.FloatingActionButton;
import ru.test.example.myprofileapplication.R;

/**
 * Created by ev.grigoreva on 04.06.16.
 */
public class ProfileFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mainView = inflater.inflate(R.layout.fragment_profile, container, false);

        FloatingActionButton fab = (FloatingActionButton) mainView.findViewById(R.id.profile_fab);

        return mainView;
    }
}
