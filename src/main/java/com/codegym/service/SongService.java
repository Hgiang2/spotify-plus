package com.codegym.service;

import com.codegym.dto.SongDto;
import java.util.List;

public interface SongService {
    List<SongDto> findAllSongs();
}
