package ArrayPrimitive;

public class ArrayUserDefined {
	public static void main(String[] args) {
		
		student [] students=new student[10];
		for(int i=0;i<10;i++)
		{
			students[i]=new student();
			students[i].rollnumber=50+i;
			students[i].name="student"+i;
			students[i].address="Address"+i;
			students[i].email="Email"+i;
			students[i].mobileno="Mobile"+i;
		}
		for(int i=0;i<10;i++){
			System.out.println("Roll no:"+students[i].rollno+"Name:"+students[i].name+"Address:"+students[i].address+"Email:"+students[i].email+"Mobile:"+students[i].mobileno);
		}

}
}