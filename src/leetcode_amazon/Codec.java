package leetcode_amazon;

import java.util.HashMap;

public class Codec {
    HashMap<Integer,String> map;
    int count;

    public Codec(){
        map = new HashMap<>();
        count = 0;
    }

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        map.put(count,longUrl);
        return "http://tinyurl.com/"+ count++;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(Integer.parseInt(shortUrl.replace("http://tinyurl.com/","")));
    }

}
