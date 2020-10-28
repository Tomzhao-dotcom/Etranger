package com.etranger.web.controller.source;

import com.etranger.web.service.DbLinkService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RestController
@Produces( MediaType.APPLICATION_JSON )
@Consumes( MediaType.APPLICATION_JSON )
public class DbLinkController {

    @Resource
    DbLinkService dbLinkService;

    @RequestMapping("/source/dbLinkTest")
    public String dblinkTest(String id) {
        return dbLinkService.dbLinkTest(id);
    }
}
