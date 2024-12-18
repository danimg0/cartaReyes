package com.example.cartareyesmagos;

import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText nombre;
    EditText regalo1;
    EditText regalo2;
    EditText regalo3;
    EditText regalo4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.edNombre);
        regalo1 = findViewById(R.id.edItem1);
        regalo2 = findViewById(R.id.edItem2);
        regalo3 = findViewById(R.id.edItem3);
        regalo4 = findViewById(R.id.edItem4);

        //Cuando se pulsa el boton
    }
}