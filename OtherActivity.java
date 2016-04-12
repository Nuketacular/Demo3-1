package com.school.graham.demo3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class OtherActivity extends AppCompatActivity {

    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        button2 = (Button)findViewById(R.id.button2);
        EventHandler eventHandler = new EventHandler();
        button2.setOnClickListener(eventHandler);
    }

    class EventHandler implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button2:
                    Intent mainActivity = new Intent(OtherActivity.this, MainActivity.class);
                    startActivity(mainActivity);
                    break;
            }
        }
    }
}
