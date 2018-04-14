package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by diana on 11.04.2018.
 */


public class SongsAdapter extends ArrayAdapter<Songs> {


    /**
     * A custom constructor.
     */
    public SongsAdapter(Activity SongsAdapter, ArrayList<Songs> songs) {
        super(SongsAdapter, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.playlist_item, parent, false);
        }

        Songs currentSong = getItem(position);

        TextView authorTextView = (TextView) listItemView.findViewById(R.id.author);

        authorTextView.setText(currentSong.getSongAuthor());

        TextView songTextView = (TextView) listItemView.findViewById(R.id.song);
        songTextView.setText(currentSong.getSongTitle());
        return listItemView;
    }
}

