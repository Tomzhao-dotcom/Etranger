package com.etranger.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UIElementsController {

    @RequestMapping("/pages/cards")
    public String cards() {
        return "pages/ui/cards";
    }

    @RequestMapping("/pages/general")
    public String general() {
        return "pages/ui/general";
    }

    @RequestMapping("/pages/carousel")
    public String carousel() {
        return "pages/ui/carousel";
    }

    @RequestMapping("/pages/listgroup")
    public String listgroup() {
        return "pages/ui/listgroup";
    }

    @RequestMapping("/pages/typography")
    public String typography() {
        return "pages/ui/typography";
    }

    @RequestMapping("/pages/accordions")
    public String accordions() {
        return "pages/ui/accordions";
    }

    @RequestMapping("/pages/tabs")
    public String tabs() {
        return "pages/ui/tabs";
    }

}
