package t1_q374_guessnumberhigherorlower;

public class T1_GuessNumberHigherorLower {
    public static int guess(int n){
        if (n==6) return 0;
        if (n >6) return -1;
        return 1;
    }

    public static int guessNumber_iterrative(int n){
        int left = 1, right = n;
        while (left <= right){
            int mid = left + (right-left)/2;
            int resultFromApi = guess(mid);
            if (resultFromApi == 0) return mid;
            else if (resultFromApi == -1) right = mid-1;
            else left = mid+1;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(guessNumber_iterrative(10));
    }
}
