package t1_q412_fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class T1_FizzBuzz {
    public static List<String> fizzbuzz(int n){
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n ; i++){
            if (i % 15 == 0) result.add("FizzBuzz");
            else if (i%3 == 0) result.add("Fizz");
            else if (i%5 == 0) result.add("Buzz");
            else result.add(Integer.toString(i));
        }
        return result;
    }


    public static void main(String[] args){
        System.out.println(fizzbuzz(15));
    }
}
