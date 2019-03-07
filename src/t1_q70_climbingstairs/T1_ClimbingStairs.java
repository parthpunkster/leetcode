package t1_q70_climbingstairs;

public class T1_ClimbingStairs {
    public static int climbStairs_recursive(int n){
        if (n < 0) return 0;
        if (n==0) return 1;
        int c1 = climbStairs_recursive(n-1);
        int c2 = climbStairs_recursive(n-2);
        return c1+c2;
    }

    public static int climbStairs_progression(int n){
        if (n==1) return 1;
        int[] array = new int[n+1];
        array[1] = 1;
        array[2]  =2;
        for (int i = 3; i<= n; i++){
            array[i] = array[i-1] + array[i-2];
        }
        return array[n];
    }

    public static void main(String[] args){
        System.out.println(climbStairs_progression(4));
    }
}
