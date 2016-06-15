package ru.test.example.myprofileapplication.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import ru.test.example.myprofileapplication.R;

/**
 * Created by Лена on 09.06.2016.
 */
public class AddressViewHolder extends RecyclerView.ViewHolder{
    TextView addressCategory;
    TextView address;
    TextView addressType;
    TextView price;

    public AddressViewHolder(View itemView) {
        super(itemView);
        addressCategory = (TextView) itemView.findViewById(R.id.address_title);
        address = (TextView) itemView.findViewById(R.id.address);
        addressType = (TextView) itemView.findViewById(R.id.address_type);
        price = (TextView) itemView.findViewById(R.id.price);
    }
}
