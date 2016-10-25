package com.drswat.site.site.repository;

import org.springframework.data.repository.CrudRepository;

import com.drswat.site.site.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
