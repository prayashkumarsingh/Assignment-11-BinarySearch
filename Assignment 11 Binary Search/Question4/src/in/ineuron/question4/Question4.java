package in.ineuron.question4;

public class Question4 {
	public static int duplicate(int[] nums) {
	    int slow = nums[nums[0]];
	    int fast = nums[nums[nums[0]]];

	    while (slow != fast) {
	      slow = nums[slow];
	      fast = nums[nums[fast]];
	    }

	    slow = nums[0];

	    while (slow != fast) {
	      slow = nums[slow];
	      fast = nums[fast];
	    }

	    return slow;
	  }
	public static void main(String[] args) {
		int nums[] = {1,3,4,2,2};
		System.out.println(duplicate(nums));
	}

}
