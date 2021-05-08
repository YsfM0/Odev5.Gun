package Odev5.Gun.business.abstracts;

import Odev5.Gun.entities.concretes.User;

public interface ControlService {
	boolean CheckUser (User user);
	boolean CheckEmail(User user);

}
