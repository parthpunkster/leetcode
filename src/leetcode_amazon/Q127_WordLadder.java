package leetcode_amazon;

import java.security.KeyPair;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;


public class Q127_WordLadder {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList){
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str : wordList){
            for(int i = 0 ; i<str.length();i++){
                StringBuilder s = new StringBuilder(str);
                s.deleteCharAt(i);
                s.insert(i,"*");
                if (map.containsKey(s.toString())) map.get(s.toString()).add(str);
                else map.put(s.toString(),new ArrayList<>(){{add(str);}});
            }
        }

        Queue<Pair> queue = new LinkedBlockingQueue<>();
        queue.add(new Pair(beginWord,1));

        HashSet<String> visited = new HashSet<>();
        visited.add(beginWord);

        while (!queue.isEmpty()){
            Pair word = queue.remove();
            List<String> l = new ArrayList<>();
            for (int i = 0 ; i<word.v1.length();i++){
                StringBuilder s = new StringBuilder(word.v1);
                s.deleteCharAt(i);
                s.insert(i,'*');
                l.add(s.toString());
            }
            for(String generic : l){
                if (map.containsKey(generic)){
                    for(String w : map.get(generic)){
                        if (w.equals(endWord)) return word.v2+1;
                        if (!visited.contains(w)) {
                            queue.add(new Pair(w,word.v2+1));
                            visited.add(w);
                        }
                    }
                }
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(ladderLength("hit","cog",new ArrayList<>(){{add("hot");add("dot");add("dog");;add("lot");add("log");add("cog");}}));

    }
}
