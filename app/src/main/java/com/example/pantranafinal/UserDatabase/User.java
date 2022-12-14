package com.example.pantranafinal.UserDatabase;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable{
    private int id;
    private String name;
    private String email;
    private String city;
    private String country;
    private String password;

    public User( String name, String email, String city, String country, String password) {
        this.name = name;
        this.email = email;
        this.city = city;
        this.country = country;
        this.password = password;
    }

    public User() {

    }

    protected User(Parcel in) {
        id = in.readInt();
        name = in.readString();
        password = in.readString();
        email = in.readString();
        city = in.readString();
        country = in.readString();
    }

    public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(name);
        parcel.writeString(password);
        parcel.writeString(email);
        parcel.writeString(city);
        parcel.writeString(country);
    }
}
