package com.example.springSecurity.WebControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.ArrayList;
import java.util.List;


// create this class and extends WebSecurityConfigurerAdapter and override  UserDetailsService also Add
// @Configuration
// @EnableWebSecurity
@Configuration
@EnableWebSecurity
public class AppSecurityConfig  extends WebSecurityConfigurerAdapter {
/* this is when not to connect with database---
//    @Bean
//    @Override
//    protected UserDetailsService userDetailsService() {
//        List<UserDetails> userDetails=new ArrayList<>(); // UserDetails is inbuild class.
//        userDetails.add(User.withDefaultPasswordEncoder().username("sumit")
//                .password("sumit1234").roles("USER").build());  // roles("USER") for authorisation purpose. we can many roles.like admin etc.
//        userDetails.add(User.withDefaultPasswordEncoder().username("sandy")
//                .password("sandy1234").roles("USER").build()); // we can add as many we can... till we don't use dataBase.
//
//
//        return new InMemoryUserDetailsManager(userDetails);  // returned InMemoryUserDetailsManager untill we use dataBase.
//    }
 */

//    @Autowired
//    private UserDetailsService userDetailsService;
//
//    @Bean
//    public AuthenticationProvider authenticationProvider(){
//        DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
//        provider.setUserDetailsService(userDetailsService);
////        provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance()); // if no encryption ot hashing. or multilayer hashing(i.e., Bcrypt).
//        provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
//        return provider;
//    }


}
