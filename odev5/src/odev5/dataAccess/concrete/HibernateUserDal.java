package odev5.dataAccess.concrete;


import odev5.dataAccess.abstracts.IUserDal;
import odev5.entities.concrete.User;

public class HibernateUserDal implements IUserDal {

	@Override
	public void registerWithPersonalInformations(User user) {
		System.out.println("Doðrulama e-postasý gönderildi -> " + user.getEmail());
		System.out.println("Kiþisel bilgiler ile kayýt olundu: " + user.getFirstName());
	}

	@Override
	public void registerWithGoogleAccount(User user) {
		System.out.println("Google hesabý ile kayýt olundu: " + user.getFirstName());
	}

	@Override
	public void login(User user) {
		System.out.println("Giriþ yapýldý: " + user.getFirstName());
	}

}
