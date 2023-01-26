// TOWER OF HANOI

/*
output--> Move 1 from  A to B With the help of C
       	  Move 2 from  A to C With the help of B
   		  Move 1 from  B to C With the help of A
		  Move 3 from  A to B With the help of C
		  Move 1 from  C to A With the help of B
		  Move 2 from  C to B With the help of A
          Move 1 from  A to B With the help of C 

// NOTE --> A- source , B --> destination , C --> helper
*/


package recursion;

public class hanoi {

	public static void main(String[] args) {
		
		String src = "A";
		String dest = "B";
		String helper = "C";
		TOH(3,src,dest,helper);
	}
	public static void TOH(int n, String src, String dest , String helper ) 
	{
		if( n == 0) 
		{
			return;
		}
		TOH(n-1 ,src , helper , dest );
		System.out.println("Move " + n + " from  " + src + " to " + dest + " With thehelp of " + helper);
		TOH(n-1,helper,dest,src);
	}
}
