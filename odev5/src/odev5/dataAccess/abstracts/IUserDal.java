package odev5.dataAccess.abstracts;


import odev5.entities.concrete.User;

public interface IUserDal {
	void registerWithPersonalInformations(User user);
	void registerWithGoogleAccount(User user);
	void login(User user);
}


