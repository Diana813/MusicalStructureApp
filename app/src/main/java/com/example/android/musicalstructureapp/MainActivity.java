package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.android.musicalstructureapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // Set a click listener
        binding.startMusic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the "Let's start" is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MyPlaylist}
                Intent preferencesIntent = new Intent(MainActivity.this, MyPlaylists.class);

                // Start the new activity
                startActivity(preferencesIntent);
            }
        });
    }
}
