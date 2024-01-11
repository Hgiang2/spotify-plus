package com.codegym.repository;

import com.codegym.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SongRepository extends JpaRepository<Song, Long> {
    Optional<Song> findByTitle(String url);

}
