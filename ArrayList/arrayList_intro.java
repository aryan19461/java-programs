package ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class arrayList_intro {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		// [1,2,3,4,5]
		
		list.add(2, 10);
		System.out.println(list);
		//[1, 2, 10, 3, 4, 5] --> places 10 on 2nd index moves 3,4,5th toward right
		
		list.remove(1); // removes 1st index element
		System.out.println(list);
		//[1, 10, 3, 4, 5] 
		
		list.set(1, 20); // changes the 1st index value to 20   -- NOTE--> does not adds value instead changes 
		System.out.println(list);
		//	[1, 20, 3, 4, 5]
		
		//iterating Arraylist using loop
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list2 = new ArrayList<>();
		
		for (int i = 0; i <=5; i++) 
		{
			list2.add(sc.nextInt());
		}
		
		for (int i = 0; i < list2.size(); i++)
		{
			System.out.println(list.get(i));
		}
	}

}
