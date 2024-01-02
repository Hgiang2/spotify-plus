package com.codegym.spotify.controller;

import com.codegym.spotify.model.Album;
import com.codegym.spotify.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AlbumController {
    private AlbumService albumService;
    @Autowired
    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }
    @GetMapping({"/album"})
    public String listAlbum(Model model) {
        List<Album> albums = albumService.findAllAlbum();
        model.addAttribute("albums", albums);
        return "album-list";
    }
}
