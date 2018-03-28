package q118_pascalstriangle;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        if (numRows == 0){
            return list;
        }
        list.add(new LinkedList<Integer>());
        list.get(0).add(1);
        for (int i = 1; i<numRows ; i++){
            List<Integer> row = new LinkedList<Integer>();
            List<Integer> prevrow = list.get(i-1);
            row.add(1);
            for (int j = 1; j < i; j++){
                row.add(prevrow.get(j-1)+prevrow.get(j));
            }
            row.add(1);
            list.add(row);
        }
        return list;
    }

    public static void main(String[] args){
        generate(3);
    }
}
