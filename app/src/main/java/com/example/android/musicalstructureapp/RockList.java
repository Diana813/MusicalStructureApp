package com.example.android.musicalstructureapp;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.musicalstructureapp.databinding.SongsListBinding;

import java.util.ArrayList;

public class RockList extends AppCompatActivity {

    SongsListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.songs_list);
        //Create an array of songs

        ArrayList<Songs> songs = new ArrayList<Songs>();
        songs.add(new Songs("Metallica", "Whiskey in a jar"));
        songs.add(new Songs("Aerosmith", "Crazy"));
        songs.add(new Songs("Imagine Dragons", "Beliver"));
        songs.add(new Songs("Kaleo", "Way down we go"));
        songs.add(new Songs("Rag'n'Bone Man", "Human"));
        songs.add(new Songs("Welshly Arms", "Legendary"));
        songs.add(new Songs("Foo Fighters", "Sky is a neighborhood"));
        songs.add(new Songs("Amy Winehouse", "Back to black"));
        songs.add(new Songs("Marilyn Manson", "This is the new shit"));
        songs.add(new Songs("Muse", "Uprising"));

        SongsAdapter adapter = new SongsAdapter(this, songs);

        binding.list.setAdapter(adapter);
    }
}
