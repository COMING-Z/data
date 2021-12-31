package com.basic.controller;

import com.basic.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/basic")
public class BasicController {

    @Autowired
    private BasicService basicService;

    @Value( "${server.port}" )
    String port;
    @PostMapping("/query")
    public Map<String,Object> query(@RequestBody Map<String,Object> map ){
        HashMap map1 = new HashMap();
        map1.put("tuo",port);
        return map1;
    }
}
