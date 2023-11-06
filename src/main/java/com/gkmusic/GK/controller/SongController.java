package com.gkmusic.GK.controller;

import com.gkmusic.GK.model.Song;
import com.gkmusic.GK.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/song")
public class SongController {

    private SongService songService;
@Autowired
    public SongController(SongService songService) {
        this.songService = songService;
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveSong(@RequestBody Song song){
    return  new ResponseEntity<>(songService.saveSong(song), HttpStatus.CREATED);
    }
    @GetMapping ("/getall")
    public ResponseEntity<?> getAllSong(){
        return  new ResponseEntity<>(songService.getSong(), HttpStatus.OK);
    }

}
