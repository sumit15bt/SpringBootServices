package com.example.springSecurity.Repositories_Dao;

import com.example.springSecurity.models.ct_user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository implements JpaRepository<ct_user,Integer> {

    public ct_user findAllByUsername(String username) {

    }
}
