package com.example.cartareyesmagos;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    EditText nombre;
    EditText regalo1;
    EditText regalo2;
    EditText regalo3;
    EditText regalo4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.edNombre);
        regalo1 = findViewById(R.id.edItem1);
        regalo2 = findViewById(R.id.edItem2);
        regalo3 = findViewById(R.id.edItem3);
        regalo4 = findViewById(R.id.edItem4);

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
                resumenCarta.putExtra("nombre", nombre.getText().toString());
                resumenCarta.putExtra("regalo1", regalo1.getText().toString());
                resumenCarta.putExtra("regalo2", regalo2.getText().toString());
                resumenCarta.putExtra("regalo3", regalo3.getText().toString());
                resumenCarta.putExtra("regalo4", regalo4.getText().toString());
                startActivity(resumenCarta);
            }
        });
    }
}
