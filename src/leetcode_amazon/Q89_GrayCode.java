package leetcode_amazon;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class Q89_GrayCode {
    public static List<Integer> grayCode(int n){
        List<Integer> list = new ArrayList<>();
        list.add(0);
        for(int i = 0;i<n;i++){
            int x = 1 << i;
            for(int j = list.size()-1; j >=0;j--){
                list.add(x+list.get(j));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(grayCode(0));
    }
}
