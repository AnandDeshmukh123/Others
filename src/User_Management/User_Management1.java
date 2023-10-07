package User_Management;
import java.util.Scanner;

public class User_Management1 {
	static user [] u1=new user[10]; // creating user array to store multiple user data
	static int usercount=0; // setting userCount 0 and will increment it as we create new user
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in); // creating scanner object to get option from user
	boolean canIruntheprogram=true; // created variable to decide should we continue running program or not
	while(canIruntheprogram) { //checking if used asked to existing,if option set as 5
		System.out.println("-------WELCOME TO USER MANAGEMENT------");
		System.out.println("1.Add user");
		System.out.println("2.Edit user");
		System.out.println("3.Delete user");
		System.out.println("4.Search user");
		System.out.println("5.Quit.\n");
		System.out.println("choose option");
		int chooseop=sc.nextInt();
		if(chooseop==5)
		{
			canIruntheprogram=false;
			System.out.println("close program!!!");
		}
		else if(chooseop==1) {
			adduser();
		}
	}
	System.out.println("the store data is");
	for(int i=0;i<10;i++)
	{
		System.out.println(u1[i].name);
	}
}

public static void adduser() 
{
	Scanner sc = new Scanner(System.in);
	u1[usercount]=new user();
	System.out.println("User id:");
	u1[usercount].id=sc.nextLine();
	System.out.println("Employee name:");
	u1[usercount].name=sc.nextLine();
	System.out.println("Create password:");
	String pass=sc.nextLine();
	System.out.println("Confirm password:");
	String conpass=sc.nextLine();
	System.out.println("User Role:");
	u1[usercount]. userrole=sc.nextLine();
	if(pass.equals(conpass))
	{
		System.out.println("Password create successfully....");
		System.out.println("USER ID of EMPLOYEE:" +u1[usercount].id);
		System.out.println("NAME OF EMPLOYEE:"+u1[usercount].name);
		System.out.println("User Role:"+u1[usercount].userrole+"\n\n");
	}
	else {
		System.out.println("confirm password doesn't match,Try again!!!");
	}
	usercount=usercount+1;	
}	


}
