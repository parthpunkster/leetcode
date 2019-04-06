package t1_q292_nimgame;

public class T1_NimGame {
    public static boolean canWinNim(int n){
        if (n%4 == 0) return false;
        return true;
    }


    public static void main(String[] args) {
        System.out.println(canWinNim(4));
    }
}
