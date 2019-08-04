package com.example.zoo;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalRecyclerViewAdapter extends RecyclerView.Adapter<AnimalRecyclerViewAdapter.ViewHolder> {
    ArrayList<Animal> animalArrayList;


    public AnimalRecyclerViewAdapter(ArrayList<Animal> animalArrayList){
        this.animalArrayList = animalArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.animal_details,parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalRecyclerViewAdapter.ViewHolder holder, int position) {
        Animal currentAnimal = animalArrayList.get(position);
        holder.setAnimalDataForItem(currentAnimal);







    }

    @Override
    public int getItemCount() {
        return animalArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvAnimalName;
        TextView tvAnimalDescription;
        ImageView ivAnimalImage;
        Animal thisItemsAnimal;


        public ViewHolder(View itemView) {
            super(itemView);
            tvAnimalName = itemView.findViewById(R.id.tvAnimalTitle);
            tvAnimalDescription = itemView.findViewById(R.id.tvAnimalDescription);
            ivAnimalImage = itemView.findViewById(R.id.ivAnimalImage);


            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    Intent intent = new Intent(view.getContext(), AnimalDetails.class);
                    intent.putExtra("animal", thisItemsAnimal);
                    view.getContext().startActivity(intent);
                }
            });


        }



        public void setAnimalDataForItem(Animal animal){
            tvAnimalName.setText(animal.getName());
            tvAnimalDescription.setText(animal.getDescription());
            ivAnimalImage.setImageResource(animal.getPicture());


            thisItemsAnimal = animal;
        }



    }
}
