package q136_singlenumber;

import java.util.Arrays;
import java.util.HashMap;

public class Main {

//    public static int singleNumber(int[] nums){
//        Arrays.sort(nums);
//        int i =0;
//        for (i = 0; i< nums.length-1;i = i+2){
//            if (nums[i] != nums[i+1]){
//                break;
//            }
//        }
//        return nums[i];
//    }

    public static int singleNumber(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i< nums.length; i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else {
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for (int k: map.keySet()) {
            if (map.get(k) == 1){
                return k;
            }
        }
        return 0;
    }

    public static void main(String[] args){
        int[] array = new int[]{4,1,5,2,4,1,5};
        System.out.println(singleNumber(array));
    }
}
