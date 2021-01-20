package com.demoAPI.demoAPI;

import com.demoAPI.demoAPI.modals.ct_user;
import org.springframework.data.repository.CrudRepository;

public interface APIUserRepository extends CrudRepository<ct_user,String> {
}
