package com.etranger.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IconController {

    @RequestMapping("/pages/icon-fontawesome")
    public String fontawesome() {
        return "pages/icon/icon-fontawesome";
    }

    @RequestMapping("/pages/icon-material")
    public String material() {
        return "pages/icon/icon-material";
    }

    @RequestMapping("/pages/icon-simple-lineicon")
    public String lineicon() {
        return "pages/icon/icon-simple-lineicon";
    }

    @RequestMapping("/pages/icon-themify")
    public String themify() {
        return "pages/icon/icon-themify";
    }

    @RequestMapping("/pages/icon-flag")
    public String flag() {
        return "pages/icon/icon-flag";
    }

    @RequestMapping("/pages/icon-weather")
    public String weather() {
        return "pages/icon/icon-weather";
    }
}
