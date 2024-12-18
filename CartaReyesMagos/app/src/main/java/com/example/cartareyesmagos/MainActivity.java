package com.example.cartareyesmagos;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.carousel.CarouselSnapHelper;
import com.google.android.material.carousel.HeroCarouselStrategy;

import java.util.ArrayList;
import java.util.List;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity { //  implements CarouselAdapter.OnItemClickListener
    private ArrayList<Integer> images = new ArrayList<>(
            List.of(
                    R.drawable.melchor,
                    R.drawable.gaspar,
                    R.drawable.baltasar
            )
    );

    EditText nombre;
    EditText regalo1;
    EditText regalo2;
    EditText regalo3;
    EditText regalo4;
    //private int selectedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.carousel_recycler_view);
        recyclerView.setAdapter(new CarouselAdapter(images));
        recyclerView.setLayoutManager(new CarouselLayoutManager(new HeroCarouselStrategy()));
        CarouselSnapHelper snapHelper = new CarouselSnapHelper();
        snapHelper.attachToRecyclerView(recyclerView);

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
                //resumenCarta.putExtra("selectedImage", selectedImage);

                startActivity(resumenCarta);
            }
        });
    }
}
