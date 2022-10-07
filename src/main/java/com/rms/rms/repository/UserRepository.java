package com.rms.rms.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rms.rms.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
	
	@Query("from User where username=:username")
	 List<User> findByName(@Param(value = "user_name") String user_name);

}
