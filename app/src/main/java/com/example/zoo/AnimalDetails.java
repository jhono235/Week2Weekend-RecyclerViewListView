package com.example.zoo;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AnimalDetails extends AppCompatActivity {

    TextView tvAnimalName;
    TextView tvAnimalDescription;
    ImageView ivAnimalPicture;
    Button btnSound;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_details);

        Intent passedIntent = getIntent();
        Animal animal = passedIntent.getParcelableExtra("animal");

        tvAnimalName = findViewById(R.id.tvAnimalDetailName);
        tvAnimalDescription = findViewById(R.id.tvAnimalDetailDetails);
        ivAnimalPicture = findViewById(R.id.ivAnimalDetailPicture);
        btnSound = findViewById(R.id.btnPlaySound);

        tvAnimalName.setText(animal.getName());
        tvAnimalDescription.setText(animal.getDescription());
        ivAnimalPicture.setImageResource(animal.getPicture());




    }

    public void onClick(View view) {
        {
            switch (tvAnimalName.getText().toString()) {

                case "Whale" :
                    MediaPlayer mp = MediaPlayer.create(this, R.raw.whale1);
                    mp.start();
                    break;
                case "Dolphin":
                    mp = MediaPlayer.create(this, R.raw.dolphin);
                    mp.start();
                    break;
                case "Penguin":
                    mp = MediaPlayer.create(this, R.raw.penguin);
                    mp.start();
                    break;
                case "Fish":
                    mp = MediaPlayer.create(this, R.raw.fish);
                    mp.start();
                    break;
                case "Turtle":
                    mp = MediaPlayer.create(this, R.raw.turtle);
                    mp.start();
                    break;
                case "Snakes" :
                    mp = MediaPlayer.create(this, R.raw.snakes);
                    mp.start();
                    break;
                case "Lizards":
                    mp = MediaPlayer.create(this, R.raw.lizard);
                    mp.start();
                    break;
                case "Dragons":
                    mp = MediaPlayer.create(this, R.raw.dragon);
                    mp.start();
                    break;
                case "Alligators":
                    mp = MediaPlayer.create(this, R.raw.alligator);
                    mp.start();
                    break;
                case "Frogs":
                    mp = MediaPlayer.create(this, R.raw.frog);
                    mp.start();
                    break;
                case "Eagle" :
                    mp = MediaPlayer.create(this, R.raw.eagle);
                    mp.start();
                    break;
                case "Parrot":
                    mp = MediaPlayer.create(this, R.raw.parrot);
                    mp.start();
                    break;
                case "Woodpeckers":
                    mp = MediaPlayer.create(this, R.raw.woodpecker);
                    mp.start();
                    break;
                case "Falcons":
                    mp = MediaPlayer.create(this, R.raw.falcon);
                    mp.start();
                    break;
                case "Owls":
                    mp = MediaPlayer.create(this, R.raw.owl);
                    mp.start();
                    break;
                case "Lions" :
                    mp = MediaPlayer.create(this, R.raw.lion);
                    mp.start();
                    break;
                case "Tigers":
                    mp = MediaPlayer.create(this, R.raw.tiger);
                    mp.start();
                    break;
                case "Monkeys":
                    mp = MediaPlayer.create(this, R.raw.monkey);
                    mp.start();
                    break;
                case "Hippo":
                    mp = MediaPlayer.create(this, R.raw.hippo);
                    mp.start();
                    break;
                case "Elephants":
                    mp = MediaPlayer.create(this, R.raw.elephant);
                    mp.start();
                    break;



            }
        }
    }
}
