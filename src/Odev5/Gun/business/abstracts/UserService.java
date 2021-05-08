package Odev5.Gun.business.abstracts;

import Odev5.Gun.entities.concretes.User;

public interface UserService {
	
	void add(User user);
	void login(String email,  String password, User user);


}
