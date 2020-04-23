package leetcode.dublesum;
import org.junit.Test;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 找出数组中和为9的两个数字的下标.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-23 10:36
 **/
public class Tests {

    private static int nums[] = {3,2,4};
    private static int target = 6;

    /*

    给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

    你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

    示例:

    给定 nums = [2, 7, 11, 15], target = 9
        nums = [3,2,4], target = 6
        nums = [3,3], target = 6
    因为 nums[0] + nums[1] = 2 + 7 = 9
    所以返回 [0, 1]

    */
    @Test
    public void test3(){
        int nums[] = {3,2,4};
        int target = 6;
        test1(nums,target);
    }

    public int[] test1(int[] nums, int target) {

        Map<Integer,Object> map = new HashMap<>();;

        Map<Integer,Integer> m;
        //nums = [3,2,4], target = 6
        for (int i = 0; i < nums.length; i++) {
            m = new HashMap<>();
            int tmp = target - nums[i];
            m.put(-1,tmp);
            m.put(i,nums[i]);
            map.put(i,m);
        }
        int[] res ={};
        map.forEach((k,v)->{
            Map<Integer,Integer> v1 = (Map<Integer, Integer>) v;
            v1.forEach((o,p)->{

            });
        });
        return null;
    }
    public int[] test(int[] nums, int target) {
        //临时变量
        int tmp;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
        }
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            tmp = target - nums[i];
            if(tmp == nums[i]){
                continue;
            }
            Object a = getk(map, tmp);
            if (a != null) {
                if(!list.contains(getk(map,nums[i]))){
                    list.add(getk(map,nums[i]));
                }
                if(!list.contains(getk(map,tmp))){
                    list.add(getk(map,tmp));
                }
            }

        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = (Integer) list.get(i);
        }
        return res;
    }

    Object getk(Map map,Object value){
        AtomicReference<Object> res = new AtomicReference<>();
        map.forEach((k, v)->{
            if(v.equals(value)){
                res.set(k);
                return;
            }
        });
        return res.get();
    }

    @Test
    public void test() {



        /*List<Integer> lists = new ArrayList <>();
        for (int num : nums) {
            lists.add(num);
        }

        System.out.println(lists.contains(7));*/
        int[] res = test(nums, target);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }
}
