package com.basic.service.impl;

import com.basic.service.BasicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BasicServiceImpl implements BasicService {
    private static Logger logger = LoggerFactory.getLogger( BasicServiceImpl.class );
    @Override
    public Map<String, Object> query() {
        try{

        }catch (Exception e){
           throw e;
        }
        return null;
    }
}
