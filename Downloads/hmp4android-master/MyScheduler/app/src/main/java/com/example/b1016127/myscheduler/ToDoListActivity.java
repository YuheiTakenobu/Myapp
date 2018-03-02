package com.example.b1016127.myscheduler;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

/**
 * Created by b1016127 on 2018/01/19.
 */

public class ToDoListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);


        ScrollView sv = new ScrollView(this);
        sv.setBackgroundColor(Color.rgb(0,200,0));
        sv.setLayoutParams(new ScrollView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT));
        setContentView(sv);

        TableLayout tl = new TableLayout(this);
        tl.setLayoutParams(new TableLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        sv.addView(tl);

        TableRow tr1 = new TableRow(this);
        tr1.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        tr1.setGravity(Gravity.CENTER_HORIZONTAL);
        tl.addView(tr1);

        TextView tv1 = new TextView(this);
        tv1.setText("第壱項目");
        tr1.addView(tv1);

        TableRow tr2 = new TableRow(this);
        tr2.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        tl.addView(tr2);

        TextView tv2 = new TextView(this);
        tv2.setText("第弐項目");
        tr2.addView(tv2);

        TableRow tr3 = new TableRow(this);
        tr3.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        tr3.setGravity(Gravity.CENTER_HORIZONTAL);
        tl.addView(tr3);

        TextView tv3 = new TextView(this);
        tv3.setText("第参項目");
        tr3.addView(tv3);


    }


}
