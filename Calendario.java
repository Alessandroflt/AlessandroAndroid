package com.tenas.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.app.DatePickerDialog;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;



public class Calendario extends AppCompatActivity {

    TextView calendarView;
    Button btndate;
    Calendar calendar;
    DatePickerDialog dpd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);

        calendarView = (TextView)findViewById(R.id.calendarView);
        btndate = (Button)findViewById(R.id.btndate);

        btndate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calendar= Calendar.getInstance();
                int dia = calendar.get(Calendar.DAY_OF_MONTH);
                int mes = calendar.get(Calendar.MONTH);
                int ano = calendar.get(Calendar.YEAR);

                dpd = new DatePickerDialog(Calendario.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int nano, int nmes, int ndia) {
                        calendarView.setText(ndia + "/" + (nmes+1) +"/"+nano);
                    }
                },dia, mes, ano);
                dpd.show();
            }
        });

    }
}
