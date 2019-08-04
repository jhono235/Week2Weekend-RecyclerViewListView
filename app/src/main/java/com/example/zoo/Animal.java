package com.example.zoo;

import android.os.Parcel;
import android.os.Parcelable;

public class Animal implements Parcelable {

    private String name, description;
    private int picture;




    public Animal(String name, String description, int picture ){
        this.name = name;
        this.description = description;
        this.picture = picture;



    }


    protected Animal(Parcel in) {
        name = in.readString();
        description = in.readString();
        picture = in.readInt();
    }

    public static final Creator<Animal> CREATOR = new Creator<Animal>() {
        @Override
        public Animal createFromParcel(Parcel in) {
            return new Animal(in);
        }

        @Override
        public Animal[] newArray(int size) {
            return new Animal[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }




    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(description);
        parcel.writeInt(picture);

    }
}





