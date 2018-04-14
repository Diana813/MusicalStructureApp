package com.example.android.musicalstructureapp;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.musicalstructureapp.databinding.SongsListBinding;

import java.util.ArrayList;


public class ClassicList extends AppCompatActivity {

     SongsListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.songs_list);
        //Create an array of songs

        ArrayList<Songs> songs = new ArrayList<Songs>();
        songs.add(new Songs("Fryderyk Chopin", "Nocturne op.9 No.2"));
        songs.add(new Songs("Fryderyk Chopin", "Funeral march"));
        songs.add(new Songs("Fryderyk Chopin", "Nocturne op.72 No.1"));
        songs.add(new Songs("Fryderyk Chopin", "Polonaise As-major op.53 "));
        songs.add(new Songs("Fryderyk Chopin", "Nocturne op.48 No.1"));
        songs.add(new Songs("Fryderyk Chopin", "Etude C-minor op.10 No.12"));
        songs.add(new Songs("Fryderyk Chopin", "Fantaisie Impromptu"));
        songs.add(new Songs("Fryderyk Chopin", "Scherzo op.31 No.2"));
        songs.add(new Songs("Fryderyk Chopin", "Prelude op.28 No.15"));
        songs.add(new Songs("Fryderyk Chopin", "Mazurka op.41 No.2"));

        SongsAdapter adapter = new SongsAdapter(this, songs);

        binding.list.setAdapter(adapter);
    }
}