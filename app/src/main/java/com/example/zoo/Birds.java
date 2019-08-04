package com.example.zoo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Birds extends AppCompatActivity {

    RecyclerView rvAnimalList;

    ArrayList<Animal> birdArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_animals);

        initWaterList();

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        AnimalRecyclerViewAdapter animalRecyclerViewAdapter = new AnimalRecyclerViewAdapter(birdArrayList);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, ((LinearLayoutManager)layoutManager).getOrientation());


        rvAnimalList = findViewById(R.id.rvWaterAnimalList);
        rvAnimalList.setLayoutManager(layoutManager);
        rvAnimalList.setAdapter(animalRecyclerViewAdapter);
        rvAnimalList.addItemDecoration(dividerItemDecoration);


    }

    public void initWaterList(){
        birdArrayList.add(new Animal("Eagle","Great American Eagles", R.drawable.eagle));
        birdArrayList.add(new Animal("Parrot", "They like to talk back", R.drawable.parrot));
        birdArrayList.add(new Animal("Woodpeckers", "Woody and friends", R.drawable.woodpecker));
        birdArrayList.add(new Animal("Falcons", "Better than the football team", R.drawable.falcon));
        birdArrayList.add(new Animal("Owls", "They're a hoot",R.drawable.owl));

    }


}
