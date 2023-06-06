package in.ineuron.question7;

public class Question7 {
	public static int[] position(int[] nums, int target) {
	    final int l = search(nums, target);
	    if (l == nums.length || nums[l] != target)
	      return new int[] {-1, -1};
	    final int r = search(nums, target + 1) - 1;
	    return new int[] {l, r};
	  }
	  private static int search(int[] A, int target) {
	    int l = 0;
	    int r = A.length;
	    while (l < r) {
	      final int m = (l + r) / 2;
	      if (A[m] >= target)
	        r = m;
	      else
	        l = m + 1;
	    }
	    return l;
	  }

	  public static void main(String[] args) {
			int nums[] = {5,7,7,8,8,10};
			int target = 8;
			
			for(int ele : position(nums,target) )
			{
				System.out.println(ele);
			}
		}

}
