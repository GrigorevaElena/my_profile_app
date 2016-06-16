package ru.test.example.myprofileapplication.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ru.test.example.myprofileapplication.R;
import ru.test.example.myprofileapplication.model.AddressViewModel;
import ru.test.example.myprofileapplication.adapter.ProfileAddressListAdapter;

/**
 * Created by ev.grigoreva on 04.06.16.
 */
public class ProfileAddressListFragment extends Fragment {
    private ProfileAddressListAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mainView = inflater.inflate(R.layout.fragment_profile_addresses, container, false);

        RecyclerView view = (RecyclerView) mainView.findViewById(R.id.place_list);
        view.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        view.setHasFixedSize(true);
        mAdapter = new ProfileAddressListAdapter();
        view.setAdapter(mAdapter);
        mAdapter.setData(generateData());
        return mainView;
    }

    private List<AddressViewModel> generateData() {
        List<AddressViewModel> list = new ArrayList<>();
        list.add(new AddressViewModel("Дом", "Ярославль, ул.Блюхера 24-21", true, 500));
        list.add(new AddressViewModel("Офис", "Ярославль, ул.Комсомольская, 11 офис 5", false, 500));
        list.add(new AddressViewModel("Новый адрес мое название места", "Ярославль, ул.Большая Октябрьская, 10-14", false, 500));
        list.add(new AddressViewModel("Еще один мой домашний адрес длинное название", "Ярославская область, Ярославский район, пос. Норское, ул.Новая, 10-3", true, 1000));
        return list;
    }
}
