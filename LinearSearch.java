
import java.util.Arrays;

public class LinearSearch {

	/*
	 * static int LinearSearch(int []arr, int target){
	 * for(int i = 0; i<arr.length; i++){
	 * if(target== arr[i])
	 * return i;
	 * }
	 * return -1;
	 * }
	 * --> recursive approach
	 * static int LinearSearch(int []arr, int target,int indx){
	 * if(indx == arr.length){
	 * return -1;
	 * }
	 * if(target== arr[indx]){
	 * return indx;
	 * }
	 * 
	 * return LinearSearch(arr, target, indx+1);
	 * }
	 * static int BinarySearch(int []arr,int target){
	 * int s = 0;
	 * int e = arr.length-1;
	 * while(s<=e){
	 * int mid = (s+e)/2;
	 * // System.out.println("WHAT HAPPENED??");
	 * if(arr[mid]== target){
	 * return mid;
	 * }
	 * else if(arr[mid]<target){
	 * s = mid+1;
	 * }
	 * else e = mid -1;
	 * }
	 * return -1;
	 * }
	 */
	// --> recursive approach
	static int BinarySearch(int[] arr, int target, int end, int st) {
		if (end >= st) {
			int mid = st + (end - st) / 2;
			if (arr[mid] > target) {
				return BinarySearch(arr, target, mid - 1, st);

			} else if (arr[mid] < target) {
				return BinarySearch(arr, target, end, mid + 1);

			} else if (arr[mid] == target)
				return mid;
		}
		return -1;
	}

	public static void main(String[] args) {
		/*
		 * int []arr = {10,25,30,15,20};
		 * int target = 88;
		 * int result = LinearSearch(arr, target,0);
		 * if(result != -1)
		 * System.out.println("The element found at index = "+ result);
		 * 
		 * else
		 * System.out.println("The element doesn't found at any index of array !!");
		 * 
		 * int []arr = {10,15,20,25,30,40,8,53,45,50};
		 * Arrays.sort(arr);
		 * System.out.println(Arrays.toString(arr));
		 * int target = 50;
		 * int result = BinarySearch(arr, target);
		 * if(result != -1)
		 * System.out.println("The element found at index = "+ result);
		 * 
		 * else
		 * System.out.println("The element doesn't found at any index of array !!");
		 */
		int[] arr = { 10, 20, 30 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int target = 10;
		int result = BinarySearch(arr, target, arr.length - 1, 0);
		if (result != -1)
			System.out.println("The element found at index = " + result);

		else
			System.out.println("The element doesn't found at any index of array !!");
	}
}