package leetcode_amazon;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Q295_FindMedianfromDataStream {
    public static int bs(List<Integer> nums,int start, int end, int target){
        if(start >= end){
            if (nums.get(start) == target) return start;
            else if(target > nums.get(start)) return start+1;
            return start;
        }

        int mid = start + (end - start) / 2;
        if (nums.get(mid) == target) return mid;
        else if(target < nums.get(mid)) return bs(nums,start,mid-1,target);
        else return bs(nums,mid+1,end,target);
    }

    public static void main(String[] args) {
//        MedianFinder list = new MedianFinder();
//        list.addNum(-1);
//        System.out.println(list.findMedian());
//        list.addNum(-2);
//        System.out.println(list.findMedian());
//        list.addNum(-3);
//        System.out.println(list.findMedian());
//        list.addNum(-4);
//        System.out.println(list.findMedian());
//        list.addNum(-5);
//        System.out.println(list.findMedian());
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(10);
        System.out.println(bs(list,0,list.size()-1,4));
    }
}
