package com.leetcode.impl.code;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author huangbingyu
 * @description :
 *  Given nums = [2, 7, 11, 15], target = 9,
 *  Because nums[0] + nums[1] = 2 + 7 = 9,
 *  return [0, 1].
 * @date 2019/4/24
 */
public class TwoSum {
    /**
     * 1.遍历数组
     * 2.map中key 包含 nums[i]，则获取到目标下标,结束遍历
     * 3.否则，map key,value 分别存储 target-nums[i],i; 继续遍历
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> temp = new HashMap<>(nums.length);
        int res[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (temp.containsKey(nums[i])) {
                res[0] = temp.get(nums[i]);
                res[1] = i;
                break;
            }
            temp.put(target - nums[i], i);
        }

        return res;
    }

    public static int[] twoSum_8(int[] nums, int target) {
        return null;
    }

    public static void main(String[] args) {
        Arrays.stream(twoSum(new int[]{2, 7, 11, 12}, 9)).forEach(System.out::println);
    }
}
