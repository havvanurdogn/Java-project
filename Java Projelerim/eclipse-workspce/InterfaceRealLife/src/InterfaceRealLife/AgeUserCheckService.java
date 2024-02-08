package InterfaceRealLife;

public class AgeUserCheckService implements IUserCheck{
	
	
	public boolean UserCheck(User user) {
		if(user.getAge() >= 18) {
			return true;
		}
		return false;
	}
	

}
