package User_Management;
import java.util.Scanner;
public class User_Management {
	static User u1 = new User();
	
	//****** Main Function ******
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		boolean canIruntheprogram=true; 
		while(canIruntheprogram == true) {
			
			System.out.println("*****WELCOME TO USER MANAGEMENT*****");
			System.out.println("\n");
			
			System.out.println("What would you like to do?");
			System.out.println("1. Add user");
			System.out.println("2. Edit user");
			System.out.println("3. Delete user");
			System.out.println("4. Search user");
			System.out.println("5. Quit");
			
			int optionSelectdByuser = sc.nextInt();
			
			int optionselectedByuser = 0;
			if (optionselectedByuser == 5) {
				System.out.println("!!! program closed");
				boolean CanIKeepRunningTheprogram = false;
			}else if (optionselectedByuser == 1) {
				adduser();
				System.out.println("\n");
			}
		}
   System.out.println("\n");
   System.out.println("****** After while loop");
   System.out.println("User Name:" + u1.userName);
   System.out.println("Login Name:" + u1.loginName);
   System.out.println("Password:" + u1.password);
   System.out.println("Confirm Password:" + u1.ConfirmPassword);
   System.out.println("User Role:" +u1.userrole );
   }
	//****** ADD User Function ******
	public static void adduser() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("User Name");
		u1.userName = sc.nextLine();
		
		System.out.print("Login Name");
		u1.loginName = sc.nextLine();
		
		System.out.print("Password:");
		u1.password = sc.nextLine();
		
		System.out.print("Confirm Password");
		u1.confirmpassword = sc.nextLine();
		
		System.out.print("User Role");
		u1.userRole = sc.nextLine();
		
		System.out.println("User Name" +u1.userName);
		System.out.println("Login Name" +u1.loginName);
		System.out.println("Password" +u1.password);
		System.out.println("Confirm Password" +u1.confirmpassword);
		System.out.println("User Role:" +u1.userRole);
		
		
	
		
	}
}
