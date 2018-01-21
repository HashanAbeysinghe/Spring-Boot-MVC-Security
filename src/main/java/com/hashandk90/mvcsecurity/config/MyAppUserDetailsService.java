package com.hashandk90.mvcsecurity.config;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hashandk90.mvcsecurity.models.UserInfo;
import com.hashandk90.mvcsecurity.repositories.UserInfoRepo;

@Service
public class MyAppUserDetailsService implements UserDetailsService {
	private static final short enabled = 1;

	@Autowired
	private UserInfoRepo userInfoRepo;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		UserInfo activeUserInfo = userInfoRepo.findByUserNameAndEnabled(userName, enabled).get(0);
		GrantedAuthority authority = new SimpleGrantedAuthority(activeUserInfo.getRole());
		UserDetails userDetails = (UserDetails) new User(activeUserInfo.getUserName(), activeUserInfo.getPassword(),
				Arrays.asList(authority));
		
		return userDetails;
	}
}