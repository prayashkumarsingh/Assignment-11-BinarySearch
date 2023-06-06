package in.ineuron.question8;

import java.util.*;

public class Question8 {
	public static int[] intersection(int[] nums1, int[] nums2) {
		if (nums1.length > nums2.length)
			return intersection(nums2, nums1);

		List<Integer> ans = new ArrayList<>();
		Map<Integer, Integer> count = new HashMap<>();

		for (final int num : nums1)
			count.put(num, count.getOrDefault(num, 0) + 1);

		for (final int num : nums2)
			if (count.containsKey(num) && count.get(num) > 0) {
				ans.add(num);
				count.put(num, count.get(num) - 1);
			}

		return ans.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
		int nums1[] = {4,9,5};
		int nums2[] = {9,4,9,8,4};
		System.out.println();
		for (int ele : intersection(nums1, nums2)) {
			System.out.println(ele);
		}
	}

}
