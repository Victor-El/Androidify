package com.github.victor.androidify;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gd = (GridView) findViewById(R.id.topic_grid);

        ArrayList<Topic> topics = new ArrayList<Topic>();

        topics.add(new Topic("MTH101", "Elementary Mathematics 1"));
        topics.add(new Topic("CHM101", "Elementary Mathematics 1"));
        topics.add(new Topic("PHY101", "Elementary Mathematics 1"));
        topics.add(new Topic("ENG101", "Elementary Mathematics 1"));
        topics.add(new Topic("TIPS", "Get general study tips and examination tips"));


        TopicAdapter adapter = new TopicAdapter(MainActivity.this, topics);

        gd.setAdapter(adapter);
    }
}
