package com.example.johnny.a1_proyectosaludar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void saludar(View view) {
        Toast.makeText(getApplicationContext(), "¿Hola como estas?",
                Toast.LENGTH_SHORT).show();
    }
}
