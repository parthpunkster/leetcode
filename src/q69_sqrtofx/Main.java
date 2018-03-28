package q69_sqrtofx;

public class Main {
    public static int sqrt(int x) {
        long r = x;
        while (r*r > x)
            r = (r + x/r) / 2;
        return (int) r;
    }

    public static void main(String[] args){
        System.out.println(sqrt(9));
    }

}
