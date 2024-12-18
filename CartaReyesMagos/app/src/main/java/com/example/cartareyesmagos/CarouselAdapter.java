package com.example.cartareyesmagos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarouselAdapter extends RecyclerView.Adapter<CarouselAdapter.Image>{
    private ArrayList<Integer> images;

    public CarouselAdapter(ArrayList<Integer> images) {
        this.images = images;
    }

    @NonNull
    @Override
    public Image onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.carousel_item,parent,false);
        return new Image(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Image holder, int position) {
        holder.image.setImageResource(images.get(position));
    }

    @Override
    public int getItemCount() {
        return images.size();
    }



    public static class Image extends RecyclerView.ViewHolder {
        private ImageView image;
        public Image(@NonNull View itemView) {
            super(itemView);
            this.image = itemView.findViewById(R.id.carousel_image_view);

        }

    }
}
