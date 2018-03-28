package q70_climbingstairs;

public class Main {

    public static int climbStairs1(int n){
        if (n == 0) {
            return 1;
        }
        if (n <0){
            return 0;
        }
        int s1 = climbStairs1(n-1);
        int s2 = climbStairs1(n-2);
        return s1+s2;
    }

    public static int climbStairs(int n){
        if (n == 1){
            return 1;
        }
        int[] tmp = new int[n+1];
        tmp[1] = 1;
        tmp[2] = 2;
        for (int i = 3; i<=n; i++){
            tmp[i] = tmp[i-1]+tmp[i-2];
        }
        return tmp[n];
    }

    public static void main(String[] args){
        System.out.println(climbStairs(44));
        System.out.println(climbStairs1(44));
    }
}
