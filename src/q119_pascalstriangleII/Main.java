package q119_pascalstriangleII;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static List<Integer> getRow(int rowIndex){
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        list.add(new LinkedList<Integer>());
        list.get(0).add(1);
        for (int i = 1; i<rowIndex+1; i++){
            List<Integer> row = new LinkedList<Integer>();
            List<Integer> prevRow = list.get(i-1);
            row.add(1);
            for (int j =1; j < i ; j++){
                row.add(prevRow.get(j-1)+prevRow.get(j));
            }
            row.add(1);
            list.add(row);
        }
        return list.get(rowIndex);
    }

    public static void main(String[] args){
        getRow(3);
    }
}
