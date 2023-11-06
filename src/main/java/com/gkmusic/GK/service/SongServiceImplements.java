package com.gkmusic.GK.service;

import com.gkmusic.GK.model.Song;
import com.gkmusic.GK.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImplements implements SongService {

    private SongRepository songRepository;

    @Autowired
    public SongServiceImplements(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @Override
    public Song saveSong(Song song) {

        return songRepository.save(song);
    }

    @Override
    public List<Song> getSong() {
        return songRepository.findAll();
    }

    @Override
    public Song getSongId(String id) {
        return songRepository.findById(id).get();
    }
}
