package com.in.designpattern.composite;

public abstract class SongComponent {

    public void add(SongComponent newSongComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(SongComponent songComponent){
        throw new UnsupportedOperationException();
    }

}
