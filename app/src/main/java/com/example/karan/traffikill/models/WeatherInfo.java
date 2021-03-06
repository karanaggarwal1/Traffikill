package com.example.karan.traffikill.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WeatherInfo implements Parcelable {
    public static final Parcelable.Creator<WeatherInfo> CREATOR =
            new Parcelable.Creator<WeatherInfo>() {
                public WeatherInfo createFromParcel(Parcel in) {
                    return new WeatherInfo(in);
                }

                public WeatherInfo[] newArray(int size) {
                    return new WeatherInfo[size];
                }
            };

    @SerializedName("currently")
    @Expose
    private CurrentData currently;

    @SerializedName("hourly")
    @Expose
    private KeyListHourly hourly;

    @SerializedName("daily")
    @Expose
    private KeyListDaily daily;

    private WeatherInfo(Parcel parcel) {
        parcel.readParcelable(CurrentData.class.getClassLoader());
        parcel.readParcelable(KeyListHourly.class.getClassLoader());
        parcel.readParcelable(KeyListDaily.class.getClassLoader());
    }

    public CurrentData getCurrently() {
        return currently;
    }

    public KeyListHourly getHourly() {
        return hourly;
    }

    public KeyListDaily getDaily() {
        return daily;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.currently, flags);
        dest.writeParcelable(this.hourly, flags);
        dest.writeParcelable(this.daily, flags);
    }
}
