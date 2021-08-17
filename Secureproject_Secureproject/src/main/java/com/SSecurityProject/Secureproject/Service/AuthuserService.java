package com.SSecurityProject.Secureproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.SSecurityProject.Secureproject.Domain.Registrant;
import com.SSecurityProject.Secureproject.Domain.Systemuser;
import com.SSecurityProject.Secureproject.Domain.Userprincipal;
import com.SSecurityProject.Secureproject.Repository.RegistrantRepository;
import com.SSecurityProject.Secureproject.Repository.SystemuserRepository;

@Service
public class AuthuserService implements UserDetailsService{

	 @Autowired
	 private SystemuserRepository userDao;
	 
	 @Autowired
	 private RegistrantRepository regrepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		/*
		 * Optional<Systemuser> optionalUser = userDao.findByUuid(username); if
		 * (optionalUser.isPresent()) { return optionalUser.get(); } else { throw new
		 * UsernameNotFoundException("Incorrect credentials"); }
		 */
		Systemuser systemuser = userDao.findByUsername(username);
		if(systemuser==null) 
			throw new UsernameNotFoundException("User 404");
		
			return systemuser;
		
		
	}

}
