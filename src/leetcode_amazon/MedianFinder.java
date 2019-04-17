package leetcode_amazon;

import java.util.ArrayList;
import java.util.List;

public class MedianFinder {
    /** initialize your data structure here. */
    List<Integer> list;
    public MedianFinder() {
        list = new ArrayList<>();
    }

    public int bs(List<Integer> nums,int start, int end, int target){
        if(start >= end){
            if (nums.get(start) == target) return start;
            else if(target > nums.get(start)) return start+1;
            return start-1;
        }

        int mid = start + (end - start) / 2;
        if (nums.get(mid) == target) return mid;
        else if(target < nums.get(mid)) return bs(nums,start,mid-1,target);
        else return bs(nums,mid+1,end,target);
    }

    public void addNum(int num) {
        if (list.isEmpty()) list.add(num);
        else {
            int index = bs(list, 0, list.size() - 1, num);
            if (index < 0) list.add(0,num);
            else list.add(index, num);
        }
    }

    public double findMedian() {
        int mid = list.size()/2;
        if (list.size()%2 == 0){
            return (list.get(mid) + list.get(mid-1)) / 2.0;
        }
        return list.get(mid);
    }
}
