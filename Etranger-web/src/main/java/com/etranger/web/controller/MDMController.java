package com.etranger.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MDMController {

    @RequestMapping("/mdm/data-source")
    public String dataSource() {
        return "/mdm/data-source";
    }

    @RequestMapping("/mdm/dynamic-hierarchy")
    public String dynamicHierarchy() {
        return "/mdm/dynamic-hierarchy";
    }
}
