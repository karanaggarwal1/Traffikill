package com.example.karan.traffikill.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class KeyListDaily implements Parcelable {
    public static final Parcelable.Creator<KeyListDaily> CREATOR =
            new Parcelable.Creator<KeyListDaily>() {
                public KeyListDaily createFromParcel(Parcel in) {
                    return new KeyListDaily(in);
                }

                public KeyListDaily[] newArray(int size) {
                    return new KeyListDaily[size];
                }
            };
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("data")
    @Expose
    private ArrayList<DataItemsDaily> data;

    private KeyListDaily(Parcel parcel) {
        this.summary = parcel.readString();
        parcel.readTypedList(this.data, DataItemsDaily.CREATOR);
    }

    public String getSummary() {
        return summary;
    }

    public ArrayList<DataItemsDaily> getData() {
        return data;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.summary);
        dest.writeTypedList(this.data);
    }

}
