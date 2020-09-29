package com.etranger.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class FormController {

    @RequestMapping("/pages/form-elements")
    public String elements() {
        return "pages/form/form-elements";
    }

    @RequestMapping("/pages/form-validation")
    public String validation() {
        return "pages/form/form-validation";
    }

    @RequestMapping("/pages/multiselect")
    public String multiselect() {
        return "pages/form/multiselect";
    }

    @RequestMapping("/pages/datepicker")
    public String datepicker() {
        return "pages/form/datepicker";
    }

    @RequestMapping("/pages/bootstrap-select")
    public String bootstrapSelect() {
        return "pages/form/bootstrap-select";
    }
}
