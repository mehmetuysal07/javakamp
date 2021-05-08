package odev5.business.abstracts;

import odev5.entities.concrete.User;

public interface IUserService {
	void registerWithPersonalInformations(User user);
	void registerWithGoogleAccount(User user);
	void login(User user);
}
