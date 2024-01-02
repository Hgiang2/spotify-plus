package com.codegym.spotify.service.impl;

import com.codegym.spotify.model.Album;
import com.codegym.spotify.repository.AlbumRepository;
import com.codegym.spotify.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {
    private AlbumRepository albumRepository;

    @Autowired
    public AlbumServiceImpl(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @Override
    public List<Album> findAllAlbum() {
        return albumRepository.findAll();
    }
}
