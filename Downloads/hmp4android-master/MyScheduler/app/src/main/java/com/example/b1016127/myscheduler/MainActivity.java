package com.example.b1016127.myscheduler;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private PopupWindow popup;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intent = new Intent(MainActivity.this, ToDoListActivity.class);
                    startActivity(intent);
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    /*}

    private void saveText(){
    */
        String text;
        Button textButton = (Button) findViewById(R.id.textButton);


        textButton.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                //命令記述
                String s = "初期状態";

                popup = new PopupWindow(MainActivity.this);
                //EditText ed = (EditText) findViewById(R.id.editText);

                View popupView = getLayoutInflater().inflate(R.layout.popup_layout, null);
                popupView.findViewById(R.id.button).setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if(popup.isShowing()){
                            popup.dismiss();
                        }
                    }

                });

                popup.setContentView(popupView);

                //
                popup.setOutsideTouchable(true);
                popup.setFocusable(true);

                //float width = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 300,getResources().getDisplayMetrics());
                //float height = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, findViewById(R.id.container).getHeight(),getResources().getDisplayMetrics());
                float width2 = findViewById(R.id.container).getWidth();
                float height2 = findViewById(R.id.container).getHeight();


                popup.setWidth((int)width2);
                popup.setHeight((int)height2);

                popup.showAtLocation(findViewById(R.id.textButton), Gravity.BOTTOM,0,0);




                /*try{
                    FileOutputStream fos = openFileOutput("test.txt", Context.MODE_PRIVATE);
                    String writeString = "test";
                    fos.write(writeString.getBytes());


                    Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
                }catch(Exception e){
                    Toast.makeText(MainActivity.this, "問題が発生しました", Toast.LENGTH_SHORT).show();
                }*/
            }
        });
    }

    /*@Override
    protected void onDestroy(){
        if(popup != null && popup.isShowing()){
            popup.dismiss();
        }
        super.onDestroy();
    }
    */



}
