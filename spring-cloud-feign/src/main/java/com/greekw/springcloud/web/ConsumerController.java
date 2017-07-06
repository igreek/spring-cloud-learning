package com.greekw.springcloud.web;

import com.greekw.springcloud.service.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wuwc on 2017/7/6.
 */
@RestController
public class ConsumerController {

    @Autowired
    private ComputeClient computeClient;
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(){
        return computeClient.add(10,20);
    }
}


