package com.example.springSecurity.Services;

import com.example.springSecurity.Repositories_Dao.UserRepository;
import com.example.springSecurity.UserDetailsPrinciple;
import com.example.springSecurity.models.ct_user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        ct_user user=repo.findAllByUsername(username);
        if(user==null)
            throw new UsernameNotFoundException("User Not Found");
        return new UserDetailsPrinciple(user);
    }
}
