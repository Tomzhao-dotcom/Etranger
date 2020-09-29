package com.etranger.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TableController {

    @RequestMapping("/pages/general-table")
    public String generalTable() {
        return "pages/table/general-table";
    }

    @RequestMapping("/pages/data-tables")
    public String dataTable() {
        return "pages/table/data-tables";
    }
}
