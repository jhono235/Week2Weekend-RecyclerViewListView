package com.example.zoo;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Categories extends AppCompatActivity {
    ListView lvCategories;
    String title [] = {"Water Animals","Reptiles","Birds","Jungle Beasts"};
    int images[] = {R.drawable.water, R.drawable.reptile, R.drawable.bird, R.drawable.jungle};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        lvCategories = findViewById(R.id.lvCategories);



       ListViewAdapter adapter = new ListViewAdapter(this, title,images);

        lvCategories.setAdapter(adapter);





        lvCategories.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        Intent goToWater = new Intent(Categories.this,WaterAnimals.class);
                        startActivity(goToWater);

                        break;
                    case 1:
                        Intent goToReptiles = new Intent(Categories.this,Reptiles.class);
                        startActivity(goToReptiles);
                        break;
                    case 2:
                        Intent goToBirds = new Intent(Categories.this,Birds.class);
                        startActivity(goToBirds);

                    case 3:
                        Intent goToJungle = new Intent(Categories.this,Jungle.class);
                        startActivity(goToJungle);


                }
            }
        });



        }



    class ListViewAdapter extends ArrayAdapter<String> {

        Context context;
        String lvaTitle[];
        int lvaImage [];


        ListViewAdapter (Context c, String title[], int image[] ){
            super(c,R.layout.items, R.id.tvCategory, title);
            this.context = c;
            this.lvaTitle = title;
            this.lvaImage = image;

        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View items = layoutInflater.inflate(R.layout.items,parent,false);
            ImageView images = items.findViewById(R.id.ivImage);
            TextView title = items.findViewById(R.id.tvCategory);


            images.setImageResource(lvaImage[position]);
            title.setText(lvaTitle[position]);



            return items;
        }
    }


}
