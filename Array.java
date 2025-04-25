import java.util.*;

public class Array {
	static int findFirst(int[] arr, int target) {
		int st = 0, mid = 0, fi = -1;
		int end = arr.length - 1;
		while (end >= st) {
			mid = st + (end - st) / 2;
			if (arr[mid] == target) {
				// return mid;
				fi = mid;
				end = mid - 1;
			} else if (arr[mid] < target) {
				st = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return fi;

	}

	static int findLast(int[] arr, int target) {
		int st = 0, mid = 0, li = -1;
		int end = arr.length - 1;
		while (end >= st) {
			mid = st + (end - st) / 2;
			if (arr[mid] == target) {
				// return mid;
				li = mid;
				st = mid + 1;
			} else if (arr[mid] < target) {
				st = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return li;

	}

	public static void main(String[] args) {
		int[] array = { 5, 6, 6, 7, 8, 8, 10, 12, 12 };
		int target = 5;
		int result = findFirst(array, target);
		if (result != -1)
			System.out.println("The target is at index : " + result);

		else
			System.out.println("The element is not found in The Array !!" + result);

	}

}