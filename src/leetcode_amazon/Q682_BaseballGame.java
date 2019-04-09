package leetcode_amazon;

import java.util.ArrayList;

public class Q682_BaseballGame {
    public static int calPoints(String[] ops){
        ArrayList<Integer> scores = new ArrayList<>();
        for(String op : ops){
            if (op.equals("+")){
                scores.add(scores.get(scores.size()-1)+scores.get(scores.size()-2));
            }
            else if (op.equals("D")){
                scores.add(scores.get(scores.size()-1)*2);
            }
            else if(op.equals("C")){
                scores.remove(scores.size()-1);
            }
            else {
                scores.add(Integer.parseInt(op));
            }
        }
        int sum = 0 ;
        for (int score : scores){
            sum+=score;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calPoints(new String[]{"5","-2","4","C","D","9","+","+"}));
    }
}
