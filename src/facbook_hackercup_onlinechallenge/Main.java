package facbook_hackercup_onlinechallenge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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


    public static String solution(int n, int k, long v, List<Attraction> attractions){
        List<Attraction> tmpArray = new ArrayList<Attraction>();
        for (long i = 1; i<=v; i++){
            tmpArray = new ArrayList<Attraction>();
            for (int j = 0; j<k; j++){
                Attraction tmp = attractions.get(0);
                attractions.remove(0);
                attractions.add(tmp);
                tmpArray.add(tmp);
            }
        }
        tmpArray.sort(Comparator.comparing(attraction -> attraction.priority));
        StringBuilder res = new StringBuilder();
        for (Attraction s: tmpArray) {
            res.append(" ");
            res.append(s.attractionName);
        }
        return res.toString();
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/home/saktlonda/Desktop/leetcode/src/facbook_hackercup_onlinechallenge/tourist.txt");
        Scanner src = new Scanner(file);
        int t = Integer.parseInt(src.nextLine());
        int count = 1;
        while (count <= t){
            String[] knv = src.nextLine().split(" ");
            int k = Integer.parseInt(knv[0]);
            int n = Integer.parseInt(knv[1]);
            long v = Long.parseLong(knv[2]);
            int kcounter = 0;
            List<Attraction> attractions = new ArrayList<Attraction>();
            while (kcounter < k){
                attractions.add(new Attraction(src.nextLine(),kcounter+1));
                kcounter++;
            }
            System.out.println("Case #"+count+":"+solution(k,n,v,attractions));
            count++;
        }

//        String[] array = new String[]{"LikeSign","Arcade","SweetStop","swagstore"};
//        List<Attraction> attractions = new ArrayList<Attraction>();
//        for (int i = 0;i<array.length; i++){
//            attractions.add(new Attraction(array[i],i+1));
//        }
//        attractions.remove(0);
//        attractions.remove(0);
//        for (Attraction attraction:attractions) System.out.println(attraction.attractionName);
//        attractions.get(0).noOfTimesVisited += 2;
//        attractions.get(1).noOfTimesVisited += 1;
//        attractions.get(2).noOfTimesVisited += 1;
//        System.out.println(solution(2,1,1000000000000L,attractions));



    }
}