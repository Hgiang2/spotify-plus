package com.codegym.spotify.controller;

import com.codegym.spotify.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    private IndexService indexService;

    @Autowired
    public IndexController(IndexService indexService) {
        this.indexService = indexService;
    }
    @GetMapping({"/", "/index"})
    public String displayIndex(){
        return "index";
    }
}
