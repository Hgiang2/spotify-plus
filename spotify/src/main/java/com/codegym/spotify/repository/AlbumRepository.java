package com.codegym.spotify.repository;

import com.codegym.spotify.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {

}
