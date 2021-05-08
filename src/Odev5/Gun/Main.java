package Odev5.Gun;
import Odev5.Gun.business.abstracts.UserService;
import Odev5.Gun.business.concretes.ControlManager;
import Odev5.Gun.business.concretes.UserManager;
import Odev5.Gun.core.concerts.EmailManager;
import Odev5.Gun.core.concerts.GoogleManagerAdapter;
import Odev5.Gun.dataAccess.concretes.AbcUserDao;
import Odev5.Gun.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user5 = new User(1, "yusuf", "mehmetoglu", "yusuf@gmail.com", "123456");
//		User user2 = new User(2, "muhsin", "keskin", "mail@gmail.com", "789456");
		
		UserService userService = new UserManager(new AbcUserDao(), new ControlManager(new AbcUserDao()), new EmailManager(), new GoogleManagerAdapter());
		
		userService.add(user5);
		
		System.out.println("**********************************");
//		userService.add(user2);
		//userService.add(user2);
		userService.login("yusuf@gmail.com", "123456", user5);
//		

	
	}

}
