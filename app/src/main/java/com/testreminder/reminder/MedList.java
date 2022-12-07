package com.testreminder.reminder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.testreminder.notificationapp.R;


public class MedList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.med_list);
    }

    public void openMedAnxiety(View view) {
        String name = "Anti Anxiety";
        Intent intent = new Intent(this, medicationactivity.class);
        intent.putExtra("medName", name);
        startActivity(intent);
    }

    public void openMedBlood(View view) {
        String name = "Blood Pressure";
        Intent intent = new Intent(this, medicationactivity.class);
        intent.putExtra("medName", name);
        startActivity(intent);
    }


}