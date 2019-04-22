package com.shenhu.hotel.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public abstract class BaseRestController {

    @Value("${server.port}")
    String port="";

    public String  getServerPort(){
        return port;
    }
}
