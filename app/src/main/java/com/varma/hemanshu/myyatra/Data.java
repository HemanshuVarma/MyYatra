package com.varma.hemanshu.myyatra;


/**
 * Custom Class to Accept the Custom Data
 * Takes One Image and Three Strings Resources
 */
public class Data {

    private int mImageResourceId;
    private int mName;
    private int mLocation;
    private int mDescription;

    //Getter for Image Resource
    public int getImageResourceId() {
        return mImageResourceId;
    }

    //Getter for Name String resource
    public int getName() {
        return mName;
    }

    //Getter for Location String Resource
    public int getLocation() {
        return mLocation;
    }

    //Getter for Description String Resource
    public int getDescription() {
        return mDescription;
    }

    //This Indirectly stores data into Private members
    public Data(int imageId, int name, int location, int description) {
        mImageResourceId = imageId;
        mName = name;
        mLocation = location;
        mDescription = description;
    }
}
