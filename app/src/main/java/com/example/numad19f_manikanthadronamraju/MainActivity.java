package com.example.numad19f_manikanthadronamraju;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showInfo(View view) {

        TextView textView = findViewById(R.id.textView);
        textView.setText("Manikantha Dronamraju \n manikantha92@gmail.com");
        
    }
}
