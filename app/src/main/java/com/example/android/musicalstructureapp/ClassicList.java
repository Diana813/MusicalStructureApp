package com.example.android.musicalstructureapp;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.android.musicalstructureapp.databinding.SongsListBinding;

import java.util.ArrayList;


public class ClassicList extends AppCompatActivity {

    SongsListBinding binding;
    private int i = 0;
    private int p = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.songs_list);
        //Create an array of songs

        final ArrayList<Songs> songs = new ArrayList<Songs>();
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

        //Create an array of images
        final ArrayList<Integer> images = new ArrayList<>();
        images.add(R.drawable.chopin1);
        images.add(R.drawable.chopin2);
        images.add(R.drawable.chopin3);
        images.add(R.drawable.chopin4);
        images.add(R.drawable.chopin5);
        images.add(R.drawable.chopin6);
        images.add(R.drawable.choipn7);
        images.add(R.drawable.chopin8);
        images.add(R.drawable.chopin9);
        images.add(R.drawable.chopin10);

        //Set on click Listener to the play Button
        binding.play.setOnClickListener(new View.OnClickListener() {
            //This method will be executed when the play button is clicked on.
            @Override
            public void onClick(View view) {
                p++;
                if (p % 2 == 0) {
                    binding.play.setImageResource(R.drawable.ic_play_arrow_black_24dp);
                } else {
                    binding.play.setImageResource(R.drawable.ic_pause_black_24dp);
                }
            }
        });
        //This method shows the title of the first song on your playlist
        binding.title.setText(songs.get(0).getSongTitle() + " " + songs.get(0).getSongAuthor());

        //This method shows the picture to the first song on your playlist
        binding.songImage.setImageResource(images.get(0));

        //This method will be executed when skipNext button is clicked on.
        binding.skipNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                if (i < songs.size()) {
                    binding.title.setText(songs.get(i).getSongTitle() + " " + songs.get(i).getSongAuthor());
                    binding.songImage.setImageResource(images.get(i));
                } else {
                    i = -1;
                }
            }
        });
        //This method will be executed when skipPrevious button is clicked on.
        binding.skipPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i--;
                if (i > -1) {
                    binding.title.setText(songs.get(i).getSongTitle() + " " + songs.get(i).getSongAuthor());
                    binding.songImage.setImageResource(images.get(i));
                }
                if (i < 1) {
                    i = songs.size();
                }
            }
        });

    }

}