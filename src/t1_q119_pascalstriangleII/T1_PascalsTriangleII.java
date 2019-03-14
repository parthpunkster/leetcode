package t1_q119_pascalstriangleII;

import java.util.List;
import java.util.ArrayList;

public class T1_PascalsTriangleII {
    public static List<Integer> getRow_optimized(int rowIndex){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i<= rowIndex; i++){
            result.add(0,1);
            for (int j = 1; j < result.size()-1;j++){
                result.set(j,result.get(j)+result.get(j+1));
            }
        }
        return result;
    }

    public static List<Integer> getRow_bruteforce(int rowIndex){
        List<List<Integer>> result = new ArrayList<>();
        if(rowIndex < 0) return new ArrayList<Integer>();
        result.add(new ArrayList<>());
        result.get(0).add(1);
        for (int i = 1 ; i <= rowIndex; i++){
            result.add(new ArrayList<>());
            result.get(i).add(1);
            for (int j = 1 ; j < i;j++){
                result.get(i).add(result.get(i-1).get(j) + result.get(i-1).get(j-1));
            }
            result.get(i).add(1);
        }
        return result.get(rowIndex);
    }

    public static void main(String[] args){
        System.out.println(getRow_bruteforce(4));
    }
}
