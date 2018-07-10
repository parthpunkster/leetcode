package fbhackercup;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static class Attraction{
        String attractionName;
        int priority;
        int noOfTimesVisited;
        public Attraction(String attractionName, int priority){
            this.attractionName = attractionName;
            this.priority = priority;
            noOfTimesVisited = 0;
        }
    }

    public static String solution(int start, int n, int k, long v, List<Attraction> attractions){
        List<Attraction> tmp = new ArrayList<Attraction>();
        for (int i = 0; i<k; i++){
            tmp.add(attractions.get((start+i)%n));
        }
        tmp.sort(Comparator.comparing(attraction -> attraction.priority));
        StringBuilder res = new StringBuilder();
        for (Attraction s: tmp) {
            res.append(" ");
            res.append(s.attractionName);
        }
        return res.toString();
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/home/saktlonda/Desktop/leetcode/src/fbhackercup/tourist.txt");
        Scanner src = new Scanner(file);
        int t = Integer.parseInt(src.nextLine());
        int count = 1;
        while (count <= t) {
            String[] knv = src.nextLine().split(" ");
            int n = Integer.parseInt(knv[0]);
            int k = Integer.parseInt(knv[1]);
            long v = Long.parseLong(knv[2]);
            int ncounter = 0;
            List<Attraction> attractions = new ArrayList<Attraction>();
            while (ncounter < n) {
                attractions.add(new Attraction(src.nextLine(),ncounter));
                ncounter++;
            }
            int start = (int)(v%n);
            if (n > v){
                start -=1;
            }
            else if (n == v) {
                start = n-1;
            }
            else if (n < v){
                if (start == 0) start = n-1;
                else start = start+1;
            }
//            System.out.println(start);
            System.out.println("Case #"+count+":"+solution(start,n,k,v,attractions));
            count++;
        }
    }
}
