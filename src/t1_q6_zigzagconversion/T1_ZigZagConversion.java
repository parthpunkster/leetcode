package t1_q6_zigzagconversion;

import java.util.ArrayList;

public class T1_ZigZagConversion {
    public static String convert_sortByRow(String s, int numRows){
        if(numRows==1) return s;
        ArrayList<StringBuilder> rows = new ArrayList<>();
        for (int i = 0 ; i < Math.min(numRows,s.length());i++){
            rows.add(new StringBuilder());
        }

        boolean goingDown = false;
        int curRow = 0;
        for(char c:s.toCharArray()){
            rows.get(curRow).append(c);
            if (curRow ==0 || curRow == numRows-1) goingDown = !goingDown;
            curRow += goingDown ? 1:-1;
        }

        StringBuilder res = new StringBuilder();
        for(StringBuilder row:rows){
            res.append(row);
        }
        return res.toString();
    }


    public static void main(String[] args) {
        System.out.println(convert_sortByRow("PAYPALISHIRING",3));
    }
}
