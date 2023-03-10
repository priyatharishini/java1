package javachallenge6;

import java.util.HashSet;
import java.util.Set;

public class JavaProblem7b 
{
	public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i <nums.length; i++) {
            if (set.contains(nums[i])) {
            	 
                return true;
            } else {
                set.add(nums[i]);
                System.out.println(set);
            }
        }
        return false;
        
	}


	public static void main(String[] args) {
		int[] nums =  {1,1,1,3,3,4,3,2,4,2};
        boolean result = containsDuplicate(nums);
        System.out.println(result);
	}

}
