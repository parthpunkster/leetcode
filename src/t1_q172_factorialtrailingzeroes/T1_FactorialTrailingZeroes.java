package t1_q172_factorialtrailingzeroes;

public class T1_FactorialTrailingZeroes {
    public static int trailingZeroes(int n){
        return n == 0 ? 0 : n/5 + trailingZeroes(n/5);
    }


    public static void main(String[] args){
        System.out.println(trailingZeroes(30));
    }
}
