package com.etranger.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {

    @RequestMapping({"index", "/"})
    public String index() {
        return "index";
    }

    @RequestMapping("/ecommerce-product")
    public String product() {
        return "ecommerce-product";
    }

    @RequestMapping("/ecommerce-product-single")
    public String productSingle() {
        return "ecommerce-product-single";
    }

    @RequestMapping("/ecommerce-product-checkout")
    public String productCheckOut() {
        return "ecommerce-product-checkout";
    }


}
