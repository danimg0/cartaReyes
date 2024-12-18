package com.example.cartareyesmagos;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = findViewById(R.id.floating_action_button);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(view,
                        "Carta de sus majestades los RRMM, enviada con éxito",
                        Snackbar.LENGTH_LONG);
                snackbar.setBackgroundTint(Color.parseColor("#37E243"));
                snackbar.setTextColor(Color.WHITE);
                snackbar.show();

                Intent resumenCarta = new Intent(MainActivity.this, ResumenCarta.class);
                startActivity(resumenCarta);
            }
        });
    }
}
