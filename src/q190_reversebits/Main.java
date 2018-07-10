package q190_reversebits;

public class Main {
    public static int reverseBits(int n){
        int result = 0;
        for (int i =0; i<32; i++){
            result = result + n&1;
            n >>>=1;
        }


//        System.out.println(n & 1);
        return 0;
    }

    public static void main(String[] args){
        reverseBits(43261596);
    }
}
