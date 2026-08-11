package com.sage.service;

import java.util.List;

public interface AlbumService {
 
    Album save(Album a);

    Album findById(int id) throws AlbumNotFoundException;

    List<Album> listAll();

    Album findByTitle(String title) throws AlbumNotFoundException;

    List<Album> findByArtist(String artist);

    List<Album> findByGenre(String genre);

    List<Album> findByRating(double min, double max);

    boolean delete(int id) throws AlbumNotFoundException;
}