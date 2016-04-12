package com.school.graham.demo3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        button1 = (Button)findViewById(R.id.button1);
        EventHandler eventHandler = new EventHandler();
        button1.setOnClickListener(eventHandler);
    }

    class EventHandler implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button1:
                    Intent otherActivity = new Intent(MainActivity.this, OtherActivity.class);
                    startActivity(otherActivity);
                    break;
            }
        }
    }
}
