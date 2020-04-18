import java.util.Scanner;

class Student
{
	//1st approach
	void searchStudent(int studentId)  //1
	{
		System.out.println("STUDENT ID IS "+studentId);
		System.out.println("STUDENT NAME IS SACHIN");
	}

	//2nd approach
	void searchStudent(String name)  //1
	{
		System.out.println("STUDENT ID IS 200");
		System.out.println("STUDENT NAME IS "+name);
	}
}

class MainApp2
{
	public static void main(String[] args)
	{
		Student s1=new Student();

		Scanner sc1=new Scanner(System.in);

		System.out.println("SEARCH STUDENT BASED ON ");
		System.out.println("1: STUDENT ID \t\t 2: STUDENT NAME");
		int choice=sc1.nextInt();

		if(choice==1)
		{
			System.out.println("ENTER STUDENT ID");
			int id=sc1.nextInt();

			s1.searchStudent(id);
		}
		else if(choice==2)
		{
			System.out.println("ENTER STUDENT NAME");
			String name=sc1.next();

			s1.searchStudent(name);
		}

	}
}