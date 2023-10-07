
public class Passenger {
	public static void main(String [] args) {
		
	
	int n =5;
	
	if(n>0 && n<=5) {
		System.out.println("No Ticket");
	}
	
	else if(n>5 && n<=10) {
		System.out.println("Half Ticket");
	}
	
	else if(n>10 && n<=50) {
		System.out.println("Full Ticket");
	}
	
	else if  (n>50){
		System.out.println("Half Ticket");
	}	
}
}