package com.example.coursehup;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
  Handler handler=new Handler(Looper.getMainLooper());
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 handler.postDelayed(new Runnable() {
     @Override
     public void run() {
         Intent intent=new Intent(MainActivity.this,InteroActvity.class);
         startActivity(intent);
         finish();
     }
 },5000);
    }

}