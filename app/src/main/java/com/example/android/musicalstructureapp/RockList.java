package com.example.android.musicalstructureapp;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.android.musicalstructureapp.databinding.SongsListBinding;

import java.util.ArrayList;

public class RockList extends AppCompatActivity {

    SongsListBinding binding;
    private int i = 0;
    private int p = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.songs_list);

        //Create an array of songs
        final ArrayList<Songs> songs = new ArrayList<Songs>();
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

        final SongsAdapter adapter = new SongsAdapter(this, songs);
        binding.list.setAdapter(adapter);

        //Create an array of images
        final ArrayList<Integer> images = new ArrayList<>();
        images.add(R.drawable.metallica);
        images.add(R.drawable.crazy);
        images.add(R.drawable.believer);
        images.add(R.drawable.kaleo);
        images.add(R.drawable.human);
        images.add(R.drawable.legendary);
        images.add(R.drawable.sky_is_a_neighborhood);
        images.add(R.drawable.back_to_black);
        images.add(R.drawable.manson);
        images.add(R.drawable.muse);

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
