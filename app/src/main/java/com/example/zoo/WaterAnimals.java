package com.example.zoo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WaterAnimals extends AppCompatActivity {

    RecyclerView rvAnimalList;

    ArrayList<Animal> waterArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_animals);

        initWaterList();

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        AnimalRecyclerViewAdapter animalRecyclerViewAdapter = new AnimalRecyclerViewAdapter(waterArrayList);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, ((LinearLayoutManager)layoutManager).getOrientation());


        rvAnimalList = findViewById(R.id.rvWaterAnimalList);
        rvAnimalList.setLayoutManager(layoutManager);
        rvAnimalList.setAdapter(animalRecyclerViewAdapter);
        rvAnimalList.addItemDecoration(dividerItemDecoration);


    }

    public void initWaterList(){
        waterArrayList.add(new Animal("Whale","Biggest in the world", R.drawable.water_beluga));
        waterArrayList.add(new Animal("Dolphin", "They love to play with our visitors", R.drawable.water_dolphin));
        waterArrayList.add(new Animal("Penguin", "Artic pengunies are always busy", R.drawable.water_pengin));
        waterArrayList.add(new Animal("Fish", "We have over 100 species of fish", R.drawable.water_fish));
        waterArrayList.add(new Animal("Turtle", "All of our turtles are from Georgia",R.drawable.water_turtle));

    }


}
