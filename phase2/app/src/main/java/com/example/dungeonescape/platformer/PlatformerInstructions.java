package com.example.dungeonescape.platformer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dungeonescape.activities.GeneralGameActivity;
import com.example.dungeonescape.player.PlayerManager;
import com.example.dungeonescape.player.Player;
import com.example.dungeonescape.R;

public class PlatformerInstructions extends GeneralGameActivity {

    Player player;
    PlayerManager playerManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_platformer_main);
        setTitle("Level3: Platformer");
        // getting player instance from intent
        Intent i = getIntent();
        player = (Player) i.getSerializableExtra("Player");
        playerManager = (PlayerManager) i.getSerializableExtra("Game Manager");
        configureNextButton();
    }

    private void configureNextButton() {
        Button nextButton = (Button) findViewById(R.id.startButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(PlatformerInstructions.this, PlatformerMainActivity.class);
                intent.putExtra("Player", player);
                intent.putExtra("Game Manager", playerManager);
                startActivity(intent);
            }
        });


    }
}