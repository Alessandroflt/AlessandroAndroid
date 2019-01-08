package com.tenas.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Lista extends AppCompatActivity {

    Button add;
    EditText nomes;
    ListView lista;
    String text;
    ArrayAdapter<String> adapter;
    ArrayList<String> arrayList;
    Button btnimage;
    Button btndate;
    Button btnwebview;
    Button btncamera;
    Button btnligar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

     add=findViewById(R.id.Butao);
     nomes=findViewById(R.id.Texto);
     lista=findViewById(R.id.Lista);
     arrayList=new ArrayList<String>();

     btnimage=findViewById(R.id.btnimage);

     btndate=findViewById(R.id.btndate);

     btnwebview=findViewById(R.id.btnwebview);

     btncamera=findViewById( R.id.btncamera);

     btnligar=findViewById(R.id.btnligar);


     add.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
          text=nomes.getText().toString();
          arrayList.add(text);
          adapter=new ArrayAdapter<String>(getBaseContext(),android.R.layout.simple_list_item_1,arrayList);
          lista.setAdapter(adapter);
          nomes.setText("");
         }
     });


     btnimage.setOnClickListener(new View.OnClickListener(){
         @Override
         public void onClick(View v) {
         Intent i=new Intent(getBaseContext(),ImageView.class);
         startActivity(i);
         }
     });


        btndate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getBaseContext(),Calendario.class);
                startActivity(i);
            }
        });

        btnwebview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getBaseContext(),Webview.class);
                startActivity(i);
            }
        });

        btncamera.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getBaseContext(),Cam.class);
                startActivity(i);
            }
        });

        btnligar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getBaseContext(),Ligar.class);
                startActivity(i);
            }
        });


    }
}