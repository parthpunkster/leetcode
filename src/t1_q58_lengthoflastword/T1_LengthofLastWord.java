package t1_q58_lengthoflastword;

public class T1_LengthofLastWord {
    public static int lengthOfLastWord(String s){
        if (s.length() == 0) return 0;
        String[] tmp = s.split(" ");
        if (tmp.length == 0) return 0;
        return tmp[tmp.length-1].length();
    }

    public static int lengthOfLastWord_Scratch(String s){
        int i = 0 ;
        int count = 0;
        int flag = 0;
        while (i < s.length()){
            if (s.charAt(i) == ' '){
                flag = 1;
            }
            else{
                if (flag == 1){
                    flag=0;
                    count=0;
                }
                count++;
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(lengthOfLastWord_Scratch("Hello World "));
    }
}
