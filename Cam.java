package com.tenas.myapplication;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Cam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_cam );
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE); intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
        startActivity(intent);
    }
}
