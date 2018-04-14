package com.example.android.musicalstructureapp;

/**
 * Created by diana on 11.04.2018.
 */

public class Songs {
    /**
     * Author of the song
     */
    private String mSongAuthor;
    /**
     * Title of the song
     */
    private String mSongTitle;
    /**
     * Create a new Song object.
     *
     * @param songAuthor is the author of the song
     * @param songTitle   is the title of the song
     */
    public Songs(String songAuthor, String songTitle) {
        mSongAuthor = songAuthor;
        mSongTitle = songTitle;
    }
    /**
     * Get the song author
     */
    public String getSongAuthor() {
        return mSongAuthor;
    }
    /**
     * Get the song title
     */
    public String getSongTitle() {
        return mSongTitle;
    }

}
