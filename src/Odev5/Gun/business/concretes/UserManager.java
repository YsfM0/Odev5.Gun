package Odev5.Gun.business.concretes;


import Odev5.Gun.business.abstracts.ControlService;
import Odev5.Gun.business.abstracts.UserService;
import Odev5.Gun.core.abstracts.EmailService;
import Odev5.Gun.core.abstracts.GoogleService;
import Odev5.Gun.dataAccess.abstracts.UserDao;
import Odev5.Gun.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private ControlService controlService;
	private EmailService emailService;
	private GoogleService googleService;


	public UserManager(UserDao userDao, ControlService controlService, EmailService emailService,
			GoogleService googleService) {
		this.userDao = userDao;
		this.controlService = controlService;
		this.emailService = emailService;
		this.googleService = googleService;
		
	}

	@Override
	public void add(User user) {
		if (controlService.CheckUser(user) == false) {
			return;
		}
		
		if (controlService.CheckEmail(user)==false) {
			return;
			
		}
		

		this.userDao.add(user);
		this.googleService.addToSystem(user);
		this.emailService.sendMail(user.getEmail());

	}

	@Override
	public void login(String email, String password, User user) {
		if(email == user.getEmail() && password == user.getPassword()){
            System.out.println("Baþarýlý þekilde  giriþ yapýldý");
        }else {
            System.out.println("Bilgilerini kontrol ediniz. Mail yada password hatalý");
        }

	}

}
