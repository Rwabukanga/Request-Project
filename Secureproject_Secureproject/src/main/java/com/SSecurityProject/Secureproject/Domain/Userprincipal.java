package com.SSecurityProject.Secureproject.Domain;

import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class Userprincipal implements UserDetails{

	private Systemuser systemuser;
	
	@Autowired
	private Registrant registrant;
	
	/*
	 * public Userprincipal(Systemuser systemuser) { super(); this.systemuser =
	 * systemuser; }
	 */
	
	public Userprincipal(Registrant systemuser) {
		super();
		this.registrant = systemuser;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return Collections.singleton(new SimpleGrantedAuthority("Admin"));
		
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return systemuser.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return systemuser.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
