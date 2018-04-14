package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.android.musicalstructureapp.databinding.ActivityMyPlaylistsBinding;

public class MyPlaylists extends AppCompatActivity {

    ActivityMyPlaylistsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_my_playlists);

        // Set a click listener
        binding.chooseThePlaylist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the rock list is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RockList}
                Intent playlistsIntent = new Intent(MyPlaylists.this, RockList.class);

                // Start the new activity
                startActivity(playlistsIntent);
            }
        });

        // Set a click listener
        binding.rockowo.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the image rock is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RockList}
                Intent rockIntent = new Intent(MyPlaylists.this, RockList.class);

                // Start the new activity
                startActivity(rockIntent);
            }
        });

        // Set a click listener
        binding.chooseThePlaylist2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the classic list is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ClassicList}
                Intent playlistsIntent = new Intent(MyPlaylists.this, ClassicList.class);

                // Start the new activity
                startActivity(playlistsIntent);
            }
        });

        // Set a click listener
        binding.classic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the  picture classic is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ClassicList}
                Intent classicIntent = new Intent(MyPlaylists.this, ClassicList.class);

                // Start the new activity
                startActivity(classicIntent);
            }
        });
    }
}
