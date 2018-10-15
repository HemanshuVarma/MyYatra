package com.varma.hemanshu.myyatra;


public class Data {

    private int mImageResourceId;
    private int mName;
    private int mLocation;
    private int mDescription;

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getName() {
        return mName;
    }

    public int getLocation() {
        return mLocation;
    }

    public int getDescription() {
        return mDescription;
    }

    public Data(int imageId, int name, int location, int description) {
        mImageResourceId = imageId;
        mName = name;
        mLocation = location;
        mDescription = description;
    }
}
