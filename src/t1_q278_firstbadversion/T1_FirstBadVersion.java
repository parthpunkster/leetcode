package t1_q278_firstbadversion;

import java.util.HashSet;

public class T1_FirstBadVersion {
    public static boolean isBadVersion(int n){
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(4);
        return set.contains(n);
    }

    public static int firstBadVersion_support_recurssion(int start, int end){
        if (start >= end){
            if (isBadVersion(start)) return start;
            return start+1;
        }
        int mid = start + (end-start)/2;
        if(isBadVersion(mid)) return firstBadVersion_support_recurssion(start,mid-1);
        return firstBadVersion_support_recurssion(mid+1,end);
    }

    public static int firstBadVersion(int n){
        return firstBadVersion_support_recurssion(1,n);
    }


    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }
}
