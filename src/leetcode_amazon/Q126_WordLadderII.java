package leetcode_amazon;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class Q126_WordLadderII {

    public static void bfs(Map<String,Integer> distanceMap, Map<String,List<String>> transformationMap, String beginWord,String endWord, List<String> wordList, Map<String,List<String>> genericMap){
        Queue<String> queue = new LinkedBlockingQueue<>();
        queue.add(endWord);
        distanceMap.put(endWord,0);

        for(String s: wordList){
            transformationMap.put(s,new ArrayList<>());
        }

        while (!queue.isEmpty()){
            String curWord = queue.poll();
            if (curWord.equals(beginWord)) return;

            HashSet<String> nextWordSet = new HashSet<>();

            for (int i = 0 ; i <curWord.length();i++){
                StringBuilder tmp = new StringBuilder(curWord);
                tmp.deleteCharAt(i).insert(i,"*");
                if (genericMap.containsKey(tmp.toString())) nextWordSet.addAll(genericMap.get(tmp.toString()));
            }

            for(String word: nextWordSet){
                transformationMap.get(word).add(curWord);

                if (!distanceMap.containsKey(word)){
                    distanceMap.put(word,distanceMap.get(curWord)+1);
                    queue.add(word);
                }
            }
        }
    }

    public static void dfs(List<List<String>> result, Map<String, List<String>> transformationMap, List<String> ladder, Map<String, Integer> distanceMap, String currWord, String endWord){
        ladder.add(currWord);
        if(currWord.equals(endWord)) result.add(new ArrayList<>(ladder));

        for (String word: transformationMap.get(currWord)){
            if (distanceMap.containsKey(word) && distanceMap.get(currWord) == distanceMap.get(word)+1){
                dfs(result,transformationMap,ladder,distanceMap,word,endWord);
            }
        }
        ladder.remove(ladder.size()-1);
    }

    public static List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList){
        Map<String,Integer> distanceMap = new HashMap<>();
        Map<String,List<String>> transformationMap = new HashMap<>();

        wordList.add(beginWord);
        wordList.add(endWord);

        Map<String,List<String>> genericMap = new HashMap<>();
        for (String s: wordList){
            for(int i = 0 ; i<beginWord.length();i++){
                StringBuilder tmp = new StringBuilder(s);
                tmp.deleteCharAt(i).insert(i,"*");
                if (genericMap.containsKey(tmp.toString())) genericMap.get(tmp.toString()).add(s);
                else genericMap.put(tmp.toString(),new ArrayList<>(){{add(s);}});
            }
        }


        bfs(distanceMap,transformationMap,beginWord,endWord,wordList,genericMap);

        List<List<String>> result = new ArrayList<>();

        dfs(result,transformationMap,new ArrayList<>(),distanceMap,beginWord,endWord);
        return result;
    }


    public static void main(String[] args) {
        List<String> l = new ArrayList<>(){{add("hot");add("dot");add("dog");add("lot");add("log");add("cog");}};
        System.out.println(findLadders("hit","cog",l));
    }
}
