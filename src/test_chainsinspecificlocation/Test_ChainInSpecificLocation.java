package test_chainsinspecificlocation;

import java.lang.reflect.Array;
import java.util.*;

public class Test_ChainInSpecificLocation {
    public static List<Chain> helper(List<Business> businesses, String location){
        HashSet<String> set = new HashSet<>();
        for (Business b : businesses){
            String s = b.name+"-"+b.location+"-"+b.id;
            set.add(s);
        }
        HashMap<String,Integer> map = new HashMap<>();
        for (String s : set){
            String[] lst = s.split("-");
            Business b = new Business(lst[0],lst[1],lst[2]);
            if (b.location.equals(location)){
                if (map.containsKey(b.name)){
                    map.put(b.name,map.get(b.name)+1);
                }
                else map.put(b.name,1);
            }
        }

        List<Chain> result = new ArrayList<>();

        for (Map.Entry<String,Integer> pair  : map.entrySet()){
            result.add(new Chain(pair.getKey(),pair.getValue()));
        }

        Collections.sort(result, new Comparator<Chain>() {
            @Override
            public int compare(Chain chain, Chain t1) {
                if (chain.count > t1.count) return -1;
                else if (chain.count < t1.count) return 1;
                return chain.name.compareTo(t1.name);
            }
        });
        return result;
    }

    public static void main(String[] args){
        List<Business> businesses = new ArrayList<>();
        Collections.addAll(businesses,new Business("Starbucks","Austin","102"),
        new Business("Walmart","sanjose","101"),
        new Business("Walmart","sanjose","101"),
        new Business("Walmart","sanjose","102"),
        new Business("Starbucks","sanjose","104"),
        new Business("Alpha","sanjose","101"),
        new Business("Alpha","sanjose","102"));

        System.out.println(helper(businesses,"sanjose"));
    }
}
