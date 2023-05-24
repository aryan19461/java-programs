package Oops_stud_intro;

public class Student_backend {
	String name;
	int age;
	int roll_No;
	int skills;
	String Skills;
	
	Student_backend(String n ,int a , int rn, int skil ,String Sk)
	{
		name = n;
		age = a;
		roll_No = rn;
		skills = skil;
		Skills = Sk;
	}
	public  void  intro() 
	{
		System.out.println("My name is " + name + "and my age is " + age + "and Roll no is " + roll_No);
	}
	public void qualiffications() throws Exception  
	{
		System.out.println("I have completed my education from st xaviers sr secondary school and urrently pursuing  my b-tech in computer science branch");
		if(skills == 0) 
		{
			throw new Exception("You don't have any skills");
		}
		System.out.println("SKills are = " + Skills);
	}
}
