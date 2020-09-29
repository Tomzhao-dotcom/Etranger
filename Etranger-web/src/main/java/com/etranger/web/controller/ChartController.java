package com.etranger.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ChartController {

    @RequestMapping("/pages/chart-c3")
    public String chart() {
        return "/pages/chart/chart-c3";
    }

    @RequestMapping("/pages/chart-chartist")
    public String chartist() {
        return "/pages/chart/chart-chartist";
    }

    @RequestMapping("/pages/chart-charts")
    public String charts() {
        return "/pages/chart/chart-charts";
    }

    @RequestMapping("/pages/chart-morris")
    public String morris() {
        return "/pages/chart/chart-morris";
    }

    @RequestMapping("/pages/chart-sparkline")
    public String sparkLine() {
        return "/pages/chart/chart-sparkline";
    }

    @RequestMapping("/pages/chart-gauge")
    public String gauge() {
        return "/pages/chart/chart-gauge";
    }
}
