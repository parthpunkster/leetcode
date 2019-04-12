package leetcode_amazon;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Q139_WordBreak {
    public static boolean breakTheWords(String s, List<String> set, int start, Boolean[] memo){
        if(start == s.length()) return true;

        if (memo[start] != null) return memo[start];

        for (int i = start; i < s.length();i++){
            if (set.contains(s.substring(start,i+1)) && breakTheWords(s,set,i+1,memo)){
                return memo[start] = true;
            }
        }
        return false;
    }

    public static boolean wordBreak(String s, List<String> wordDict){
        return breakTheWords(s,wordDict,0, new Boolean[s.length()]);
    }

    public static boolean wordBreak_bfs(String s, List<String> wordDict){
        HashSet<String> set = new HashSet<>(wordDict);
        Queue<Integer> queue = new LinkedBlockingQueue<>();
        int[] visited = new int[s.length()];

        queue.add(0);
        while (!queue.isEmpty()){
            int start = queue.remove();
            if (visited[start] == 0){
                for(int end = start+1;end<=s.length();end++){
                    if (set.contains(s.substring(start,end))){
                        queue.add(end);
                        if (end == s.length()) return true;
                    }
                }
                visited[start] = 1;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        List<String > l = new ArrayList<>();
        l.add("leet");
        l.add("code");
        System.out.println(wordBreak_bfs("leetcode",l));
    }
}
