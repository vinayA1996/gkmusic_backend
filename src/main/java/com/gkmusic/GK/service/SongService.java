package com.gkmusic.GK.service;

import com.gkmusic.GK.model.Song;

import java.util.List;

public interface SongService {

    public Song saveSong(Song song);
    public List<Song> getSong();
    public  Song getSongId(String id);
}
