package q168_excelsheetcolumntitle;

public class Main {

    public static String convertToTitle(int n){
        StringBuilder s = new StringBuilder();
        while ( n > 0){
            n--;
            s.insert(0,(char)('A'+(n%26)));
            n /= 26;
        }
        return s.toString();
    }

    public static void main(String[] args){
        System.out.println(convertToTitle(26));
    }
}
