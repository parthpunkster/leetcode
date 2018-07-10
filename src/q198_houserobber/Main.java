package q198_houserobber;

public class Main {
    public static int rob(int[] nums){
        int rob = 0;
        int notrob = 0;
        for (int n: nums){
            int cur = notrob + n;
            notrob = Math.max(rob,notrob);
            rob = cur;
        }
        return Math.max(rob,notrob);
    }

    public static void main(String[] args){
        System.out.println(rob(new int[]{2,1,1,2}));
    }
}
