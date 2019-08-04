package com.example.zoo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Reptiles extends AppCompatActivity {

    RecyclerView rvAnimalList;

    ArrayList<Animal> reptileArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_animals);

        initWaterList();

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        AnimalRecyclerViewAdapter animalRecyclerViewAdapter = new AnimalRecyclerViewAdapter(reptileArrayList);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, ((LinearLayoutManager)layoutManager).getOrientation());


        rvAnimalList = findViewById(R.id.rvWaterAnimalList);
        rvAnimalList.setLayoutManager(layoutManager);
        rvAnimalList.setAdapter(animalRecyclerViewAdapter);
        rvAnimalList.addItemDecoration(dividerItemDecoration);


    }

    public void initWaterList(){
        reptileArrayList.add(new Animal("Snakes","We have over 100 species", R.drawable.reptile_snake));
        reptileArrayList.add(new Animal("Lizards", "Lizards from all over the world", R.drawable.reptile_lizard));
        reptileArrayList.add(new Animal("Dragons", "Dragons do exist!", R.drawable.reptiles_dragon));
        reptileArrayList.add(new Animal("Alligators", "Our alligators are from Georgia!", R.drawable.reptiles_alligator));
        reptileArrayList.add(new Animal("Frogs", "Come see the frogs hop around",R.drawable.reptiples_frog));

    }


}
