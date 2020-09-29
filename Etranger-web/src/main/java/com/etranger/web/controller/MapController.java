package com.etranger.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MapController {

    @RequestMapping("/pages/map-google")
    public String google() {
        return "pages/map/map-google";
    }

    @RequestMapping("/pages/map-vector")
    public String vector() {
        return "pages/map/map-vector";
    }
}
