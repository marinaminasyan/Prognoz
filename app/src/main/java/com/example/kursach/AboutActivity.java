package com.example.kursach;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AboutActivity extends AppCompatActivity {

    private EditText A_dOtel;
    private EditText A_YearMilk;
    private EditText A_dPlan;
    private EditText prognoz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        A_dOtel = (EditText) findViewById(R.id.A_dOtel);
        A_YearMilk = (EditText) findViewById(R.id.A_YearMilk);
        A_dPlan = (EditText) findViewById(R.id.A_dPlan);
        prognoz = (EditText) findViewById(R.id.prognoz);
    }

    public void ClickButton(View v)
    {

        String dOtel = A_dOtel.getText().toString();
        String YearMilk = A_YearMilk.getText().toString();
        String dPlan = A_dPlan.getText().toString();

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date date1 = null;
        Date date2 = null;
        try {
            date1 = format.parse(dOtel);
            date2 = format.parse(dPlan);
        } catch (Exception e) {
            e.printStackTrace();
        }
        long difference = date1.getTime() - date2.getTime();
        int days = (int) (difference / (24 * 60 * 60 * 1000));
        prognoz.setText(days);
    }
}

