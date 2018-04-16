package com.example.android.musicalstructureapp;

import android.databinding.DataBindingUtil;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.musicalstructureapp.databinding.SongsListBinding;

import java.util.ArrayList;
import java.util.ListIterator;

public class RockList extends AppCompatActivity {

    SongsListBinding binding;

    int i = 0;

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


        binding.play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                binding.play.setImageResource(R.drawable.ic_pause_black_24dp);
            }
        });
        //This method shows the title of the first song on your playlist
        binding.title.setText(songs.get(0).getSongTitle() + " " + songs.get(0).getSongAuthor());

        //This method will be executed when skipNext button is clicked on.
        binding.skipNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                if (i < songs.size()) {
                    binding.title.setText(songs.get(i).getSongTitle() + " " + songs.get(i).getSongAuthor());
                }else{
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
                }
                if (i < 1) {
                    i = songs.size();
                }
            }
        });

    }

}
