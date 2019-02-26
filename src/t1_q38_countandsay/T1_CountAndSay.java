package t1_q38_countandsay;

public class T1_CountAndSay {
    public static String countAndSay(int n){
        StringBuilder s = new StringBuilder();
        s.append('1');
        for (int i = 2; i <= n; i++){
            int count = 0;
            char prev = '0';
            StringBuilder tmp = new StringBuilder();
            for (int j = 0 ; j<s.length();j++){
                if (prev == '0'){
                    prev = s.charAt(j);
                    count++;
                }
                else if (s.charAt(j) == prev) count++;
                else {
                    tmp.append(count);
                    tmp.append(prev);
                    prev = s.charAt(j);
                    count = 1;
                }
            }
            tmp.append(count);
            tmp.append(prev);
            s = tmp;
        }
        return s.toString();
    }

    public static void main(String[] args){
        System.out.println(countAndSay(4));
    }
}
