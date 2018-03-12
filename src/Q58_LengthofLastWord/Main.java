package Q58_LengthofLastWord;

public class Main {

//    public static int lengthOfLastWord(String s){
//        String[] tmp = s.split("\\s+");
////        System.out.println(tmp[0]);
//        return tmp[tmp.length-1].length();
//    }

    public static int lengthOfLastWord(String s){
        int len = 0;
        int flag = 0;
        for (int i = 0; i<s.length();i++){
            if (s.charAt(i) == ' '){
                flag = 0;
            }
            else {
                if (flag == 0){
                    flag=1;
                    len = 0;
                }
                len++;
            }
        }
        return len;
    }

    public static void main(String[] args){
        String s= "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
}
