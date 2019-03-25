package t1_q168_excelsheetcolumntitle;

public class T1_ExcelSheetColumnTitle {
    public static String convertTotitle(int n){
        StringBuilder result = new StringBuilder();
        while (n >0){
            n--;
            result.insert(0,(char)('A'+ n%26));
            n /= 26;
        }
        return result.toString();
    }

    public static void main(String [] args){
        System.out.println(convertTotitle(701));
    }
}
