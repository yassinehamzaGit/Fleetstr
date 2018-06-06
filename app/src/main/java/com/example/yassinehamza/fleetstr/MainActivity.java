package com.example.yassinehamza.fleetstr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    final Button startButton= findViewById(R.id.start_button);
    startButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent  i = new Intent(getApplicationContext(),ChooseLanguage.class);
            startActivity(i);
        }
    });



    }
}
