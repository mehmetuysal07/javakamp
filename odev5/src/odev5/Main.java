package odev5;

import odev5.business.abstracts.IUserService;
import odev5.business.concrete.UserManager;
import odev5.core.EmailValidator;
import odev5.dataAccess.concrete.HibernateUserDal;
import odev5.entities.concrete.User;

public class Main {

	public static void main(String[] args) {
		IUserService userService = new UserManager(new HibernateUserDal(), new EmailValidator());
		User user1 = new User(1,"Ali","Cengiz","abc@gmail.com","123456"); 
		User user2 = new User(2,"Mesut","Güneri","abcgmail.com","123456"); 
		User user3 = new User(3,"Tuncer","Yýlmaz","abcd@gmail.com",""); 
		User user4 = new User(4,"Hüsnü","","abcde@gmail.com","123456"); 
		User user5 = new User(5,"","akkaya","abcabc@gmail.com","123456"); 
		User user6 = new User(6,"Hakan","Çýnar","abca@gmail.com","123456"); 
		User user7 = new User(7,"Cemal","Tork","abcabcd@gmail.com","1"); 
		User user8 = new User(8,"Mehmet","Çýnar","abca@gmail.com","123456"); 
		User user9 = new User(8,"Mehmet","Çýnar","","123456");  
		User user10 = new User(8,"Mehmet","Çýnar","abca@gmail.com",""); 
		
		userService.registerWithPersonalInformations(user1);
		userService.registerWithPersonalInformations(user2);
		userService.registerWithPersonalInformations(user3);
		userService.registerWithPersonalInformations(user4);
		userService.registerWithPersonalInformations(user5);
		userService.registerWithPersonalInformations(user6);
		userService.registerWithPersonalInformations(user7);
		userService.registerWithPersonalInformations(user8);
		
		userService.registerWithGoogleAccount(user1);
		
		userService.login(user1);
		userService.login(user9);
		userService.login(user10);
	}

}
