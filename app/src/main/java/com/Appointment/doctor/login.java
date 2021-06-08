package com.Appointment.doctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_activity_main);
    }

    public void udash(View view) {
        startActivity(new Intent(this, userdash.class));
    }

    public void passforget(View view) {
        startActivity(new Intent(this,Forget_Password.class));
    }

}