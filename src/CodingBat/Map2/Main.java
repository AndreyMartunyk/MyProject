package CodingBat.Map2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    }

    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, 0);
        }
        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, s.length());
        }
        return map;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String s : strings) {
            map.put(s.substring(0, 1), s.substring(s.length() - 1));
        }
        return map;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, 0);
        }
        for (String s : strings) {
            map.put(s, map.get(s) + 1);
        }
        return map;
    }

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String s : strings) {
            map.put(s.substring(0, 1), "");
        }
        for (String s : strings) {
            map.put(s.substring(0, 1), map.get(s.substring(0, 1)).concat(s));
        }
        return map;
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map =  new HashMap<>();
        for (String s : strings) {
            if (map.containsKey(s)) {
                map.put(s, true);
            }
            else {
                map.put(s, false);
            }
        }
        return map;
    }



}
