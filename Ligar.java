package com.tenas.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ligar extends AppCompatActivity {

    EditText numero;
    Button btnligar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_ligar );

        numero = (EditText) findViewById(R.id.editTextnum);
        btnligar = (Button) findViewById(R.id.btnligar);

        btnligar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = numero.getText().toString();

                Uri uri = Uri.parse( "tel:"+ num );

                Intent intent = new Intent(Intent.ACTION_CALL, uri);

                if (ActivityCompat.checkSelfPermission(Ligar.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Ligar.this, new String[]{Manifest.permission.CALL_PHONE } ,1);
                    return;
                }
                startActivity(intent);


            }
        });

    }
}
