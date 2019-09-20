
/**
 * Write a description of class Recursión2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Recursión2
{
    public boolean groupSum(int start, int[] nums, int target) {
        if (start == nums.length) {
            return target == 0;
        } else {
            return groupSum (start + 1, nums, target) || groupSum (start + 1, nums, target - nums[start]); 
        }
    }

    public boolean groupSum6(int start, int[] nums, int target) {
        if (start == nums.length) {
            return target == 0;
        } else {
            if (nums [start] == 6) {
                return groupSum6 (start + 1, nums, target - nums [start]);
            } else {
                return groupSum6 (start + 1, nums, target) || groupSum6 (start + 1, nums, target - nums [start]); 
            }
        }
    }

    public boolean groupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0; 
        } else {
            return groupNoAdj(start + 1, nums, target) || groupNoAdj(start + 2, nums, target - nums [start]);
        }
    }

    public boolean groupSum5(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        } else {
            if (start < nums.length - 1) {
                if (nums [start] % 5 == 0 && nums [start+1] == 1) {
                    return groupSum5 (start + 2, nums, target - nums [start]);
                } else if (nums [start] % 5 == 0 && nums [start+1] != 1) {
                    return groupSum5 (start + 1, nums, target - nums [start]);
                }
                else {
                    return groupSum5 (start + 1, nums, target) || groupSum5 (start + 1, nums, target - nums [start]); 
                } 
            } else {
                if (nums [start] % 5 == 0) {
                    return groupSum5 (start + 1, nums, target - nums [start]);
                } else {
                    return groupSum5 (start + 1, nums, target) || groupSum5 (start + 1, nums, target - nums [start]); 
                } 
            }

        }
    }

    public boolean splitArray(int[] nums) {
        int cont = 0;
        int sum1 = 0;
        int sum2 = 0;
        return newSplitArray (nums, cont, sum1, sum2);
    }

    private boolean newSplitArray (int [] nums, int cont, int sum1, int sum2) {
        if (cont == nums.length) {
            return sum1 == sum2;
        } else {
            return newSplitArray (nums, cont + 1, sum1 + nums [cont], sum2) || 
            newSplitArray (nums, cont + 1, sum1, sum2 + nums [cont]);
        }
    }
}
