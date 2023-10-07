package array_learning;

public class ArrayPrimitive {
	
	public static void main(String[]args) {
		int[] rollNumber = new int[10]; //Array
		for(int i=0;i<10;i++) 
		{
			rollNumber[i]=i+100;
		}
		
		String[] names = new String[10];
		names[0]="Kartik";
		names[1]="Hemant";
		names[2]="Shree";
		names[3]="Karan";
		names[4]="Rameshwar";
		names[5]="Sajal";
		names[6]="Sarfraj";
		names[7]="Mayur";
		names[8]="Ravi";
		names[9]="Dnyaneshwar";
		
		
		String[] address = new String[10];
		address[0]="Beed";
		address[1]="Nager";
		address[2]="Nashik";
		address[3]="Tirupati";
		address[4]="Parbhani";
		address[5]="Bhandara";
		address[6]="Karad";
		address[7]="Aashti";
		address[8]="Wadgaon";
		address[9]="Parbhani";
		
		for(int i=0;i<10;i++)
		{
			System.out.println("RollNumber:"+rollNumber[i]+"Name:"+names[i]+"Address:"+address[i]);
		}
		
	}

}
