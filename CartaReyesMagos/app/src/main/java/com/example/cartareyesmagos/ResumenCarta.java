package com.example.cartareyesmagos;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResumenCarta extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resumen_carta);

        String nombre = getIntent().getStringExtra("nombre");
        String regalo1 = getIntent().getStringExtra("regalo1");
        String regalo2 = getIntent().getStringExtra("regalo2");
        String regalo3 = getIntent().getStringExtra("regalo3");
        String regalo4 = getIntent().getStringExtra("regalo4");

        TextView tvResumen = findViewById(R.id.text_resumen);
        tvResumen.setText("Querido " + nombre + ",\n\n" +
                "Este año has sido muy bueno y sus majestades los Reyes Magos te traerán:\n" +
                "1. " + regalo1 + "\n" +
                "2. " + regalo2 + "\n" +
                "3. " + regalo3 + "\n" +
                "4. " + regalo4 + "\n\n" +
                "¡Esperamos que te gusten mucho!");

        tvResumen.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
    }
}

