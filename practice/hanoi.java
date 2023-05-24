package practice;

public class hanoi {

	public static void main(String[] args) {
		String src = "A";
		String dest = "B";
		String helper = "C";
		hanoi(3,src,dest,helper);
	}
	public static void hanoi(int n,String src,String dest,String helper) 
	{
		if(n==0) 
		{
			return;
		}
		hanoi(n-1,src,helper,dest);
		System.out.println("Moving " + n +" from "+ src+ " to " + dest + " with the help of "+  helper);
		hanoi(n-1,helper,dest,src);
	}

}
