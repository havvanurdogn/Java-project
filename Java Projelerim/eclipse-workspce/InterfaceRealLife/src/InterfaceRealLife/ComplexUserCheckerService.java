package InterfaceRealLife;

public class ComplexUserCheckerService implements IUserCheck{
	
	

	
	public boolean UserCheck(User user) {
		if(user.getAge() >= 18 && user.getName().startsWith("A")) {
			return true;
		}
		return false;
	}
	
}
