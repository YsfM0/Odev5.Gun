package Odev5.Gun.core.concerts;

import Odev5.Gun.Google.GoogleManager;
import Odev5.Gun.core.abstracts.GoogleService;
import Odev5.Gun.entities.concretes.User;

public class GoogleManagerAdapter implements GoogleService {

	@Override
	public void addToSystem(User user) {
		GoogleManager googleManager = new GoogleManager();
		googleManager.add(user);
		
		
	}


}
