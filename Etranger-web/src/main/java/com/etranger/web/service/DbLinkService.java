package com.etranger.web.service;


import org.springframework.stereotype.Component;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.*;


public interface DbLinkService {

    String dbLinkTest(String id);
}
