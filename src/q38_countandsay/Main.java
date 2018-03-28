package q38_countandsay;

public class Main {

    public static String countAndSay(int n){
        StringBuilder str = new StringBuilder();
        str.append((char) '1');
        for (int i = 2; i<=n;i++) {
            char prev = '0';
            int count = 0;
            StringBuilder tmp = new StringBuilder();
            for (int j = 0; j<str.length();j++){
                if (str.charAt(j) == prev) {
                    count++;
                }
                else if(j==0){
                    prev = str.charAt(j);
                    count++;
                }
                else {
                    tmp.append(count);
                    tmp.append(prev);
                    count = 1;
                    prev = str.charAt(j);
                }
            }
            tmp.append(count);
            tmp.append(prev);
            str = tmp;
        }
        return str.toString();
    }

    public static void main(String args[]){
        System.out.println(countAndSay(2));
//        StringBuilder t = new StringBuilder();
//        t.append(1);
//        System.out.println(t.toString());
    }
}
