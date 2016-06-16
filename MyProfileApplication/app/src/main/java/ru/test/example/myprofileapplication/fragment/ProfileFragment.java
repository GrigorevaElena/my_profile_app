package ru.test.example.myprofileapplication.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.support.design.widget.FloatingActionButton;
import ru.test.example.myprofileapplication.R;

/**
 * Created by ev.grigoreva on 04.06.16.
 */
public class ProfileFragment extends Fragment {
    private ProfileInterface profileInterface;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof ProfileInterface){
            profileInterface = (ProfileInterface) context;
        }
    }

    public interface ProfileInterface{
        void addingAddressAction();
        void editProfileAction();
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.profile_menu, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.profile_edit:
                if(profileInterface != null){
                    profileInterface.editProfileAction();
                }
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        View mainView = inflater.inflate(R.layout.fragment_profile, container, false);
        FloatingActionButton fab = (FloatingActionButton) mainView.findViewById(R.id.profile_fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(profileInterface != null){
                    profileInterface.addingAddressAction();
                }
            }
        });
        return mainView;
    }
}
