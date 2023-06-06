package in.ineuron.question3;

public class Question3 {
	public static int missing(int[] nums) {
	    int ans = nums.length;

	    for (int i = 0; i < nums.length; ++i)
	      ans ^= i ^ nums[i];

	    return ans;
	  }

	public static void main(String[] args) {
		int nums[] = {3,0,1};
		System.out.println(missing(nums));
	}

}
