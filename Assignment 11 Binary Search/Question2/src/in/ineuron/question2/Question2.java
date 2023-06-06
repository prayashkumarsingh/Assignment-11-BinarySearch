package in.ineuron.question2;

public class Question2 {
	class PeakElement {
		static int peekEle(int arr[], int low, int high, int n) {
			int mid = low + (high - low) / 2;
			if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid]))
				return mid;
			else if (mid > 0 && arr[mid - 1] > arr[mid])
				return peekEle(arr, low, (mid - 1), n);
			else
				return peekEle(arr, (mid + 1), high, n);
		}

		static int findPeakEle(int arr[], int n) {
			return peekEle(arr, 0, n - 1, n);
		}

		public static void main(String[] args) {
			int arr[] = {1,2,3,1};
			int n = arr.length;
			System.out.println("Index of a peak point is " + findPeakEle(arr, n));
		}
	}

}
