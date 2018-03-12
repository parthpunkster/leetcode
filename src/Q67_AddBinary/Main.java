package Q67_AddBinary;

public class Main {

    public static String addBinary(String a, String b){
//        int i = Integer.parseInt(a,2);
//        int j = Integer.parseInt(b,2);
//        return (i+j)

        int i =a.length()-1;
        int j =b.length()-1;
        int carry = 0;
        StringBuilder str = new StringBuilder();
        while (i >=0  && j >= 0){
            int tmp = Integer.parseInt(String.valueOf(a.charAt(i)))+Integer.parseInt(String.valueOf(b.charAt(j)))+carry;
            str.append(tmp%2);
            carry = tmp/2;
            i--;
            j--;
        }
        while (i >=0){
            int tmp = Integer.parseInt(String.valueOf(a.charAt(i)))+carry;
            str.append(tmp%2);
            carry = tmp/2;
            i--;
        }
        while (j >=0){
            int tmp = Integer.parseInt(String.valueOf(b.charAt(j)))+carry;
            str.append(tmp%2);
            carry = tmp/2;
            j--;
        }

        if (carry != 0){
            str.append(carry);
        }
        return str.reverse().toString();
    }

    public static void main(String[] args){
        String a = "1";
        String b = "111";
        System.out.println(addBinary(a,b));
    }

}
