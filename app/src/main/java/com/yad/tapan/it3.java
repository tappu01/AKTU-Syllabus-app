package com.yad.tapan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import com.yad.tapan.aktu_sample.R;
import com.journaldev.expandablelistview.CustomExpandableListAdapter;
import com.journaldev.expandablelistview.It_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class it3 extends AppCompatActivity {

    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    HashMap<String, List<String>> expandableListDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cs_sem3s);
        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
        expandableListDetail = It_3.getData();
        expandableListTitle = new ArrayList<String>(expandableListDetail.keySet());
        expandableListAdapter = new CustomExpandableListAdapter(this, expandableListTitle, expandableListDetail);
        expandableListView.setAdapter(expandableListAdapter);


    }

}