package com.testreminder.reminder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.testreminder.notificationapp.R;

public class medicationactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medication);

        TextView tv = (TextView) findViewById(R.id.titleMed);
        Intent intent = getIntent();
        String medName = intent.getExtras().getString("medName");
        tv.setText(medName);
    }

    public void openReminder(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }



}