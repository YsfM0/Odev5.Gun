package Odev5.Gun.business.concretes;


import java.util.List;
import java.util.regex.Pattern;
import Odev5.Gun.business.abstracts.ControlService;
import Odev5.Gun.dataAccess.abstracts.UserDao;
import Odev5.Gun.dataAccess.concretes.AbcUserDao;
import Odev5.Gun.entities.concretes.User;

public class ControlManager implements ControlService {
	String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
	Pattern pattern = Pattern.compile(regex);
		
	
	private UserDao userDao;
	
	public ControlManager(UserDao userDao) {
		super();
		this.userDao = userDao;
		}
	

	@Override
	public boolean CheckUser(User user) {
		
		if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println(
					"En az 2 karakterden oluþmalýdýr.  > " + user.getFirstName() + " -- " + user.getLastName());
			return false;
		}
		
		else if (user.getPassword().length() < 6) {
			System.out.println("Parola en az 6 karaktwerden oluþmalýdýr. ");
			return false;
		}
		else if (!pattern.matcher(user.getEmail()).matches()) {
			System.out.println("geçersiz mail");
			return false;
		}
		
	
		return true;
		
	
	}

	AbcUserDao abc = new AbcUserDao();

	@Override
	public boolean CheckEmail(User user) {
		for (User userControl : abc.getUserList()) {
			if(user.getEmail().equals(userControl.getEmail())) {
				System.out.println("Bu mail adresine sahip kullanýcý zaten var.");
				return false;
			}
			
		}
		return true;
	}





}
