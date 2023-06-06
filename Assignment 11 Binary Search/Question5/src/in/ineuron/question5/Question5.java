package in.ineuron.question5;
import java.util.*;
import java.util.stream.Collectors;

public class Question5 {
	public static int[] intersection(int[] nums1, int[] nums2) {
	    List<Integer> ans = new ArrayList<>();
	    Set<Integer> set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());

	    for (final int num : nums2)
	      if (set.remove(num))
	        ans.add(num);

	    return ans.stream().mapToInt(Integer::intValue).toArray();
	  }
	public static void main(String[] args) {
		int nums1[] = {1,2,2,1};
		int nums2[] = {2,2};
		System.out.println();
		for(int ele : intersection(nums1,nums2) )
		{
			System.out.println(ele);
		}
	}

}
