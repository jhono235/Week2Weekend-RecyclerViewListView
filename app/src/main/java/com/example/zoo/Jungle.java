package com.example.zoo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Jungle extends AppCompatActivity {

    RecyclerView rvAnimalList;

    ArrayList<Animal> jungleArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_animals);

        initWaterList();

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        AnimalRecyclerViewAdapter animalRecyclerViewAdapter = new AnimalRecyclerViewAdapter(jungleArrayList);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, ((LinearLayoutManager)layoutManager).getOrientation());


        rvAnimalList = findViewById(R.id.rvWaterAnimalList);
        rvAnimalList.setLayoutManager(layoutManager);
        rvAnimalList.setAdapter(animalRecyclerViewAdapter);
        rvAnimalList.addItemDecoration(dividerItemDecoration);


    }

    public void initWaterList(){
        jungleArrayList.add(new Animal("Lions","The king is here", R.drawable.lion));
        jungleArrayList.add(new Animal("Tigers", "Our tigers are amazing", R.drawable.tiger));
        jungleArrayList.add(new Animal("Monkeys", "The monkeys can play all day", R.drawable.monkey));
        jungleArrayList.add(new Animal("Hippo", "They're always hungry", R.drawable.hippo));
        jungleArrayList.add(new Animal("Elephants", "Dumbo and his friends",R.drawable.elephants));

    }


}
