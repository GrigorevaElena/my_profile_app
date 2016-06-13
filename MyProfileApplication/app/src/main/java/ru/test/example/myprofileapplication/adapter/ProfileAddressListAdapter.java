package ru.test.example.myprofileapplication.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.test.example.myprofileapplication.R;

/**
 * Created by Лена on 09.06.2016.
 */
public class ProfileAddressListAdapter extends RecyclerView.Adapter<AddressViewHolder> {

    @Override
    public AddressViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.profile_address_item, parent, false);
        return new AddressViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AddressViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
