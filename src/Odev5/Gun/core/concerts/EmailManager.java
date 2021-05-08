package Odev5.Gun.core.concerts;

import Odev5.Gun.core.abstracts.EmailService;

public class EmailManager implements EmailService{

	@Override
	public void sendMail(String email) {
		System.out.println(email + "adresine mesaj gönderildi" );
		
	}

}
