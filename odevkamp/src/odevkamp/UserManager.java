package odevkamp;

public class UserManager {

	public void add(User user) {
	
		System.out.println(user.getName()+" "+user.getLastName()+ " adlý kullanýcý eklendi."+"\n"+
	                       user.getEmail()+" ve þifreniz ile giriþ yapabilirsiniz."+"\n");
	}
	
	public void addMultiple(User[] users) {
		
		for(User user:users) {
			add(user);
		}	
	}
	
	public void Update(User user) {
		System.out.println(user.getName() +" adlý kullanýcý güncellenmiþtir.");
	}
	
	public void Delete(User user) {
		System.out.println(user.getName() +" adlý kullanýcý silinmiþtir.");
	}
	
	
}