package ru.test.example.myprofileapplication.model;

/**
 * Created by Лена on 16.06.2016.
 */
public class AddressViewModel {
    private String mAddressCategory;
    private String mAddress;
    private boolean mIsBaseAddress;
    private int mPrice;


    public AddressViewModel(String addressCategory, String address, boolean isBaseAddress, int price) {
        mAddressCategory = addressCategory;
        mAddress = address;
        mIsBaseAddress = isBaseAddress;
        mPrice = price;
    }

    public String getmAddressCategory() {
        return mAddressCategory;
    }

    public String getAddress() {
        return mAddress;
    }

    public boolean isBaseAddress() {
        return mIsBaseAddress;
    }

    public int getPrice() {
        return mPrice;
    }
}
