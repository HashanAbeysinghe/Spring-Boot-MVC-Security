package com.hashandk90.mvcsecurity.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hashandk90.mvcsecurity.models.UserInfo;

@Repository
public interface UserInfoRepo extends JpaRepository<UserInfo, String>{
	List<UserInfo> findByUserNameAndEnabled(String userName, Short enabled);
}
