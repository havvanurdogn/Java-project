package calisma;
import java.util.Scanner;
public class entrysystem {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Welcome to website.");
		System.out.println("****************************************************************");
		System.out.println("Please enter user name and password correctly to log in.");
		System.out.println("****************************************************************");
		String user = "Havvanur Dogan";
		String password = "78964";
		
		int access_enter = 3;
		while(true) {
			System.out.print("Please enter your user name: ");
			String user_enter = read.nextLine();
			System.out.print("Please enter your password: ");
			String password_enter = read.nextLine();
			if( user.equals(user_enter) && password.equals(password_enter))
			{
				System.out.println("Successful, logged in.");
				break;
				
			}
			else if(user.equals(user_enter) && !password.equals(password_enter))
			{
				System.out.println("You entered wrong password.");
				access_enter --;
				System.out.println("You can try "+access_enter+" times.");
			}
			else if(!user.equals(user_enter) && password.equals(password_enter))
			{
				System.out.println("You entered wrong user name.");
				access_enter --;
				System.out.println("You can try "+access_enter+" times.");
			}
			else 
			{
				System.out.println("You entered wrong user name and password.");
				access_enter --;
				System.out.println("You can try "+access_enter+" times.");
			}
			if(access_enter==0) break;
			
		}

	}

}
