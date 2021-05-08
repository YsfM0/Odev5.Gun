package Odev5.Gun.Google;

import Odev5.Gun.entities.concretes.User;

public class GoogleManager {
	public void add (User user) {
		System.out.println("Goole hesabý ile sisteme eklendi.  " + user.getFirstName() +" "+user.getLastName() + " " + user.getEmail());
		System.out.println("**********************************");
	}

}
