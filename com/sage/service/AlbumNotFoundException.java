package com.sage.service;

public class AlbumNotFoundException extends Exception {
    public AlbumNotFoundException() {
        super();
    }

    public AlbumNotFoundException(String message) {
        super(message);
    }
}
