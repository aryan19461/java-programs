package Arrays;

public class min_no {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 3, 4, -6, 4, -3, 11, 5 };
		
		System.out.println(Minvalue(arr));

	}

	public static int Minvalue(int[] arr) {

		int mini = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[mini]) {
				mini = i;
			}
		}

		return mini;

	}
}
