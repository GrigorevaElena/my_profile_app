package ru.test.example.myprofileapplication.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.test.example.myprofileapplication.R;
import ru.test.example.myprofileapplication.adapter.ProfileAddressListAdapter;

/**
 * Created by ev.grigoreva on 04.06.16.
 */
public class ProfileAddressListFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mainView = inflater.inflate(R.layout.fragment_profile_addresses, container, false);

        RecyclerView view = (RecyclerView) mainView.findViewById(R.id.place_list);
        view.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        view.setHasFixedSize(true);
        view.setAdapter(new ProfileAddressListAdapter());
        return mainView;
    }
}
