package com.demoAPI.demoAPI;


import com.demoAPI.demoAPI.modals.ct_user;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Log4j2
public class APIService {

    @Autowired
    private APIUserRepository userRepository;

    public List<ct_user> getAllUsers()
    {
        log.trace("---getAllUsers------");
        List<ct_user> userRecords = new ArrayList<>();
        userRepository.findAll().forEach(userRecords::add);
        log.trace("---getAllUsers done------");
        return userRecords;
    }
}
