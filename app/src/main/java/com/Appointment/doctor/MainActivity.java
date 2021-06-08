package com.Appointment.doctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openlogin(View view) {
        startActivity(new Intent(this,login.class));
    }


    public void onpenregis(View view) {
        startActivity(new Intent(this,registration.class));
    }
}
