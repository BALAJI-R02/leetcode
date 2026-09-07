// Last updated: 9/7/2026, 9:56:35 AM
1import java.util.HashMap;
2import java.util.Map;
3public class Codec {
4    private final Map<String, String> urlMap = new HashMap<>();
5    private int id = 0;
6    private static final String BASE_URL = "http://tinyurl.com/";
7    public String encode(String longUrl) {
8        id++;
9        String shortKey = Integer.toString(id);
10        urlMap.put(shortKey, longUrl);
11        return BASE_URL + shortKey;
12    }
13    public String decode(String shortUrl) {
14        String shortKey = shortUrl.replace(BASE_URL, "");
15        return urlMap.get(shortKey);
16    }
17}
18
19// Your Codec object will be instantiated and called as such:
20// Codec codec = new Codec();
21// codec.decode(codec.encode(url));