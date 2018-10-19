package com.github.victor.androidify;

public class Topic {

    private String mMainTopic;
    private String mDetails;

    public Topic(String topic, String details) {
        mMainTopic = topic;
        mDetails = details;
    }

    public String getMaintopic() {
        return mMainTopic;
    }

    public String getmDetails() {
        return mDetails;
    }

}
