package com.etranger.web.controller.source;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.etranger.web.entity.MdmpartnerEntity;
import com.etranger.web.service.MDMPartnerService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RestController
@Produces( MediaType.APPLICATION_JSON )
@Consumes( MediaType.APPLICATION_JSON )
public class PartnerController {

    @Resource
    MDMPartnerService partnerService;

    @RequestMapping( "/findAll" )
    public List<MdmpartnerEntity> findAll() {
        return partnerService.findAll();
    }

    @RequestMapping( path = "/get", method = RequestMethod.POST )
    public String get(@RequestBody String data) {
        System.out.println(data);
        return "";
    }
}
