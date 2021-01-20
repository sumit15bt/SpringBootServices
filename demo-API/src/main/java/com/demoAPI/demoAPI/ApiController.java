package com.demoAPI.demoAPI;

import com.demoAPI.demoAPI.modals.*;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/APIHIT")
@Log4j2
public class ApiController {

    @Autowired
    private WebClient.Builder webClientBuilder;
    @Autowired
    private APIService apiService;
    @RequestMapping("/")
    public void Index(){
        System.out.println("APIHITTED-------------->");
    }

    @RequestMapping("/home")
    public String home(){
        System.out.println("----------home");
       return "ok hitted ";
    }
    @RequestMapping("/jpa")
    public List<ct_user> jpa(){
        System.out.println("----------jpa");
        List<ct_user> users=apiService.getAllUsers();
        log.trace(users);
        return users;
    }


}
