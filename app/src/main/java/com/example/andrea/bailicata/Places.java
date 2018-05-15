package com.example.andrea.bailicata;

public class Places {
    private int mSite;

    private int mImage;
    private int mDescription;
    private int mInfo;
    private int mMap;
    /**
     * Create a new Item object.
     */
    public Places(int Site, int Image, int Description, int Info, int Map) {
        mSite = Site;
        mImage = Image;
        mDescription = Description;
        mInfo = Info;
        mMap = Map;
        }


        public int getSite() {
        return mSite;
    }

    public int getImage() {
        return mImage;


    }

    public int getDescription() {
        return mDescription;


    }

    public int getInfo() {
        return mInfo;
    }

    public int getMap() {

        return mMap;
    }


}
