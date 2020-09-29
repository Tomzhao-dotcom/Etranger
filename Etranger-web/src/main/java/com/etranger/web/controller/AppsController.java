package com.etranger.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AppsController {

    @RequestMapping("/pages/inbox")
    public String inbox() {
        return "pages/app/inbox";
    }

    @RequestMapping("/pages/email-details")
    public String emailDetails() {
        return "pages/app/email-details";
    }

    @RequestMapping("/pages/email-compose")
    public String emailCompose() {
        return "pages/app/email-compose";
    }

    @RequestMapping("/pages/message-chat")
    public String messageChat() {
        return "pages/app/message-chat";
    }
}
