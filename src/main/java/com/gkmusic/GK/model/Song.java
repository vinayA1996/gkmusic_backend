package com.gkmusic.GK.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Song {
    @Id
    private String id;
    private String name;
    private List<String> images;
    private String releaceDate;
    private double duration;
    private  Status status;
    private List<Person> writers;
    private List<Person> directors;
    private List<Person> composers;
    private List<Person> actors;

}
