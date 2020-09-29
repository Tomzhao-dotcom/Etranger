package com.etranger.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/pages/blank-page")
    public String blank() {
        return "/pages/page/blank-page";
    }

    @RequestMapping("/pages/blank-page-header")
    public String blankHeader() {
        return "/pages/page/blank-page-header";
    }

    @RequestMapping("/pages/login")
    public String login() {
        return "pages/page/login";
    }

    @RequestMapping("/pages/404-page")
    public String missing() {
        return "/pages/page/404-page";
    }

    @RequestMapping("/pages/sign-up")
    public String signUp() {
        return "/pages/page/sign-up";
    }

    @RequestMapping("/pages/forgot-password")
    public String forgotPassword() {
        return "/pages/page/forgot-password";
    }

    @RequestMapping("/pages/pricing")
    public String pricing() {
        return "/pages/page/pricing";
    }

    @RequestMapping("/pages/timeline")
    public String timeline() {
        return "/pages/page/timeline";
    }

    @RequestMapping("/pages/calendar")
    public String calendar() {
        return "/pages/page/calendar";
    }

    @RequestMapping("/pages/sortable-nestable-lists")
    public String sortable() {
        return "/pages/page/sortable-nestable-lists";
    }

    @RequestMapping("/pages/widgets")
    public String widgets() {
        return "/pages/page/widgets";
    }

    @RequestMapping("/pages/media-object")
    public String mediaObject() {
        return "/pages/page/media-object";
    }

    @RequestMapping("/pages/cropper-image")
    public String cropperImage() {
        return "/pages/page/cropper-image";
    }

    @RequestMapping("/pages/color-picker")
    public String colorPicker() {
        return "/pages/page/color-picker";
    }

}
