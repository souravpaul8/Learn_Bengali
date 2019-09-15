package com.example.android.learnBengali;

import java.security.acl.NotOwnerException;

/**
 * Created by SOURAV PAUL on 2/12/2018.
 */

public class Words {

    private String mBengaliText;
    private String mEnglishText;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    private static final int NO_IMAGE_PROVIDED= -1;

    /**
     *Constructor
     */
    public Words (String engishText,String bengaliText ,int imageResourceId) {

        mBengaliText = bengaliText;
        mEnglishText = engishText;
        mImageResourceId = imageResourceId;
    }

    /**
     * 2nd Constructor
     */

    public Words (String engishText,String bengaliText , int imageResourceId,int audioResourceId) {

        mBengaliText = bengaliText;
        mEnglishText = engishText;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Get English translation of the word
     */

    public String getEnglishText() {

        return mEnglishText;
    }

    /**
     * Get Bengali translation of the word
     */

    public String getBengaliText() {

        return mBengaliText;
    }

    /**
     * Get Image for the word
     */

    public int getImageResourceId()  {

        return mImageResourceId;
    }

    public boolean hasImage() {

      return mImageResourceId != NO_IMAGE_PROVIDED;

    }

    public int getAudioResourceId() {

        return mAudioResourceId;
    }


}
