package ru.test.example.myprofileapplication.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ru.test.example.myprofileapplication.R;
import ru.test.example.myprofileapplication.model.AddressViewModel;

/**
 * Created by Лена on 09.06.2016.
 */
public class ProfileAddressListAdapter extends RecyclerView.Adapter<AddressViewHolder> {
    private List<AddressViewModel> mData = new ArrayList<>();
    private Context mContext;

    @Override
    public AddressViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.profile_address_item, parent, false);
        return new AddressViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AddressViewHolder holder, int position) {
        holder.addressCategory.setText(mData.get(position).getmAddressCategory());
        holder.address.setText(mData.get(position).getAddress());
        holder.addressType.setVisibility(mData.get(position).isBaseAddress() ? View.VISIBLE : View.GONE);
        holder.price.setText(String.format(mContext.getResources().getString(R.string.price_format),
                mData.get(position).getPrice()));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void setData(List<AddressViewModel> data) {
        mData.clear();
        if(data != null){
            mData.addAll(data);
        }
        notifyDataSetChanged();
    }
}
