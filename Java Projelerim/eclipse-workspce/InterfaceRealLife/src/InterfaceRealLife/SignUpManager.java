package InterfaceRealLife;

public class SignUpManager {

	private IUserCheck iUserCheck;
	
	public SignUpManager(IUserCheck iUserCheck) {
		super();
		this.iUserCheck = iUserCheck;
	}

	public void signUp (User user) {
		
		//AgeUserCheckService ageUserCheckService = new AgeUserCheckService();
		/*ComplexUserCheckerService complexUserCheckerService = new ComplexUserCheckerService();
		
		if(complexUserCheckerService.UserCheck(user)) {
			System.out.println("Kullanici kayit oldu : "+user.getName());
		}
		else {
			System.out.println("Kullanici kayit olamadi.");
		}*/
		
		if(iUserCheck.UserCheck(user)) {
			System.out.println("Kullanici kayit oldu : "+user.getName());
		}
		else {
			System.out.println("Kullanici kayit olamadi.");
		}
		
	}
}
