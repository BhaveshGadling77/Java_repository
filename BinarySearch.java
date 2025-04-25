
public class BinarySearch {

	/*
	 * static int BinarySearch(int []arr, int target){
	 * int st = 0,mid = 0;
	 * int end = arr.length-1;
	 * while(end>=st){
	 * mid = st + (end-st)/2;
	 * System.out.println(mid);
	 * if(arr[mid] == target){
	 * return mid;
	 * }
	 * else if(arr[mid]>target){
	 * st = mid+1;
	 * }
	 * else{
	 * end = mid-1;
	 * }
	 * 
	 * }
	 * 
	 * return -1;
	 * }
	 */

	static int BinarySearch(int[] arr, int target) {
		int st = 0, mid = 0;
		int end = arr.length - 1;
		while (end >= st) {
			mid = st + (end - st) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				st = mid + 1;
			} else {
				end = mid - 1;
			}

		}

		return st;
	}

	public static void main(String[] args) {
		// int[] array ={50,40,30,20,10,5};
		int[] array = { 1, 10, 20, 30, 40, 50 };
		int target = 5;
		int result = BinarySearch(array, target);
		if (result != -1)
			System.out.println("The target is at index : " + result);

		else
			System.out.println("The element is not found in The Array !!" + result);

	}
}