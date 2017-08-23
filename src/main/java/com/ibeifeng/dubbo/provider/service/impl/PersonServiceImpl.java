package com.ibeifeng.dubbo.provider.service.impl;


import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.ibeifeng.dubbo.model.Peron;
import com.ibeifeng.dubbo.service.IPersonService;

@Component
@Service(interfaceClass=IPersonService.class)
public class PersonServiceImpl implements IPersonService {

    public String sayHello(String name) {
        return "hello "+name;
    }

    public Peron findUserById(Integer id) {
        Peron user=new Peron(1, "to", 23);
        return user;
    }

}
