package t1_q118_pascalstriangle;

import java.util.ArrayList;
import java.util.List;

public class T1_PascalsTriangle {
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) return result;
        result.add(new ArrayList<>());
        result.get(0).add(1);
        for (int i = 1; i < numRows;i++){
            result.add(new ArrayList<>());
            result.get(i).add(1);
            for(int j = 1; j < i; j++){
                result.get(i).add(result.get(i-1).get(j) + result.get(i-1).get(j-1));
            }
            result.get(i).add(1);
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(generate(5));
    }
}
