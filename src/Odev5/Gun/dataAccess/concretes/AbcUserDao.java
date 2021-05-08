package Odev5.Gun.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import Odev5.Gun.dataAccess.abstracts.UserDao;
import Odev5.Gun.entities.concretes.User;

public class AbcUserDao implements UserDao{
	
	

	@Override
	public void add(User user) {
		System.out.println("Sisteme eklendi " + user.getFirstName());
		
	}
	
	public List<User> getUserList(){
		User user1 = new User(1, "mehmet", "mehmetoglu", "mehmet@gmail.com", "616161");
		User user2 = new User(1, "zeynep", "mehmetoglu", "zeynep@gmail.com", "987654");
		User user3 = new User(1, "mehmet", "mehmetoglu", "ayþe@gmail.com", "123456");
		
		
		List<User> users = new ArrayList<User>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		return users;
		
	}


}
